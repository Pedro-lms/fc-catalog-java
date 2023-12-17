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

    @Test
    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenShouldRecieveError (){
        final String expectedName = null;
        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'name' should not be null";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory =
                Category.newCategory(expectedName, expectedDescription, expectedIsActive);

       final var actualException =
               Assertions.assertThrows(DomainException.class,() -> actualCategory.validate());
       
        Assertions.assertEquals(expectedErrorMessage, actualCategory.getErrors().get(0));
        Assertions.assertEquals(expectedErrorCount, actualCategory.getErrors().get(0));

    }
}
