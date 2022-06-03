package com.SS1;

import com.codeborne.selenide.ClickMethod;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.Click;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Registration_Form {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1020";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillFormTest() {

        open("/automation-practice-form");

        //Name, Last name, Email
        $("[id=firstName]").setValue("Sergey");
        $("[id=lastName]").setValue("Starostin");
        $("[id=userEmail]").setValue("sergey@example.com");

        //Gender radio button
        $(byText("Male")).click();

        //Mobile
        $("#userNumber").setValue("89111234567");

        //Date of Birth
        $("[id=dateOfBirthInput]").shouldHave(value("01 Jun 2022"));
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__month-select]").click();




    }
}
