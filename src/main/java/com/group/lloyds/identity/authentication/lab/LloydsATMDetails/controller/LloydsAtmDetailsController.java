package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.controller;

import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.constants.LloydsATMErrorConstants;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.exceptions.AtmCustomExceptions;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.ATMDetails;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.Atm;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.Brand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/atm-service")
public class LloydsAtmDetailsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LloydsAtmDetailsController.class);


    @GetMapping("/getATMInfo")
    public ResponseEntity<?> getATMInformation(@RequestParam final String identifier,@RequestParam final String url) {

        Atm response = null;
       try {
            RestTemplate restTemplate = new RestTemplate();
            URI uri = new URI(url);

            ResponseEntity<ATMDetails> result = restTemplate.getForEntity(uri, ATMDetails.class);
            ATMDetails endResult = result.getBody();

            List<Brand> brands = endResult.getData().stream().flatMap(list -> list.getBrand().stream()).collect(Collectors.toList());
            List<Atm> newAtms = brands.stream().flatMap(list -> list.getAtm().stream()).collect(Collectors.toList());
            response = newAtms.stream().filter(item -> identifier.equalsIgnoreCase(item.getIdentification())).findFirst().get();

           LOGGER.info("Identification : " + response.getIdentification());
           LOGGER.info("ATM Details : " + response.getLocation());

       }catch (NoSuchElementException exception) {

           AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(exception.getMessage(),LloydsATMErrorConstants.IDENTIFICATION_NOT_FOUND, new Date());
           return new ResponseEntity<Object>(atmCustomExceptions, HttpStatus.NOT_FOUND);

       }catch(HttpClientErrorException exception){
           AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(exception.getMessage(),LloydsATMErrorConstants.URL_NOT_VALID, new Date());
           return new ResponseEntity<Object>(atmCustomExceptions, HttpStatus.NOT_FOUND);

        }catch (HttpServerErrorException exception){
           AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(exception.getMessage(),LloydsATMErrorConstants.SERVER_EXP, new Date());
           return new ResponseEntity<Object>(atmCustomExceptions, HttpStatus.INTERNAL_SERVER_ERROR);
       } catch (Exception exception){
           AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(exception.getMessage(),LloydsATMErrorConstants.BAD_REQUEST_MESSAGE, new Date());
           return new ResponseEntity<Object>(atmCustomExceptions, HttpStatus.BAD_REQUEST);
       }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}