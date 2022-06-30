package com.pages.training;

import com.codeborne.selenide.Condition;
import com.pages.components.Calendar2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage2 {

    Calendar2 calendar = new Calendar2();

    //locators


    //actions
    public RegistrationFormPage2 preliminary(String value) {
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text(value));
        return this;
    }

    public RegistrationFormPage2 setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public RegistrationFormPage2 setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationFormPage2 setEmail(String value) {
        $("#userEmail").setValue("adelaide.star@sss.com");
        return this;
    }

    public RegistrationFormPage2 setGender() {
        $(byText("Male")).click();
        return this;
    }

    public RegistrationFormPage2 setUserNumber(String value) {
        $(By.id("userNumber")).setValue(value);
        return this;
    }

    public RegistrationFormPage2 setBirthday(String day, String month, String year) {
        $(By.id("dateOfBirthInput")).click();
        calendar.stableCalendar(day, month, year);
        return this;
    }

    public RegistrationFormPage2 setSubject() {
        $(By.id("subjectsInput")).setValue("Arts").pressEnter();
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
        $("#currentAddress").setValue(value);
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
