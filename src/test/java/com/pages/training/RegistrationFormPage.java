package com.pages.training;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {
    //locators


    //actions
    public void OpenPage() {
        open("/automation-practice-form");
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));
    }

    public void setFirstName(String value) {
        $("#firstName").setValue(value);
    }

    public void setLastName(String value) {
        $("#lastName").setValue(value);
    }

    public void setEmail(String value) {
        $("#userEmail").setValue(value);
    }

    public void setGender() {
        $(byText("Male")).click();
    }

    public void setUserNumber() {
        $(By.id("userNumber")).setValue("89992525543");
    }


}
