
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;


/**
 * Location
 * <p>
 * Location of the ATM.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LocationCategory",
    "OtherLocationCategory",
    "Site",
    "PostalAddress"
})
@Generated("jsonschema2pojo")
public class Location {

    /**
     * LocationCategory
     * <p>
     * Indicates the environment of the ATM.
     * 
     */
    @JsonProperty("LocationCategory")
    @JsonPropertyDescription("Indicates the environment of the ATM.")
    private List<LocationCategory> locationCategory = null;
    /**
     * OtherLocationCategory
     * <p>
     * Enter a new code , name and description for any other location category
     * 
     */
    @JsonProperty("OtherLocationCategory")
    @JsonPropertyDescription("Enter a new code , name and description for any other location category")
    private List<OtherLocationCategory> otherLocationCategory = null;
    /**
     * Site
     * <p>
     * Used by a Financial Institution internally to identify the location of an ATM.
     * 
     */
    @JsonProperty("Site")
    @JsonPropertyDescription("Used by a Financial Institution internally to identify the location of an ATM.")
    private Site site;
    /**
     * PostalAddress
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services or in free format text.
     * (Required)
     * 
     */
    @JsonProperty("PostalAddress")
    @JsonPropertyDescription("Information that locates and identifies a specific address, as defined by postal services or in free format text.")
    private PostalAddress postalAddress;

    /**
     * LocationCategory
     * <p>
     * Indicates the environment of the ATM.
     * 
     */
    @JsonProperty("LocationCategory")
    public List<LocationCategory> getLocationCategory() {
        return locationCategory;
    }

    /**
     * LocationCategory
     * <p>
     * Indicates the environment of the ATM.
     * 
     */
    @JsonProperty("LocationCategory")
    public void setLocationCategory(List<LocationCategory> locationCategory) {
        this.locationCategory = locationCategory;
    }

    /**
     * OtherLocationCategory
     * <p>
     * Enter a new code , name and description for any other location category
     * 
     */
    @JsonProperty("OtherLocationCategory")
    public List<OtherLocationCategory> getOtherLocationCategory() {
        return otherLocationCategory;
    }

    /**
     * OtherLocationCategory
     * <p>
     * Enter a new code , name and description for any other location category
     * 
     */
    @JsonProperty("OtherLocationCategory")
    public void setOtherLocationCategory(List<OtherLocationCategory> otherLocationCategory) {
        this.otherLocationCategory = otherLocationCategory;
    }

    /**
     * Site
     * <p>
     * Used by a Financial Institution internally to identify the location of an ATM.
     * 
     */
    @JsonProperty("Site")
    public Site getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * Used by a Financial Institution internally to identify the location of an ATM.
     * 
     */
    @JsonProperty("Site")
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * PostalAddress
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services or in free format text.
     * (Required)
     * 
     */
    @JsonProperty("PostalAddress")
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * PostalAddress
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services or in free format text.
     * (Required)
     * 
     */
    @JsonProperty("PostalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

}
