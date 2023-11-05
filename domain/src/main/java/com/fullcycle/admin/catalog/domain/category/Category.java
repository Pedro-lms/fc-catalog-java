package com.fullcycle.admin.catalog.domain.category;

import com.fullcycle.admin.catalog.domain.AggregateRoot;

import java.time.Instant;

public class Category extends AggregateRoot<CategoryID> {
    private CategoryID anId;
    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    public Category(
                    final String anId,
                    final String aName,
                    final String aDescription,
                    final boolean isActive,
                    final Instant aCreationDate,
                    final Instant aUpdatedDate,
                    final Instant aDeleteDate
    ) {
        super(CategoryID.from(anId));
        this.name = name;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }


    public static Category newCategory(final String aName, final String aDescription, final boolean isActive) {
        final var id = CategoryID.unique();
        final var now = Instant.now();
        final var deletedAt = isActive ? null : now;
        return new Category("id", aName, aDescription, isActive, now, now, deletedAt);
    }


    @Override
    public CategoryID getId() {
        return super.getId();
    }

    public void setAnId(CategoryID anId) {
        this.anId = anId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }


}
