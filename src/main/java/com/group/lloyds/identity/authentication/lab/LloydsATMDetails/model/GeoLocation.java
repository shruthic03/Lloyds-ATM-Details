
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


/**
 * GeoLocation
 * <p>
 * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GeographicCoordinates"
})
@Generated("jsonschema2pojo")

public class GeoLocation {

    /**
     * GeographicCoordinates
     * <p>
     * Location on the earth specified by two numbers representing vertical and horizontal position.
     * (Required)
     * 
     */
    @JsonProperty("GeographicCoordinates")
    @JsonPropertyDescription("Location on the earth specified by two numbers representing vertical and horizontal position.")
    private GeographicCoordinates geographicCoordinates;

    /**
     * GeographicCoordinates
     * <p>
     * Location on the earth specified by two numbers representing vertical and horizontal position.
     * (Required)
     * 
     */
    @JsonProperty("GeographicCoordinates")
    public GeographicCoordinates getGeographicCoordinates() {
        return geographicCoordinates;
    }

    /**
     * GeographicCoordinates
     * <p>
     * Location on the earth specified by two numbers representing vertical and horizontal position.
     * (Required)
     * 
     */
    @JsonProperty("GeographicCoordinates")
    public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
    }

    @Override
    public String toString() {
        return "GeoLocation{" +
                "geographicCoordinates=" + geographicCoordinates +
                '}';
    }
}
