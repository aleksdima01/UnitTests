package seminar1.hw;

public class Product implements Comparable<Product> {
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

    @Override
    public int compareTo(Product o) {
        return this.getCost() - o.getCost();
    }

}
