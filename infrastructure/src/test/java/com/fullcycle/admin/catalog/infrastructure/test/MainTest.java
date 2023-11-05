package com.fullcycle.admin.catalog.infrastructure.test;

import com.fullcycle.admin.catalog.infrastructure.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain(){
        Assertions.assertNull(new Main());
        Main.main(new String[]{});
    }
}
