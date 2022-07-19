package com.PageObjects_myCode;

import com.codeborne.selenide.Configuration;
import com.pages.PageObjects.training.SS_AllureTest1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SS_AllureTraining1 {

    SS_AllureTest1 AllureTest = new SS_AllureTest1();

    @BeforeAll
    static void prepareTest() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void startTest() {
        AllureTest.openPage("https://demoqa.com/automation-practice-form")
                .checkWrapper()
                .setFirstName("Sergey")
                .setLastName("Starostin")
                .userEmail("adelaide.star@sss.com")
                .setGender()
                .userNumber("89992525543");
    }

}
