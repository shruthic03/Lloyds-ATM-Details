package com.group.lloyds.identity.authentication.lab.LloydsATMDetails;

import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.controller.LloydsAtmDetailsController;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model.*;
import com.group.lloyds.identity.authentication.lab.LloydsATMDetails.service.ILloydsAtmDetailsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class LloydsAtmDetailsControllerTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LloydsAtmDetailsControllerTest.class);

    @Mock
    private ILloydsAtmDetailsService iLloydsAtmDetailsService;

    @InjectMocks
    private LloydsAtmDetailsController lloydsAtmDetailsController;

    @SuppressWarnings("unchecked")
    @Test
    public void testGetATMInformation() throws URISyntaxException {

        Brand brand = new Brand();
        Atm atm = new Atm();
        atm.setIdentification("LFFFBC11");
        ArrayList<Atm> atmList = new ArrayList<>();
        atmList.add(atm);
        ArrayList<Brand> brandList = new ArrayList<>();
        brand.setAtm(atmList);
        brandList.add(brand);
        Datum datum = new Datum();
        datum.setBrand(brandList);

        Location location = new Location();
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setAddressLine(Arrays.asList("1 VICTORIA ROAD;"));
        location.setPostalAddress(postalAddress);
        atm.setLocation(location);

        ATMDetails atmDetails = new ATMDetails(new Meta(), Arrays.asList(datum));

        Mockito.when(iLloydsAtmDetailsService.getAtmDetails(Mockito.anyString())).thenReturn(atmDetails);

        ResponseEntity<?> response = lloydsAtmDetailsController.getATMInformation("LFFFBC11", "https://api.lloydsbank.com/open-banking/v2.2/atms");

        Atm responseBody = (Atm) response.getBody();

        assertEquals(atm.getIdentification(), responseBody.getIdentification());

        assertEquals(atm.getLocation().getPostalAddress().getAddressLine().get(0), responseBody.getLocation().getPostalAddress().getAddressLine().get(0));

    }

}
