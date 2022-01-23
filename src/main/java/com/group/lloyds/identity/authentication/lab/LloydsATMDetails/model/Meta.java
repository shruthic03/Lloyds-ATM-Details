
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Meta data
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LastUpdated",
    "TotalResults",
    "Agreement",
    "License",
    "TermsOfUse"
})
@Generated("jsonschema2pojo")
public class Meta {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LastUpdated")
    private Date lastUpdated;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TotalResults")
    private Integer totalResults;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Agreement")
    private Agreement agreement;
    /**
     * Open Banking License
     * (Required)
     * 
     */
    @JsonProperty("License")
    @JsonPropertyDescription("Open Banking License")
    private License license;
    /**
     * Open Banking Terms of Use
     * (Required)
     * 
     */
    @JsonProperty("TermsOfUse")
    @JsonPropertyDescription("Open Banking Terms of Use")
    private TermsOfUse termsOfUse;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LastUpdated")
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("LastUpdated")
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TotalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("TotalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Agreement")
    public Agreement getAgreement() {
        return agreement;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Agreement")
    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    /**
     * Open Banking License
     * (Required)
     * 
     */
    @JsonProperty("License")
    public License getLicense() {
        return license;
    }

    /**
     * Open Banking License
     * (Required)
     * 
     */
    @JsonProperty("License")
    public void setLicense(License license) {
        this.license = license;
    }

    /**
     * Open Banking Terms of Use
     * (Required)
     * 
     */
    @JsonProperty("TermsOfUse")
    public TermsOfUse getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * Open Banking Terms of Use
     * (Required)
     * 
     */
    @JsonProperty("TermsOfUse")
    public void setTermsOfUse(TermsOfUse termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    @Generated("jsonschema2pojo")
    public enum Agreement {

        USE_OF_THE_AP_IS_AND_ANY_RELATED_DATA_WILL_BE_SUBJECT_TO_THE_TERMS_OF_THE_OPEN_LICENCE_AND_SUBJECT_TO_TERMS_AND_CONDITIONS("Use of the APIs and any related data will be subject to the terms of the Open Licence and subject to terms and conditions");
        private final String value;
        private final static Map<String, Agreement> CONSTANTS = new HashMap<String, Agreement>();

        static {
            for (Agreement c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Agreement(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Agreement fromValue(String value) {
            Agreement constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Open Banking License
     * 
     */
    @Generated("jsonschema2pojo")
    public enum License {

        HTTPS_WWW_OPENBANKING_ORG_UK_OPEN_LICENCE(URI.create("https://www.openbanking.org.uk/open-licence"));
        private final URI value;
        private final static Map<URI, License> CONSTANTS = new HashMap<URI, License>();

        static {
            for (License c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        License(URI value) {
            this.value = value;
        }

        @JsonValue
        public URI value() {
            return this.value;
        }

        @JsonCreator
        public static License fromValue(URI value) {
            License constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }


    /**
     * Open Banking Terms of Use
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TermsOfUse {

        HTTPS_WWW_OPENBANKING_ORG_UK_TERMS(URI.create("https://www.openbanking.org.uk/terms"));
        private final URI value;
        private final static Map<URI, TermsOfUse> CONSTANTS = new HashMap<URI, TermsOfUse>();

        static {
            for (TermsOfUse c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TermsOfUse(URI value) {
            this.value = value;
        }

        @JsonValue
        public URI value() {
            return this.value;
        }

        @JsonCreator
        public static TermsOfUse fromValue(URI value) {
            TermsOfUse constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
