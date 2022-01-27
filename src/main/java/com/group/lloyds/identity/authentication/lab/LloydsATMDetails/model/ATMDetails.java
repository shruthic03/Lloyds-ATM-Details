
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "data"
})
@Generated("jsonschema2pojo")
@NoArgsConstructor
@AllArgsConstructor
public class ATMDetails {

    /**
     * Meta data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    private Meta meta;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private List<Datum> data = null;

    /**
     * Meta data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * Meta data
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

}
