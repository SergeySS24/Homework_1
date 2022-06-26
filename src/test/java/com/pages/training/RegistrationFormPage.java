package com.pages.training;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {
    //locators


    //actions
    public void OpenPage() {
        open("/automation-practice-form");
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));
    }


}
