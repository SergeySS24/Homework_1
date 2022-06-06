package com.SS1;

import com.codeborne.selenide.ClickMethod;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.Click;
import com.codeborne.selenide.commands.UploadFile;
import com.codeborne.selenide.impl.ElementFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

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

        //Month
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__month-select]").click();
        $(By.className("react-datepicker__month-select")).selectOptionByValue("7");

        //Year
        $("[class=react-datepicker__year-select]").click(); //способ №1
        $(By.className("react-datepicker__year-select")).click();  //способ №2

        $(By.className("react-datepicker__year-select")).selectOptionByValue("1989"); //способ №1
        $("[class=react-datepicker__year-select]").selectOptionByValue("1989"); //способ №2


        $(byText("16")).click();


        //Почему не работает?
        //$("[class=react-datepicker__day react-datepicker__day--016 react-datepicker__day--selected]").click();


        //Subjects
        $("[id=subjectsContainer]").click();
        //$(By.className("css-2b097c-container")).click();
        //$("[class=css-2b097c-container]").click(); // почему не работает?


        //Всякие лишние проверки
        $(By.className("css-2b097c-container")).shouldBe(enabled); //способ №1
        $("[id=subjectsContainer]").shouldBe(enabled); //способ №2


        $(By.id("subjectsInput")).setValue("Arts").pressEnter();
        //$("#subjectsInput").setValue("English").pressEnter(); //способ №2

        //Hobbies
        $(byText("Sports")).click();


        //Picture
        //$(byText("Select picture")).click();
        //$("[id=uploadPicture]").click();// почему не работает?

        $("#uploadPicture").uploadFile(new File("D:/My Docs/960.jpg"));


        //Current address
        $("[id=currentAddress]").setValue("Best street ever, Saint Petersburg");


        //State and City
        $(By.className("css-1g6gooi")).click();
        $(By.id("react-select-3-input")).setValue("NCR").pressEnter();

        $(By.className("css-1hwfws3")).click();
        $(By.id("react-select-4-input")).setValue("Delhi").pressEnter();

        $(By.id("submit")).click();

        $(By.className("table")).shouldHave(text("Student Name"));
        $(By.className("table")).shouldHave(text("Sergey Starostin"));
        $(By.className("table")).shouldHave(text("Student Email"));
        $(By.className("table")).shouldHave(text("Male"));
        $(By.className("table")).shouldHave(text("8911123456"));
        $(By.className("table")).shouldHave(text("16 August,1989"));
        $(By.className("table")).shouldHave(text("Arts"));
        $(By.className("table")).shouldHave(text("Sports"));
        $(By.className("table")).shouldHave(text("Best street ever, Saint Petersburg"));
        $(By.className("table")).shouldHave(text("NCR Delhi"));

        $(By.className("table")).shouldHave(text("Student Name")).shouldHave(text("Sergey Starostin")).equals(true);


        $(By.id("closeLargeModal")).click();


    }
}
