package com.PageObjects_myCode;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Lambda2 {

    @BeforeAll
    static void preparation() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    public void lamba2Test() {
        SelenideLogger.addListener("top", new AllureSelenide());

        step("open page", () -> {
            open("/automation-practice-form");
        });
        step("verify appeared page", () -> {
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


    }
}
