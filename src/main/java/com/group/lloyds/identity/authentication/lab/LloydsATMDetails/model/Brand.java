
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Brand of the Acquirer of transactions captured by the ATM
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BrandName",
    "ATM"
})
@Generated("jsonschema2pojo")
public class Brand {

    /**
     * BrandName
     * <p>
     * Brand Name that an organisation uses to market its products or services to a consumer
     * (Required)
     * 
     */
    @JsonProperty("BrandName")
    @JsonPropertyDescription("Brand Name that an organisation uses to market its products or services to a consumer")
    private String brandName;
    /**
     * ATM
     * <p>
     * ATM information.
     * (Required)
     * 
     */
    @JsonProperty("ATM")
    @JsonPropertyDescription("ATM information.")
    private List<Atm> atm = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * BrandName
     * <p>
     * Brand Name that an organisation uses to market its products or services to a consumer
     * (Required)
     * 
     */
    @JsonProperty("BrandName")
    public String getBrandName() {
        return brandName;
    }

    /**
     * BrandName
     * <p>
     * Brand Name that an organisation uses to market its products or services to a consumer
     * (Required)
     * 
     */
    @JsonProperty("BrandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * ATM
     * <p>
     * ATM information.
     * (Required)
     * 
     */
    @JsonProperty("ATM")
    public List<Atm> getAtm() {
        return atm;
    }

    /**
     * ATM
     * <p>
     * ATM information.
     * (Required)
     * 
     */
    @JsonProperty("ATM")
    public void setAtm(List<Atm> atm) {
        this.atm = atm;
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
