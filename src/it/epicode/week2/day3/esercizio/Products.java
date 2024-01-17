package it.epicode.week2.day3.esercizio;

public class Products {
    private Long id;
    private String name;
    private String category;
    private Double price;

    public Products(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Metodi Getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }

}
