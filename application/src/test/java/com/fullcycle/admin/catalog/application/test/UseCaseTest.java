package com.fullcycle.admin.catalog.application.test;

import com.fullcycle.admin.catalog.application.UseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {
    @Test
    public void testCreateUseCase(){
        Assertions.assertNotNull(new UseCase());
        Assertions.assertNotNull(new UseCase().execute());
    }
}
