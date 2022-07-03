package com.pages.PageObjects.training;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.pages.PageObjects.components.TrainingCalendarComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage1 {

    TrainingCalendarComponent calendar = new TrainingCalendarComponent();

    //locators
    SelenideElement firstNameInput = $("#firstName");

    //actions
    public void prepareTests() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }


    public RegistrationFormPage1 OpenPage() {
        open("/automation-practice-form");
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));

        return this;
    }

    public RegistrationFormPage1 setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage1 setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public RegistrationFormPage1 setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationFormPage1 setGender() {
        $(byText("Male")).click();

        return this;
    }

    public RegistrationFormPage1 setUserNumber(String value) {
        $(By.id("userNumber")).setValue(value);

        return this;
    }

    public RegistrationFormPage1 setBirtdate(String day, String month, String year) {
        $(By.id("dateOfBirthInput")).click();
        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationFormPage1 setSubject() {
        $(By.className("subjects-auto-complete__input")).click();
        $(By.id("subjectsInput")).setValue("Arts").pressEnter();

        return this;
    }

    public RegistrationFormPage1 setSport() {
        $(byText("Sports")).click();

        return this;
    }

    public RegistrationFormPage1 uploadPicture() {
        $("#uploadPicture").uploadFromClasspath("img/1.png");

        return this;
    }

    public RegistrationFormPage1 setAddress(String value) {
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationFormPage1 setState() {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-3-input")).setValue("NCR").pressEnter();

        return this;
    }

    public RegistrationFormPage1 setCity() {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();

        return this;
    }

    public void submitForm() {
        $(By.id("submit")).click();
    }


    public RegistrationFormPage1 checkTable() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public RegistrationFormPage1 checkResult(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }

    public RegistrationFormPage1 checkResult1(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }

    public RegistrationFormPage1 checkResult2(String key, String value) {
        $(".table-responsive").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }
}
