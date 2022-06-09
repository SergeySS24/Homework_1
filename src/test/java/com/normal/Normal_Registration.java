package com.normal;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Normal_Registration {

    @BeforeAll
    static void SetUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        }

    @Test
    void FillNormalForm() {

        open("/automation-practice-form");

        //$(By.className("mr-sm-2")).setValue("dqwdw");
       // $(By.id("firstName")).setValue("ffff");
        $("[id=firstName]").setValue("Sergey");
        $("[id=lastName]").setValue("Starostin");
        $("[id=userEmail]").setValue("adelaide.star@sss.com");

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

        //$("#uploadPicture").uploadFile(new File("D:/My Docs/960.jpg"));
        $(By.id("uploadPicture")).uploadFile(new File("D:/My Docs/960.jpg"));

    }








}
