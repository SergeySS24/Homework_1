package com.pages.training;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.pages.components.Calendar2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage2 {

    Calendar2 calendar = new Calendar2();

    //locators
    SelenideElement selectFirstName = $("#firstName");
    SelenideElement selectLastName = $("#lastName");
    SelenideElement selectEmail = $("#userEmail");
    SelenideElement selectNumber = $(By.id("userNumber"));
    SelenideElement selectSubject = $(By.id("subjectsInput"));
    SelenideElement selectAddress = $("#currentAddress");

    //actions
    public RegistrationFormPage2 preliminary(String value) {
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text(value));
        return this;
    }

    public RegistrationFormPage2 setFirstName(String value) {
        selectFirstName.setValue(value);
        return this;
    }

    public RegistrationFormPage2 setLastName(String value) {
        selectLastName.setValue(value);
        return this;
    }

    public RegistrationFormPage2 setEmail(String value) {
        selectEmail.setValue("adelaide.star@sss.com");
        return this;
    }

    public RegistrationFormPage2 setGender() {
        $(byText("Male")).click();
        return this;
    }

    public RegistrationFormPage2 setUserNumber(String value) {
        selectNumber.setValue(value);
        return this;
    }

    public RegistrationFormPage2 setBirthday(String day, String month, String year) {
        $(By.id("dateOfBirthInput")).click();
        calendar.stableCalendar(day, month, year);
        return this;
    }

    public RegistrationFormPage2 setSubject() {
        selectSubject.setValue("Arts").pressEnter();
        return this;
    }

    public RegistrationFormPage2 setHobby() {
        $(byText("Sports")).click();
        return this;
    }

    public RegistrationFormPage2 uploadFile() {
        $(By.id("uploadPicture")).uploadFromClasspath("img/1.png");
        return this;
    }

    public RegistrationFormPage2 setAddress(String value) {
        selectAddress.setValue(value);
        return this;
    }

    public RegistrationFormPage2 setState() {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-3-input")).setValue("NCR").pressEnter();
        return this;
    }

    public RegistrationFormPage2 setCity() {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();
        return this;
    }

    public RegistrationFormPage2 submit() {
        $(By.id("submit")).click();
        return this;
    }

    public RegistrationFormPage2 acknowledgement(String value) {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public RegistrationFormPage2 acknowledgement2(String name, String gender, String subject) {
        $(".table-responsive").shouldHave(text(name), text(gender), text(subject));
        return this;
    }
}
