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
        //$("[id=subjectsContainer]").click();
        //$(By.className("css-2b097c-container")).click();
        //$("[class=css-2b097c-container]").click(); // почему не работает?


        $(By.className("css-2b097c-container")).shouldBe(enabled); //способ №1
        $("[id=subjectsContainer]").shouldBe(enabled); //способ №2

        $("[id=subjectsContainer]").click();

        $(By.className("css-yk16xz-control")).shouldBe(enabled);
        $(By.className("subjects-auto-complete__value-container")).shouldBe(enabled);

        $(By.className("subjects-auto-complete__value-container")).getValue();
        //$(By.className("subjects-auto-complete__value-container")).selectOption("Arts");

        //$(By.className("subjects-auto-complete__indicators css-1wy0on6")).setValue("a");
        //$("[class=subjects-auto-complete__value-container]").setValue("Arts");

        //$(By.className("css-1laao21-a11Text")).setValue("a");
        //$("[class=css-12jo7m5]").selectOptionByValue("Arts");


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
        $(By.className("css-1g6gooi")).("NCR");


        //css-1uccc91-singleValue

    }
}
