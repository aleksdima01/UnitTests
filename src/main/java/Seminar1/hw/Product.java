package Seminar1.hw;

import java.util.ArrayList;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Product(String title, int cost) {
        this.cost = cost;
        this.title = title;
    }

    @Override
    public String toString() {
        return "{" + title +
                "," + cost +
                '}';
    }


    public static void main(String[] args) {
        Product milk = new Product("Молоко", 130);
        Product cookie = new Product("Печенье", 130);
        Product sugar = new Product("Сахар", 70);
        Product bread = new Product("Хлеб", 45);
        Product meat = new Product("Мясо", 870);
        Product eggs = new Product("Яйца", 90);
        ArrayList<Product> list1 = new ArrayList<Product>();
        list1.add(milk);
        list1.add(cookie);
        list1.add(sugar);
        list1.add(bread);
        list1.add(meat);
        list1.add(eggs);
        System.out.println(list1);
    }
}
