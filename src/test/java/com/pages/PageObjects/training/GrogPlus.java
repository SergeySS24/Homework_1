package com.pages.PageObjects.training;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GrogPlus {

    //locators
    SelenideElement firstname = $("#firstName");
    SelenideElement lastname = $("#lastName");
    SelenideElement useremail = $("#userEmail");
    SelenideElement userphone = $(By.id("userNumber"));


    public GrogPlus startTest(String http) {
        open(http);
        return this;
    }

    public GrogPlus verifyPage(String properForm) {
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text(properForm));
        return this;
    }

    public GrogPlus setFirstName(String name) {
        firstname.setValue(name);
        return this;
    }

    public GrogPlus setLastName(String surname) {
        lastname.setValue(surname);
        return this;
    }

    public GrogPlus setEmail(String mail) {
        useremail.setValue(mail);
        return this;
    }

    public GrogPlus setGender(String gender) {
        $(byText(gender)).click();
        return this;
    }

    public void setPhoneNumber(String phone) {
        userphone.setValue(phone);
    }
}
