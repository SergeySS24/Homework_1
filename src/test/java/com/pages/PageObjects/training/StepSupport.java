package com.pages.PageObjects.training;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepSupport {

    @Step("open webpage")
    public void prepareTest() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Step("set first name")
    public void setFirstName(String name) {
        $("#firstName").setValue(name);
    }
}
