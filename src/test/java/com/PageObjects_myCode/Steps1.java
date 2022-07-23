package com.PageObjects_myCode;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.pages.PageObjects.training.StepSupport;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Steps1 {

    StepSupport step = new StepSupport();

    @BeforeAll
    static void preparation() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void initiateTests() {
        SelenideLogger.addListener("star", new AllureSelenide());
        step.prepareTest("https://demoqa.com/automation-practice-form")
                .verifyPage("Student Registration Form")
                .setFirstName("Sergey")
                .setLastName("Starostin")
                .setEmail("adelaide.star@sss.com")
                .setGender("Male")
                .setPhone("89992525543")
                .setDate("11", "March", "1989")
                .setSubject("Arts")
                .setHobby("Sports")
                .uploadPic("img/1.png")
                .setAddress("Best street ever, Saint Petersburg")
                .setState("NCR")
                .setCity("Delhi")
                .submitForm()
                .checkForm("Thanks for submitting the form")
                .checkData("Sergey Starostin", "Male", "Arts");
    }
}
