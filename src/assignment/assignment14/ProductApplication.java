package assignment.assignment14;

import java.util.ArrayList;
import java.util.Collections;

import static assignment.assignment14.MyUtils.iterateList;

public class ProductApplication{
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Macbook Air", "1700"));
        productList.add(new Product(2, "Dell ", "1000"));
        productList.add(new Product(3, "Samsung Expressa", "990"));
        productList.add(new Product(4, "Samsung Elite", "1320"));

        System.out.println("before sorting ...");
        iterateList(productList);

        System.out.println("Sorting done .....");

        Collections.sort(productList);
        iterateList(productList);


    }



}
