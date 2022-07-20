package com.PageObjects_myCode;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.pages.PageObjects.training.GrogPlus;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class Grog {

    GrogPlus mock = new GrogPlus();

    @Test
    public void testingPage() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        mock.startTest("https://demoqa.com/automation-practice-form")
                .verifyPage("Student Registration Form")
                .setFirstName("Sergey")
                .setLastName("Starostin")
                .setEmail("adelaide.star@sss.com")
                .setGender("Male")
                .setPhoneNumber("89992525543");

    }


}
