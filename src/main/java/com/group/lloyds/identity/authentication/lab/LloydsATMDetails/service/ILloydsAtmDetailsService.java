package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.service;

import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.ATMDetails;

import java.net.URISyntaxException;

public interface ILloydsAtmDetailsService {
    public ATMDetails getAtmDetails(final String url) throws URISyntaxException;
}
