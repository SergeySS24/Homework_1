package com.TrainingFolder;

import com.codeborne.selenide.Configuration;
import com.pages.training.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Original_Registration_PageObjects1 {

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillNormalForm() {
        new RegistrationFormPage().OpenPage();


        $("#firstName").setValue("Sergey");
        $("#lastName").setValue("Starostin");
        $("#userEmail").setValue("adelaide.star@sss.com");
        $(byText("Male")).click();
        $(By.id("userNumber")).setValue("89992525543");
        $(By.id("dateOfBirthInput")).click();
        $("[class=react-datepicker__month-select]").click();
        $("[class=react-datepicker__month-select]").selectOption("March");
        $("[class=react-datepicker__year-select]").click();
        $("[class=react-datepicker__year-select]").selectOptionByValue("1989");
        $(By.className("react-datepicker__day--019")).click();
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
        $(".table-responsive").shouldHave(text("Sergey Starostin"), text("Male"), text("Arts"));
    }


}
