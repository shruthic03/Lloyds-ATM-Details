
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * Enter a new code , name and description for any other ATM accessibility options
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Name",
    "Description"
})
@Generated("jsonschema2pojo")
public class OtherAccessibility {

    /**
     * Code
     * <p>
     * The four letter Mnemonic used within an XML file to identify a code
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("The four letter Mnemonic used within an XML file to identify a code")
    private String code;
    /**
     * Name
     * <p>
     * Long name associated with the code
     * (Required)
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("Long name associated with the code")
    private String name;
    /**
     * Description
     * <p>
     * Description to describe the purpose of the code
     * (Required)
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Description to describe the purpose of the code")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * The four letter Mnemonic used within an XML file to identify a code
     * 
     */
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The four letter Mnemonic used within an XML file to identify a code
     * 
     */
    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Name
     * <p>
     * Long name associated with the code
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Long name associated with the code
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description
     * <p>
     * Description to describe the purpose of the code
     * (Required)
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Description to describe the purpose of the code
     * (Required)
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
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
