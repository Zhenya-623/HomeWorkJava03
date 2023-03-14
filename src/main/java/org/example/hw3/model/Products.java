package org.example.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
    private String name;
    private Double price;
    private int sort;
}