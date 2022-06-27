package com.pages.training;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {
    //locators
    SelenideElement firstNameInput = $("#firstName");

    //actions
    public RegistrationFormPage OpenPage() {
        open("/automation-practice-form");
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));

        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public RegistrationFormPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationFormPage setGender() {
        $(byText("Male")).click();

        return this;
    }

    public RegistrationFormPage setUserNumber() {
        $(By.id("userNumber")).setValue("89992525543");

        return this;
    }

    public RegistrationFormPage checkTable() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public RegistrationFormPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }

    public RegistrationFormPage checkResult1(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }

    public RegistrationFormPage checkResult2(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }
}
