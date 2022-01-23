
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;


/**
 * GeographicCoordinates
 * <p>
 * Location on the earth specified by two numbers representing vertical and horizontal position.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Latitude",
    "Longitude"
})
@Generated("jsonschema2pojo")
public class GeographicCoordinates {

    /**
     * Latitude
     * <p>
     * Latitude measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    @JsonPropertyDescription("Latitude measured in decimal degrees.")
    private String latitude;
    /**
     * Longitude
     * <p>
     * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.
     * The longitude is measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    @JsonPropertyDescription("Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.\nThe longitude is measured in decimal degrees.")
    private String longitude;

    /**
     * Latitude
     * <p>
     * Latitude measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     * <p>
     * Latitude measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Longitude
     * <p>
     * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.
     * The longitude is measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     * <p>
     * Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.
     * The longitude is measured in decimal degrees.
     * (Required)
     * 
     */
    @JsonProperty("Longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
