package com.pages.training;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.pages.components.TrainingCalendarComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

    TrainingCalendarComponent calendar = new TrainingCalendarComponent();

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

    public RegistrationFormPage setUserNumber(String value) {
        $(By.id("userNumber")).setValue(value);

        return this;
    }


    public RegistrationFormPage setBirtdate(String day, String month, String year) {
        $(By.id("dateOfBirthInput")).click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationFormPage setSubject() {
        $(By.className("subjects-auto-complete__input")).click();
        $(By.id("subjectsInput")).setValue("Arts").pressEnter();

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
