package com.group.lloyds.identity.authentication.lab.LloydsATMDetails.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
@Getter
@Setter
public class AtmCustomExceptions {
    private String errorMessage, description;
    private Date dateAndTime;

    public AtmCustomExceptions(String errorMessage, String description, Date dateAndTime) {
        super();
        this.errorMessage = errorMessage;
        this.description = description;
        this.dateAndTime = dateAndTime;
    }


    @Override
    public String toString() {
        return "AtmCustomExceptions{" +
                "errorMessage='" + errorMessage + '\'' +
                ", description='" + description + '\'' +
                ", dateAndTime=" + dateAndTime +
                '}';
    }
}
