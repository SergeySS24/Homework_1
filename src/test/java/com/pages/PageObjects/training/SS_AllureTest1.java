package com.pages.PageObjects.training;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SS_AllureTest1 {

    public SS_AllureTest1 openPage(String page) {
        open(page);
        return this;
    }

    public SS_AllureTest1 checkWrapper() {
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));
        return this;
    }

    public SS_AllureTest1 setFirstName(String name) {
        try {
            $("#firstName").setValue(name);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return this;
    }

    public SS_AllureTest1 setLastName(String surname) {
        $("#lastName").setValue(surname);
        return this;
    }

    public SS_AllureTest1 userEmail(String mail) {
        $("#userEmail").setValue(mail);
        return this;
    }

    public SS_AllureTest1 setGender() {
        $(byText("Male")).click();
        return this;
    }

    public SS_AllureTest1 userNumber(String phone) {
        $(By.id("userNumber")).setValue(phone);
        return this;
    }
}
