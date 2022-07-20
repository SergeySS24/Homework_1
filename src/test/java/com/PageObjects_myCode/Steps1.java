package com.PageObjects_myCode;

import com.pages.PageObjects.training.StepSupport;
import org.junit.jupiter.api.Test;

public class Steps1 {

    StepSupport step = new StepSupport();

    @Test
    public void initiateTests() {
        step.prepareTest();
        step.setFirstName("Sergey");
    }
}
