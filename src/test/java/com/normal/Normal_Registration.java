package com.normal;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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
        $("[id=firstName]").setValue("sss");




    }








}
