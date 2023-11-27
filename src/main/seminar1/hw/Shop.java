package seminar1.hw;

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;


    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Отсортированный по возрастанию и цене список продуктов
     */
    public void getSortedListProducts() {
        Collections.sort(products);
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        return Collections.max(products);
    }
}