package com.fullcycle.admin.catalog.domain.category;

import com.fullcycle.admin.catalog.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {
    @Test
    public void givenAvalidParameters_whenCallNewCategory_thenInstantiateACategory(){
        final var expectedName = "Filmes";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory =
                Category.newCategory(expectedName, expectedDescription, expectedIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNull(actualCategory.getId());
        Assertions.assertEquals(expectedName, actualCategory.getName());
        Assertions.assertEquals(expectedDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectedDescription, actualCategory.getCreatedAt());
        Assertions.assertEquals(expectedDescription, actualCategory.getUpdatedAt());
        Assertions.assertEquals(expectedDescription, actualCategory.getDeletedAt());
        Assertions.assertEquals(expectedIsActive, actualCategory.isActive());

    }
}
