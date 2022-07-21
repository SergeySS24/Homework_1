package com.PageObjects_myCode;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.pages.PageObjects.training.StepSupport;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class Steps1 {

    StepSupport step = new StepSupport();

    @Test
    public void initiateTests() {
        SelenideLogger.addListener("star", new AllureSelenide());
        step.prepareTest()
                .setFirstName("Sergey")
                .setLastName("Starostin")
                .setEmail("adelaide.star@sss.com")
                .setGender("Male")
                .setPhone("89992525543");

    }
}
