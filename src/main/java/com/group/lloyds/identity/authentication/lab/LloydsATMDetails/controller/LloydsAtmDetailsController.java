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
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/atm-service")
public class LloydsAtmDetailsController {

    private final Logger log = LoggerFactory.getLogger(LloydsAtmDetailsController.class);

    @GetMapping("/getATMInfo")
    public ResponseEntity<?> getATMInformation(@RequestParam final String identifier,@RequestParam final String url) throws IOException, URISyntaxException {

        Atm response = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            URI uri = new URI(url);
            ResponseEntity<ATMDetails> result = restTemplate.getForEntity(uri, ATMDetails.class);
            ATMDetails endResult = result.getBody();

            List<Brand> brands = endResult.getData().stream().flatMap(list -> list.getBrand().stream()).collect(Collectors.toList());
            List<Atm> newAtms = brands.stream().flatMap(list -> list.getAtm().stream()).collect(Collectors.toList());
            response = newAtms.stream().filter(item -> identifier.equalsIgnoreCase(item.getIdentification())).findFirst().get();
        }catch (URISyntaxException ex) {
            //return new ResponseEntity<>(ex.getMessage() + "[" + identifier + "]", HttpStatus.NOT_FOUND);
            AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(HttpStatus.NOT_FOUND, ex.getMessage(), LloydsATMErrorConstants.URL_NOT_VALID);
            return new ResponseEntity<>(atmCustomExceptions,HttpStatus.NOT_FOUND);
            //ex.getStatusCode(), ex.getMessage(),"ORDER_DETAILS_NOT_FOUND"
        }catch (NoSuchElementException ex) {
            //return new ResponseEntity<>(ex.getMessage() + "[" + identifier + "]", HttpStatus.NOT_FOUND);
            AtmCustomExceptions atmCustomExceptions = new AtmCustomExceptions(HttpStatus.NOT_FOUND, ex.getMessage(), LloydsATMErrorConstants.IDENTIFICATION_NOT_FOUND);
            return new ResponseEntity<>(atmCustomExceptions,HttpStatus.NOT_FOUND);
            //ex.getStatusCode(), ex.getMessage(),"ORDER_DETAILS_NOT_FOUND"
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}