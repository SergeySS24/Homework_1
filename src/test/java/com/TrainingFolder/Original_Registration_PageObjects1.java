package com.TrainingFolder;

import com.codeborne.selenide.Configuration;
import com.pages.training.RegistrationFormPage1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Original_Registration_PageObjects1 {

    RegistrationFormPage1 registrationFormPage = new RegistrationFormPage1();

    @BeforeAll
    static void SetUp() {


        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void FillNormalForm() {

        registrationFormPage.OpenPage()

                .setFirstName("Sergey")
                .setLastName("Starostin")
                .setEmail("adelaide.star@sss.com")
                .setGender()
                .setUserNumber("89992525543")
                .setBirtdate("29", "June", "1989")
                .setSubject()
                .setSport()
                .uploadPicture()
                .setAddress("Best street ever, Saint Petersburg")
                .setState()
                .setCity();

        registrationFormPage.submitForm();

        registrationFormPage.checkTable()
                .checkResult("Student Name", "Sergey Starostin")
                .checkResult1("Student Email", "adelaide.star@sss.com")
                .checkResult2("Gender", "Male");

    }

}
