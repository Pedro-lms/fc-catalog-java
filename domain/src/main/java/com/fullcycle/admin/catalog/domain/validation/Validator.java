package com.fullcycle.admin.catalog.domain.validation;

public abstract class Validator {
    private final ValidationHandler handler;

    protected Validator(final ValidationHandler handler) {
        this.handler = handler;
    }

    protected abstract void validate();
    protected ValidationHandler validationHandler(){
        return this.handler;
    }
}
