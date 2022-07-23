package com.PageObjects_myCode;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Lambda1 {

    @BeforeAll
    static void preparation() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void lambdaTests() {
        SelenideLogger.addListener("house", new AllureSelenide());

        step("open page", () -> {
            open("https://demoqa.com/automation-practice-form");
        });
        step("check appearance of the form", () -> {
            $(By.className("practice-form-wrapper")).shouldHave(Condition.text("Student Registration Form"));
        });
        step("set first name", () -> {
            $("#firstName").setValue("Sergey");
        });
        step("set last name", () -> {
            $("#lastName").setValue("Starostin");
        });
        step("set email", () -> {
            $("#userEmail").setValue("adelaide.star@sss.com");
        });
        step("set gender", () -> {
            $(byText("Male")).click();
        });
        step("set phone number", () -> {
            $(By.id("userNumber")).setValue("89992525543");
        });
        step("birthday", () -> {
            $(By.id("dateOfBirthInput")).click();
            $("[class=react-datepicker__month-select]").click();
            $("[class=react-datepicker__month-select]").selectOption("March");
            $("[class=react-datepicker__year-select]").click();
            $("[class=react-datepicker__year-select]").selectOptionByValue("1989");
            $(By.className("react-datepicker__day--019")).click();
        });
        step("set subject", () -> {
            $(By.className("subjects-auto-complete__input")).click();
            $(By.id("subjectsInput")).setValue("Arts").pressEnter();
        });
        step("set hobby", () -> {
            $(byText("Sports")).click();
        });
        step("upload picture", () -> {
            $(By.id("uploadPicture")).uploadFromClasspath("img/1.png");
        });
        step("set address", () -> {
            $("#currentAddress").setValue("Best street ever, Saint Petersburg");
        });
        step("set state", () -> {
            $(By.className("css-1hwfws3")).click();
            $(By.id("react-select-3-input")).setValue("NCR").pressEnter();
        });
        step("set city", () -> {
            $(By.className("css-1hwfws3")).click();
            $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();
        });
        step("submit from", () -> {
            $(By.id("submit")).click();
        });
        step("checking appearance of the form", () -> {
            $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        });
        step("check correct data in the form", () -> {
            $(".table-responsive").shouldHave(text("Sergey Starostin"), text("Male"), text("Arts"));
        });
    }
}




