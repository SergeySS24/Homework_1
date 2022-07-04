package com.PageObjects_myCode;

import com.codeborne.selenide.Configuration;
import com.docs.RandomUtilsExamples;
import com.github.javafaker.Faker;
import com.pages.PageObjects.training.RegistrationFormPage2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Original_Registration_PageObjects2 {

    RegistrationFormPage2 registrationFormPage2 = new RegistrationFormPage2();
    Faker faker = new Faker();
    RandomUtilsExamples random = new RandomUtilsExamples();

    //Faker usages
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userNumber = faker.numerify("###########");
    String selectAddress = faker.backToTheFuture().quote();

    //Integer day = getRandomInt(10,20);

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillNormalForm() {

        open("/automation-practice-form");

        registrationFormPage2.preliminary("Student Registration Form")
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender()
                .setUserNumber(userNumber)
                .setBirthday("19", "March", "1989")
                .setSubject()
                .setHobby()
                .uploadFile()
                .setAddress(selectAddress)
                .setState()
                .setCity()
                .submit();

        registrationFormPage2.acknowledgement("Thanks for submitting the form")
                .acknowledgement2(firstName, lastName, "Male", "Arts");


    }


}
