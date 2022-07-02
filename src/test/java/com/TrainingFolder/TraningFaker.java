package com.TrainingFolder;

import com.codeborne.selenide.Configuration;
import com.pages.training.RegistrationFormPage2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TraningFaker {

    RegistrationFormPage2 registrationFormPage2 = new RegistrationFormPage2();
    //Faker faker = new Faker();

    @BeforeAll
    static void SetUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillNormalForm() {

        open("/automation-practice-form");

        // String firstName = faker.name().firstName();
        // String lastName = faker.name().lastName();

        registrationFormPage2.preliminary("Student Registration Form")
                //.setFirstName()
                // .setLastName(lastName)
                .setEmail("adelaide.star@sss.com")
                .setGender()
                .setUserNumber("89992525543")
                .setBirthday("19", "March", "1989")
                .setSubject()
                .setHobby()
                .uploadFile()
                .setAddress("Best street ever, Saint Petersburg")
                .setState()
                .setCity()
                .submit();

        // registrationFormPage2.acknowledgement("Thanks for submitting the form")
        // .acknowledgement2(firstName, lastName,"Male", "Arts");


    }


}
