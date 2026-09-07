package com.Validator.project.service;

import com.Validator.project.models.PhoneResponse;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.springframework.stereotype.Service;

@Service
public class PhoneValidationService {

    public PhoneResponse validate(String phoneNumber) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber number =
                    phoneUtil.parse(phoneNumber, null);
            boolean isValid = phoneUtil.isValidNumber(number);

            String country = phoneUtil.getRegionCodeForNumber(number);
            String type = phoneUtil.getNumberType(number).toString();
            String formatted = phoneUtil.format(number,
                    PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);

            return new PhoneResponse(isValid, country, type, formatted);
        } catch (NumberParseException e) {
            return new PhoneResponse(false, null, null, null);
        }
    }
}

