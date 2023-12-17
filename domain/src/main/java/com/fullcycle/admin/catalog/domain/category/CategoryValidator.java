package com.fullcycle.admin.catalog.domain.category;

import com.fullcycle.admin.catalog.domain.validation.ValidationHandler;
import com.fullcycle.admin.catalog.domain.validation.Validator;

public class CategoryValidator extends Validator {
    private final Category category;
    protected CategoryValidator(final Category category,ValidationHandler handler) {
        super(handler);
        this.category = category;
    }

    @Override
    protected void validate() {

    }
}
