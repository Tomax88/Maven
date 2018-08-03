package com.academy.lesson10.fx.validator;

import com.academy.lesson10.fx.model.RegistrationForm;

public interface Validator<T> {
    boolean validate(T form);
    String getMsgError();

    boolean validate(RegistrationForm registrationForm);
}
