
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ATM information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Identification",
    "SupportedLanguages",
    "ATMServices",
    "Accessibility",
    "Access24HoursIndicator",
    "SupportedCurrencies",
    "MinimumPossibleAmount",
    "Note",
    "OtherAccessibility",
    "OtherATMServices",
    "Branch",
    "Location"
})
@Generated("jsonschema2pojo")
@AllArgsConstructor
@NoArgsConstructor
public class Atm {

    /**
     * Identification
     * <p>
     * ATM terminal device identification for the acquirer and the issuer.
     * (Required)
     * 
     */
    @JsonProperty("Identification")
    @JsonPropertyDescription("ATM terminal device identification for the acquirer and the issuer.")
    private String identification;
    /**
     * SupportedLanguages
     * <p>
     * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
     * 
     */
    @JsonProperty("SupportedLanguages")
    @JsonPropertyDescription("Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.")
    private List<String> supportedLanguages = null;
    /**
     * ATMServices
     * <p>
     * Describes the type of transaction available for a customer on an ATM.
     * 
     */
    @JsonProperty("ATMServices")
    @JsonPropertyDescription("Describes the type of transaction available for a customer on an ATM.")
    private List<ATMService> aTMServices = null;
    /**
     * Accessibility
     * <p>
     * Indicates Types of Accessibility
     * 
     */
    @JsonProperty("Accessibility")
    @JsonPropertyDescription("Indicates Types of Accessibility")
    private List<Accessibility> accessibility = null;
    /**
     * Access24HoursIndicator
     * <p>
     * Indicates that the ATM is available for use by customers 24 hours per day
     * 
     */
    @JsonProperty("Access24HoursIndicator")
    @JsonPropertyDescription("Indicates that the ATM is available for use by customers 24 hours per day")
    private Boolean access24HoursIndicator;
    /**
     * SupportedCurrencies
     * <p>
     * All ISO 4217 defined currency  supported by the ATM.
     * (Required)
     * 
     */
    @JsonProperty("SupportedCurrencies")
    @JsonPropertyDescription("All ISO 4217 defined currency  supported by the ATM.")
    private List<String> supportedCurrencies = null;
    /**
     * MinimumPossibleAmount
     * <p>
     * Minimum amount allowed for a transaction in the service.
     * 
     */
    @JsonProperty("MinimumPossibleAmount")
    @JsonPropertyDescription("Minimum amount allowed for a transaction in the service.")
    private String minimumPossibleAmount;
    /**
     * Note
     * <p>
     * Summary description of the ATM.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Summary description of the ATM.")
    private List<String> note = null;
    /**
     * OtherAccessibility
     * <p>
     * Enter a new code , name and description for any other ATM accessibility options
     * 
     */
    @JsonProperty("OtherAccessibility")
    @JsonPropertyDescription("Enter a new code , name and description for any other ATM accessibility options")
    private List<OtherAccessibility> otherAccessibility = null;
    /**
     * OtherATMServices
     * <p>
     * Enter a new code , name and description for any other ATM Service
     * 
     */
    @JsonProperty("OtherATMServices")
    @JsonPropertyDescription("Enter a new code , name and description for any other ATM Service")
    private List<OtherATMService> otherATMServices = null;
    /**
     * Branch
     * <p>
     * Information that locates and identifies a specific branch of a financial institution.
     * 
     */
    @JsonProperty("Branch")
    @JsonPropertyDescription("Information that locates and identifies a specific branch of a financial institution.")
    private Branch branch;
    /**
     * Location
     * <p>
     * Location of the ATM.
     * (Required)
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("Location of the ATM.")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public <T> Atm(List<T> asList) {
    }

    /**
     * Identification
     * <p>
     * ATM terminal device identification for the acquirer and the issuer.
     * (Required)
     * 
     */
    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    /**
     * Identification
     * <p>
     * ATM terminal device identification for the acquirer and the issuer.
     * (Required)
     * 
     */
    @JsonProperty("Identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * SupportedLanguages
     * <p>
     * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
     * 
     */
    @JsonProperty("SupportedLanguages")
    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    /**
     * SupportedLanguages
     * <p>
     * Identification of the language name according to the ISO 639-1 codes. The type is validated by the list of values coded with two alphabetic characters, defined in the standard.
     * 
     */
    @JsonProperty("SupportedLanguages")
    public void setSupportedLanguages(List<String> supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    /**
     * ATMServices
     * <p>
     * Describes the type of transaction available for a customer on an ATM.
     * 
     */
    @JsonProperty("ATMServices")
    public List<ATMService> getATMServices() {
        return aTMServices;
    }

    /**
     * ATMServices
     * <p>
     * Describes the type of transaction available for a customer on an ATM.
     * 
     */
    @JsonProperty("ATMServices")
    public void setATMServices(List<ATMService> aTMServices) {
        this.aTMServices = aTMServices;
    }

    /**
     * Accessibility
     * <p>
     * Indicates Types of Accessibility
     * 
     */
    @JsonProperty("Accessibility")
    public List<Accessibility> getAccessibility() {
        return accessibility;
    }

    /**
     * Accessibility
     * <p>
     * Indicates Types of Accessibility
     * 
     */
    @JsonProperty("Accessibility")
    public void setAccessibility(List<Accessibility> accessibility) {
        this.accessibility = accessibility;
    }

    /**
     * Access24HoursIndicator
     * <p>
     * Indicates that the ATM is available for use by customers 24 hours per day
     * 
     */
    @JsonProperty("Access24HoursIndicator")
    public Boolean getAccess24HoursIndicator() {
        return access24HoursIndicator;
    }

    /**
     * Access24HoursIndicator
     * <p>
     * Indicates that the ATM is available for use by customers 24 hours per day
     * 
     */
    @JsonProperty("Access24HoursIndicator")
    public void setAccess24HoursIndicator(Boolean access24HoursIndicator) {
        this.access24HoursIndicator = access24HoursIndicator;
    }

    /**
     * SupportedCurrencies
     * <p>
     * All ISO 4217 defined currency  supported by the ATM.
     * (Required)
     * 
     */
    @JsonProperty("SupportedCurrencies")
    public List<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    /**
     * SupportedCurrencies
     * <p>
     * All ISO 4217 defined currency  supported by the ATM.
     * (Required)
     * 
     */
    @JsonProperty("SupportedCurrencies")
    public void setSupportedCurrencies(List<String> supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    /**
     * MinimumPossibleAmount
     * <p>
     * Minimum amount allowed for a transaction in the service.
     * 
     */
    @JsonProperty("MinimumPossibleAmount")
    public String getMinimumPossibleAmount() {
        return minimumPossibleAmount;
    }

    /**
     * MinimumPossibleAmount
     * <p>
     * Minimum amount allowed for a transaction in the service.
     * 
     */
    @JsonProperty("MinimumPossibleAmount")
    public void setMinimumPossibleAmount(String minimumPossibleAmount) {
        this.minimumPossibleAmount = minimumPossibleAmount;
    }

    /**
     * Note
     * <p>
     * Summary description of the ATM.
     * 
     */
    @JsonProperty("Note")
    public List<String> getNote() {
        return note;
    }

    /**
     * Note
     * <p>
     * Summary description of the ATM.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<String> note) {
        this.note = note;
    }

    /**
     * OtherAccessibility
     * <p>
     * Enter a new code , name and description for any other ATM accessibility options
     * 
     */
    @JsonProperty("OtherAccessibility")
    public List<OtherAccessibility> getOtherAccessibility() {
        return otherAccessibility;
    }

    /**
     * OtherAccessibility
     * <p>
     * Enter a new code , name and description for any other ATM accessibility options
     * 
     */
    @JsonProperty("OtherAccessibility")
    public void setOtherAccessibility(List<OtherAccessibility> otherAccessibility) {
        this.otherAccessibility = otherAccessibility;
    }

    /**
     * OtherATMServices
     * <p>
     * Enter a new code , name and description for any other ATM Service
     * 
     */
    @JsonProperty("OtherATMServices")
    public List<OtherATMService> getOtherATMServices() {
        return otherATMServices;
    }

    /**
     * OtherATMServices
     * <p>
     * Enter a new code , name and description for any other ATM Service
     * 
     */
    @JsonProperty("OtherATMServices")
    public void setOtherATMServices(List<OtherATMService> otherATMServices) {
        this.otherATMServices = otherATMServices;
    }

    /**
     * Branch
     * <p>
     * Information that locates and identifies a specific branch of a financial institution.
     * 
     */
    @JsonProperty("Branch")
    public Branch getBranch() {
        return branch;
    }

    /**
     * Branch
     * <p>
     * Information that locates and identifies a specific branch of a financial institution.
     * 
     */
    @JsonProperty("Branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * Location
     * <p>
     * Location of the ATM.
     * (Required)
     * 
     */
    @JsonProperty("Location")
    public Location getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * Location of the ATM.
     * (Required)
     * 
     */
    @JsonProperty("Location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Atm{" +
                "identification='" + identification + '\'' +
                ", supportedLanguages=" + supportedLanguages +
                ", aTMServices=" + aTMServices +
                ", accessibility=" + accessibility +
                ", access24HoursIndicator=" + access24HoursIndicator +
                ", supportedCurrencies=" + supportedCurrencies +
                ", minimumPossibleAmount='" + minimumPossibleAmount + '\'' +
                ", note=" + note +
                ", otherAccessibility=" + otherAccessibility +
                ", otherATMServices=" + otherATMServices +
                ", branch=" + branch +
                ", location=" + location +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
