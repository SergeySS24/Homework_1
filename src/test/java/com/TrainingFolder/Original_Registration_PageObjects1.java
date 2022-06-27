package com.TrainingFolder;

import com.codeborne.selenide.Configuration;
import com.pages.training.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Original_Registration_PageObjects1 {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

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
                .setUserNumber("89992525543");

        registrationFormPage.setBirtdate("29", "June", "1989")
                .setSubject();


        $(byText("Sports")).click();
        $(By.id("uploadPicture")).uploadFile(new File("D:/My Docs/960.jpg"));
        $("#currentAddress").setValue("Best street ever, Saint Petersburg");
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-3-input")).setValue("NCR").pressEnter();
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();
        $(By.id("submit")).click();

        registrationFormPage.checkTable()
                .checkResult("Student Name", "Sergey Starostin")
                .checkResult1("Student Email", "adelaide.star@sss.com")
                .checkResult2("Gender", "Male");

    }

}
