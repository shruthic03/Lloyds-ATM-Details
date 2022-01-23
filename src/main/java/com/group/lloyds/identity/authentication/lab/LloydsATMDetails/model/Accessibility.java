
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * Indicates Types of Accessibility
 * 
 */
@Generated("jsonschema2pojo")
public enum Accessibility {

    AUDIO_CASH_MACHINE("AudioCashMachine"),
    AUTOMATIC_DOORS("AutomaticDoors"),
    EXTERNAL_RAMP("ExternalRamp"),
    INDUCTION_LOOP("InductionLoop"),
    INTERNAL_RAMP("InternalRamp"),
    LEVEL_ACCESS("LevelAccess"),
    LOWER_LEVEL_COUNTER("LowerLevelCounter"),
    OTHER("Other"),
    WHEELCHAIR_ACCESS("WheelchairAccess");
    private final String value;
    private final static Map<String, Accessibility> CONSTANTS = new HashMap<String, Accessibility>();

    static {
        for (Accessibility c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Accessibility(String value) {
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
    public static Accessibility fromValue(String value) {
        Accessibility constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
