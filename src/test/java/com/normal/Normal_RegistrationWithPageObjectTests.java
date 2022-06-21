package com.normal;

import com.codeborne.selenide.Configuration;
import com.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Normal_RegistrationWithPageObjectTests {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillNormalForm() {


        registrationFormPage.openPage()
                .setFirstName("Sergey")
                .setLastName("Starostin")
                .setUserEmail("adelaide.star@sss.com");

        //      new RegistrationFormPage().setUserEmail("adelaide.star@sss.com"); способ 2
        //      способ 3 (при использовании public void):
        //      RegistrationFormPage registrationFormPage = new RegistrationFormPage();
        //      registrationFormPage.setUserEmail("adelaide.star@sss.com");

        $(byText("Male")).click();
        $(By.id("userNumber")).setValue("89992525543");

        registrationFormPage.setBirthDate("30", "July", "1989");


        $(By.className("subjects-auto-complete__input")).click();

        $(By.id("subjectsInput")).setValue("Arts").pressEnter();
        $(byText("Sports")).click();
        $(By.id("uploadPicture")).uploadFile(new File("D:/My Docs/960.jpg"));
        $("#currentAddress").setValue("Best street ever, Saint Petersburg");
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-3-input")).setValue("NCR").pressEnter();
        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();
        $(By.id("submit")).click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        registrationFormPage.checkResult("Student Name", "Sergey Starostin")
                .checkResult("Student Email", "adelaide.star@sss.com")
                .checkResult("Gender", "Male");
    }


}
