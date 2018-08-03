package com.academy.lesson10.fx.controller;

import com.academy.fx.model.RegistrationForm;
import com.academy.lesson10.fx.validator.RegistrationValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
class FxValidatorTests {

    private RegistrationValidator validator = new RegistrationValidator() {
        @Override
        public boolean validate(com.academy.lesson10.fx.model.RegistrationForm registrationForm) {
            return false;
        }
    };

    String[] validPasswords = {"1qweEtyuiq", "123Qwerty", "Azerty12!", "R421ghjk"};
    String[] invalidPasswords = {"aaa", "", "12345678", "dsfdsfsfs", "WEQQEQEQ", "123gfhfjk",
            "WERET2ET1", "FgsasGFH", "<script>alert('Hi!');</script>", "!Adnjh1", "~##$$%$^%^fdhf%&*&^*", "Йцукен45!", "!SDE1gy"};

    public void testPasswordValidator(){


        RegistrationForm registrationForm = new RegistrationForm()
                .withFirstName("", "user")
                .withLastName("", "user")
                .withMail("", "test@test.ua")
                .withPassword("", "Azerty12!")
                .withConfirmPassword("", "Azerty12!");

        for (int i = 0; i < validPasswords.length ; i++) {

            registrationForm.withPassword("", validPasswords[i]);
            registrationForm.withConfirmPassword("", validPasswords[i]);
            boolean isValid = validator.validate(registrationForm);
            System.out.println(isValid);
            Assert.assertTrue(isValid);
        }

        System.out.println();

        for (int i = 0; i <invalidPasswords.length ; i++) {

            registrationForm.withPassword("", invalidPasswords[i]);
            registrationForm.withConfirmPassword("", invalidPasswords[i]);
            boolean isValid = validator.validate(registrationForm);
            System.out.println(isValid);
            Assert.assertTrue(!isValid);
        }

        for (int i = 0; i < validPasswords.length ; i++) {
            for (int j = 0; j < invalidPasswords.length ; j++) {

                //password mismatch

                registrationForm.withPassword("", validPasswords[0]);
                registrationForm.withConfirmPassword("", invalidPasswords[0]);
                boolean isValid = validator.validate(registrationForm);
                System.out.println(isValid);
                Assert.assertTrue(!isValid);

                registrationForm.withPassword("", invalidPasswords[0]);
                registrationForm.withConfirmPassword("", validPasswords[0]);
                isValid = validator.validate(registrationForm);
                System.out.println(isValid);
                Assert.assertTrue(!isValid);

            }

        }
    }
}