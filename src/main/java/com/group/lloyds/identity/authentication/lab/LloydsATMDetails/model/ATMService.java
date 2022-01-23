
package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * Describes the type of transaction available for a customer on an ATM.
 * 
 */
@Generated("jsonschema2pojo")
public enum ATMService {

    BALANCE("Balance"),
    BILL_PAYMENTS("BillPayments"),
    CASH_DEPOSITS("CashDeposits"),
    CHARITY_DONATION("CharityDonation"),
    CHEQUE_DEPOSITS("ChequeDeposits"),
    CASH_WITHDRAWAL("CashWithdrawal"),
    ENVELOPE_DEPOSIT("EnvelopeDeposit"),
    FAST_CASH("FastCash"),
    MOBILE_BANKING_REGISTRATION("MobileBankingRegistration"),
    MOBILE_PAYMENT_REGISTRATION("MobilePaymentRegistration"),
    MOBILE_PHONE_TOP_UP("MobilePhoneTopUp"),
    ORDER_STATEMENT("OrderStatement"),
    OTHER("Other"),
    PIN_ACTIVATION("PINActivation"),
    PIN_CHANGE("PINChange"),
    PIN_UNBLOCK("PINUnblock"),
    MINI_STATEMENT("MiniStatement");
    private final String value;
    private final static Map<String, ATMService> CONSTANTS = new HashMap<String, ATMService>();

    static {
        for (ATMService c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ATMService(String value) {
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
    public static ATMService fromValue(String value) {
        ATMService constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
