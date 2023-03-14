package org.example.hw3;

import org.example.hw3.model.Products;

import java.util.ArrayList;
import java.util.List;

/*
   Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену
   товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
    */
public class Ex1 {
    public static void main(String[] args) {
        Products product1 = new Products("высший стул", 5.0, 1);
        Products product2 = new Products("шкаф", 20.0, 1);
        Products product3 = new Products("стеллаж", 15.0, 2);
        Products product4 = new Products("высший стол", 13.0, 2);
        Products product5 = new Products("высший стол", 15.0, 1);


        List<Products> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);

        double priceMax = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getName().contains("высший") & productsList.get(i).getSort() == 1 | productsList.get(i).getSort() == 2){
                if (productsList.get(i).getPrice() > priceMax){
                    priceMax = productsList.get(i).getPrice();
                }
            }
        }
        System.out.println("наибольшая цена = "+ priceMax);
    }
}