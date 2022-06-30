package com.pages.components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Calendar2 {
    public void stableCalendar(String day, String month, String year) {
        $("[class=react-datepicker__month-select]").click();
        $("[class=react-datepicker__month-select]").selectOption(month);
        $("[class=react-datepicker__year-select]").click();
        $("[class=react-datepicker__year-select]").selectOptionByValue(year);
        $(By.className("react-datepicker__day--0" + day)).click();
    }
}
