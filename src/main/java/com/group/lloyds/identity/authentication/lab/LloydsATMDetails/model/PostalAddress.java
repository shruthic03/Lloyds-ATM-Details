
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;


/**
 * PostalAddress
 * <p>
 * Information that locates and identifies a specific address, as defined by postal services or in free format text.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AddressLine",
    "BuildingNumber",
    "StreetName",
    "TownName",
    "CountrySubDivision",
    "Country",
    "PostCode",
    "GeoLocation"
})
@Generated("jsonschema2pojo")
public class PostalAddress {

    /**
     * AddressLine
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
     * 
     */
    @JsonProperty("AddressLine")
    @JsonPropertyDescription("Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")
    private List<String> addressLine = null;
    /**
     * BuildingNumber
     * <p>
     * Name or Number that identifies the position of a building on a street.
     * 
     */
    @JsonProperty("BuildingNumber")
    @JsonPropertyDescription("Name or Number that identifies the position of a building on a street.")
    private String buildingNumber;
    /**
     * StreetName
     * <p>
     * Name of a street or thoroughfare.
     * 
     */
    @JsonProperty("StreetName")
    @JsonPropertyDescription("Name of a street or thoroughfare.")
    private String streetName;
    /**
     * TownName
     * <p>
     * Name of a built-up area, with defined boundaries, and a local government.
     * 
     */
    @JsonProperty("TownName")
    @JsonPropertyDescription("Name of a built-up area, with defined boundaries, and a local government.")
    private String townName;
    /**
     * CountrySubDivision
     * <p>
     * Identifies a subdivision of a country, for instance state, region, county.
     * 
     */
    @JsonProperty("CountrySubDivision")
    @JsonPropertyDescription("Identifies a subdivision of a country, for instance state, region, county.")
    private List<String> countrySubDivision = null;
    /**
     * Country
     * <p>
     * Nation with its own government, occupying a particular territory.
     * 
     */
    @JsonProperty("Country")
    @JsonPropertyDescription("Nation with its own government, occupying a particular territory.")
    private String country;
    /**
     * PostCode
     * <p>
     * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
     * 
     */
    @JsonProperty("PostCode")
    @JsonPropertyDescription("Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")
    private String postCode;
    /**
     * GeoLocation
     * <p>
     * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
     * 
     */
    @JsonProperty("GeoLocation")
    @JsonPropertyDescription("Geographic location of the ATM specified by geographic coordinates or UTM coordinates.")
    private GeoLocation geoLocation;

    /**
     * AddressLine
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
     * 
     */
    @JsonProperty("AddressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    /**
     * AddressLine
     * <p>
     * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
     * 
     */
    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * BuildingNumber
     * <p>
     * Name or Number that identifies the position of a building on a street.
     * 
     */
    @JsonProperty("BuildingNumber")
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * BuildingNumber
     * <p>
     * Name or Number that identifies the position of a building on a street.
     * 
     */
    @JsonProperty("BuildingNumber")
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * StreetName
     * <p>
     * Name of a street or thoroughfare.
     * 
     */
    @JsonProperty("StreetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     * StreetName
     * <p>
     * Name of a street or thoroughfare.
     * 
     */
    @JsonProperty("StreetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * TownName
     * <p>
     * Name of a built-up area, with defined boundaries, and a local government.
     * 
     */
    @JsonProperty("TownName")
    public String getTownName() {
        return townName;
    }

    /**
     * TownName
     * <p>
     * Name of a built-up area, with defined boundaries, and a local government.
     * 
     */
    @JsonProperty("TownName")
    public void setTownName(String townName) {
        this.townName = townName;
    }

    /**
     * CountrySubDivision
     * <p>
     * Identifies a subdivision of a country, for instance state, region, county.
     * 
     */
    @JsonProperty("CountrySubDivision")
    public List<String> getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * CountrySubDivision
     * <p>
     * Identifies a subdivision of a country, for instance state, region, county.
     * 
     */
    @JsonProperty("CountrySubDivision")
    public void setCountrySubDivision(List<String> countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    /**
     * Country
     * <p>
     * Nation with its own government, occupying a particular territory.
     * 
     */
    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * Nation with its own government, occupying a particular territory.
     * 
     */
    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * PostCode
     * <p>
     * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
     * 
     */
    @JsonProperty("PostCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * PostCode
     * <p>
     * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
     * 
     */
    @JsonProperty("PostCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * GeoLocation
     * <p>
     * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
     * 
     */
    @JsonProperty("GeoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * GeoLocation
     * <p>
     * Geographic location of the ATM specified by geographic coordinates or UTM coordinates.
     * 
     */
    @JsonProperty("GeoLocation")
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

}
