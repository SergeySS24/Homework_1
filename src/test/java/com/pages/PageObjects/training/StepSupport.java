package com.pages.PageObjects.training;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
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
        $("#firstName").setValue(name);
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

    @Step("enter date")
    public StepSupport setDate(String day, String month, String year) {
        $(By.id("dateOfBirthInput")).click();
        $("[class=react-datepicker__month-select]").click();
        $("[class=react-datepicker__month-select]").selectOption(month);
        $("[class=react-datepicker__year-select]").click();
        $("[class=react-datepicker__year-select]").selectOptionByValue(year);
        $(By.className("react-datepicker__day--0" + day)).click();
        return this;
    }

    @Step("set subject")
    public StepSupport setSubject(String subject) {
        $(By.className("subjects-auto-complete__input")).click();
        $(By.id("subjectsInput")).setValue(subject).pressEnter();
        return this;
    }

    @Step("set hobby")
    public StepSupport setHobby(String hobby) {
        $(byText(hobby)).click();
        return this;
    }

    @Step("upload picture")
    public StepSupport uploadPic(String pic) {
        $(By.id("uploadPicture")).uploadFromClasspath(pic);
        return this;
    }

    @Step("set address")
    public StepSupport setAddress(String address) {
        $("#currentAddress").setValue(address);
        return this;
    }

    @Step("set state")
    public StepSupport setState(String state) {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-3-input")).setValue(state).pressEnter();
        return this;
    }

    @Step("set city")
    public StepSupport setCity(String city) {
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue(city).pressEnter();
        return this;
    }

    @Step("subbit from")
    public StepSupport submitForm() {
        $(By.id("submit")).click();
        return this;
    }

    @Step("checking appearance of the form")
    public StepSupport checkForm(String form) {
        $("#example-modal-sizes-title-lg").shouldHave(text(form));
        return this;
    }

    @Step("check correct data in the form")
    public void checkData(String nameS, String genderS, String subjectS) {
        $(".table-responsive").shouldHave(text(nameS), text(genderS), text(subjectS));
    }
}