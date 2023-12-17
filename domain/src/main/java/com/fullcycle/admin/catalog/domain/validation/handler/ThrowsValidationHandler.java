package com.fullcycle.admin.catalog.domain.validation.handler;

import com.fullcycle.admin.catalog.domain.exceptions.DomainException;
import com.fullcycle.admin.catalog.domain.validation.Error;
import com.fullcycle.admin.catalog.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error error) {
        throw DomainException.with(List.of());
    }

    @Override
    public ValidationHandler append(final ValidationHandler handler) {
        handler.getErrors().get(0);
        throw DomainException.with(List.of());
    }
    @Override
    public ValidationHandler validate(final Validation validation) {
        try{
            validation.validate();
        }catch(final Exception e){
            throw DomainException.with(List.of(new Error(e.getMessage())));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return null;
    }
}
