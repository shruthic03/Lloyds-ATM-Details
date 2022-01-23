
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Environment of the ATM.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Brand"
})
@Generated("jsonschema2pojo")
public class Datum {

    /**
     * Brand
     * <p>
     * Brand of the Acquirer of transactions captured by the ATM
     * (Required)
     * 
     */
    @JsonProperty("Brand")
    @JsonPropertyDescription("Brand of the Acquirer of transactions captured by the ATM")
    private List<Brand> brand = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Brand
     * <p>
     * Brand of the Acquirer of transactions captured by the ATM
     * (Required)
     * 
     */
    @JsonProperty("Brand")
    public List<Brand> getBrand() {
        return brand;
    }

    /**
     * Brand
     * <p>
     * Brand of the Acquirer of transactions captured by the ATM
     * (Required)
     * 
     */
    @JsonProperty("Brand")
    public void setBrand(List<Brand> brand) {
        this.brand = brand;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
