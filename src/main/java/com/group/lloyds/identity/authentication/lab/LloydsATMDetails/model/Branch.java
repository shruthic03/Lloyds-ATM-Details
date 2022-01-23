
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


/**
 * Branch
 * <p>
 * Information that locates and identifies a specific branch of a financial institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identification"
})
@Generated("jsonschema2pojo")
public class Branch {

    /**
     * Identification
     * <p>
     * Unique and unambiguous identification of a branch of a financial institution.
     * 
     */
    @JsonProperty("Identification")
    @JsonPropertyDescription("Unique and unambiguous identification of a branch of a financial institution.")
    private String identification;

    /**
     * Identification
     * <p>
     * Unique and unambiguous identification of a branch of a financial institution.
     * 
     */
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    /**
     * Identification
     * <p>
     * Unique and unambiguous identification of a branch of a financial institution.
     * 
     */
    @JsonProperty("Identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

}
