package org.example.hw31.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

@Data
@AllArgsConstructor
public class Products {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private Integer sort;

}
