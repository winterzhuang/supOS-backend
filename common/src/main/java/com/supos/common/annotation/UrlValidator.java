package com.supos.common.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstraintUrlValidator.class)
public @interface UrlValidator {
    String message() default "uns.invalid.url";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
