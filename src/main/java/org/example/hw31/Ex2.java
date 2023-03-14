package org.example.hw31;

import org.example.hw31.model.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Products produkt1 = new Products("болт", "Россия", 1.0, 1.0, 1);
        Products produkt2 = new Products("гайка", "Китай", 1.0, 1.0, 2);
        Products produkt3 = new Products("шайба", "Россия", 1.0, 3.0, 2);
        Products produkt4 = new Products("винт", "Сербия", 1.0, 1.0, 1);
        Products produkt5 = new Products("шуруп", "Индонезия", 1.0, 1.5, 2);

        List<Products> productsList = new ArrayList<>();
        productsList.add(produkt1);
        productsList.add(produkt2);
        productsList.add(produkt3);
        productsList.add(produkt4);
        productsList.add(produkt5);


        Scanner sc = new Scanner(System.in);
        int searchSort = sc.nextInt();
        double minPrice = 1.7e+308;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getPrice() < minPrice & productsList.get(i).getSort() == searchSort) {
                minPrice = productsList.get(i).getPrice();
            }
        }
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getPrice() == minPrice & productsList.get(i).getSort() == searchSort) {
                System.out.println(productsList.get(i).getName());
            }
        }
    }
}
