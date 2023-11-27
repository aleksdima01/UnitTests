package seminar1.hw;


import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {


    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 130);
        Product cookie = new Product("Печенье", 130);
        Product sugar = new Product("Сахар", 70);
        Product bread = new Product("Хлеб", 45);
        Product meat = new Product("Мясо", 870);
        Product eggs = new Product("Яйца", 90);
        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(milk);
        list1.add(cookie);
        list1.add(sugar);
        list1.add(bread);
        list1.add(meat);
        list1.add(eggs);
        System.out.println(list1);
        Shop shop = new Shop();
        shop.setProducts(list1);
        assertThat(shop.getProducts()).isNotEmpty();
        assertThat(shop.getProducts()).isNotNull();
        assertThat(shop.getProducts()).hasSize(6).contains(cookie).contains(bread).contains(milk).contains(meat).contains(eggs).contains(sugar);
        assert 870 == shop.getMostExpensiveProduct().getCost();
        System.out.println(shop.getMostExpensiveProduct());
        shop.getSortedListProducts();
        assertThat(list1.get(0).getCost()).isEqualTo(45);
        assertThat(list1.get(1).getCost()).isEqualTo(70);
        assertThat(list1.get(2).getCost()).isEqualTo(90);
        assertThat(list1.get(3).getCost()).isEqualTo(130);
        assertThat(list1.get(5).getCost()).isEqualTo(870);
        System.out.println(shop.getProducts());
    }
}




