
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * Indicates the environment of the ATM.
 * 
 */
@Generated("jsonschema2pojo")
public enum LocationCategory {

    BRANCH_EXTERNAL("BranchExternal"),
    BRANCH_INTERNAL("BranchInternal"),
    BRANCH_LOBBY("BranchLobby"),
    OTHER("Other"),
    RETAILER_OUTLET("RetailerOutlet"),
    REMOTE_UNIT("RemoteUnit");
    private final String value;
    private final static Map<String, LocationCategory> CONSTANTS = new HashMap<String, LocationCategory>();

    static {
        for (LocationCategory c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LocationCategory(String value) {
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
    public static LocationCategory fromValue(String value) {
        LocationCategory constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
