package com.pages.PageObjects.training;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepSupport {

    @Step("open webpage")
    public StepSupport prepareTest() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    @Step("set first name")
    public StepSupport setFirstName(String name) {
        $("#firstNames").setValue(name);
        return this;
    }

    @Step("set last name")
    public StepSupport setLastName(String surname) {
        $("#lastName").setValue(surname);
        return this;
    }

    @Step("set email")
    public StepSupport setEmail(String mail) {
        $("#userEmail").setValue(mail);
        return this;
    }

    @Step("set gender")
    public StepSupport setGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    @Step("set phone number")
    public StepSupport setPhone(String number) {
        $(By.id("userNumber")).setValue(number);
        return this;
    }
}