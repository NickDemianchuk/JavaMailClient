package com.demianchuk.service;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidatorService {

    private ValidatorService() {
    }

    public static void validate(String addressList) throws Exception {

        EmailValidator validator = EmailValidator.getInstance();
        String[] addresses = addressList.split(",");
        for (String address : addresses) {
            if (!validator.isValid(address))
                throw new Exception("\"" + address + "\" seems to be an invalid email address!");
        }
    }
}
