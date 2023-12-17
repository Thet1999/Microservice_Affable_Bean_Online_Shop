package com.example.affablebeanui.data;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

public record OrderProductResponse(
        String name,
        @JsonProperty("total_amount") double totalAmount,
        @JsonProperty("date_process") LocalDate dateProcess,
        List<Product> products
) {
}
