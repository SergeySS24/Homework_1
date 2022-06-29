package com.pages.training;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage2 {


    //locators


    //actions
    public RegistrationFormPage2 setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }

    public RegistrationFormPage2 setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }
}
