package it.epicode.week2.day3.esercizio;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Products> products;
    private Customer customer;

    // Costruttore
    public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Products> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    // Metodi Getter
    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Products> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Metodi Setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", products=" + products + ", customer=" + customer + "]";
    }

}
