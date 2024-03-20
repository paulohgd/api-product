package com.apiproduct.apiproduct.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
public record ProductRecord() {
    public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
    }
}
