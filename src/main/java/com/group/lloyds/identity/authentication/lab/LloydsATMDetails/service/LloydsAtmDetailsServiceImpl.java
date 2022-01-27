package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.service;

import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.ATMDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class LloydsAtmDetailsServiceImpl implements  ILloydsAtmDetailsService{

    @Override
    public ATMDetails getAtmDetails(final String url) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(url);

        ResponseEntity<ATMDetails> result = restTemplate.getForEntity(uri, ATMDetails.class);
        ATMDetails endResult = result.getBody();
        return endResult;
    }
}
