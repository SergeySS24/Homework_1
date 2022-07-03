package com.pages.PageObjects.components;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $("[class=react-datepicker__month-select]").selectOption(month);
        $("[class=react-datepicker__year-select]").selectOptionByValue(year);
        $(By.className("react-datepicker__day--0" + day)).click();
    }
}
