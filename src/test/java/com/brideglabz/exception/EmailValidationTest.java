package com.brideglabz.exception;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class EmailValidationTest {
    private final String email;
    private final Boolean expectedResult;
    public EmailValidation emailValidation;

    public EmailValidationTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        emailValidation=new EmailValidation();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});
    }
    @Test
    public void testEmailValidation(){
        System.out.println(email+ "is valid");
        Assert.assertEquals(expectedResult,emailValidation.checkEmail(email));
    }
}
/*Refactor the Code to
throw custom
exceptions in case of
Invalid User Details - Rewrite all Test Cases to take in Custom
Exception for Invalid First Name, Last
Name, Email, Mobile, and Password*/