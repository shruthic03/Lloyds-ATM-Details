
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


/**
 * Site
 * <p>
 * Used by a Financial Institution internally to identify the location of an ATM.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identification",
    "Name"
})
@Generated("jsonschema2pojo")
public class Site {

    /**
     * Identification
     * <p>
     * ATM site identification for the Financial Institution.
     * 
     */
    @JsonProperty("Identification")
    @JsonPropertyDescription("ATM site identification for the Financial Institution.")
    private String identification;
    /**
     * Name
     * <p>
     * ATM site name as used by Financial Institution.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("ATM site name as used by Financial Institution.")
    private String name;

    /**
     * Identification
     * <p>
     * ATM site identification for the Financial Institution.
     * 
     */
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    /**
     * Identification
     * <p>
     * ATM site identification for the Financial Institution.
     * 
     */
    @JsonProperty("Identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Name
     * <p>
     * ATM site name as used by Financial Institution.
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * ATM site name as used by Financial Institution.
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

}
