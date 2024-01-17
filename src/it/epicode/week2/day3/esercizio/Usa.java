package it.epicode.week2.day3.esercizio;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Usa{
    public static void main (String[] args) {
        List<Products> productList = createProductList();
        Customer customer1 = new Customer(1L, "Cliente1", 1);
        Customer customer2 = new Customer(2L, "Cliente2", 2);

        List<Order> orders = Arrays.asList(
                new Order(1L, "In corso", LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 20), productList.subList(0, 2), customer1),
                new Order(2L, "Consegnato", LocalDate.of(2021, 2, 5), LocalDate.of(2021, 2, 10), productList.subList(2, 4), customer2),
                new Order(3L, "In corso", LocalDate.of(2021, 3, 1), LocalDate.of(2021, 3, 10), productList.subList(4, 6), customer2)
                // Aggiungi altri ordini con prodotti e clienti diversi
        );

        // Esercizio #1: Prodotti della categoria "Books" con prezzo > 100
        List<Products> expensiveBooks = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                .toList();

        System.out.println("Esercizio #1: " + expensiveBooks);

        // Esercizio #2: Ordini con prodotti della categoria "Baby"
        List<Order> babyOrders = orders.stream()
                .filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory())))
                .toList();

        System.out.println("Esercizio #2: " + babyOrders);

        // Esercizio #3: Prodotti della categoria "Boys" con sconto del 10%
        List<Products> discountedBoysProducts = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> "Boys".equals(product.getCategory()))
                .map(product -> new Products(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9))
                .toList();

        System.out.println("Esercizio #3: " + discountedBoysProducts);

        // Esercizio #4: Prodotti ordinati da clienti di livello (tier) 2 tra l’01-Feb-2021 e l’01-Apr-2021
        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        List<Products> tier2Products = orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2 &&
                        order.getOrderDate().isAfter(startDate) &&
                        order.getOrderDate().isBefore(endDate))
                .flatMap(order -> order.getProducts().stream())
                .toList();

        System.out.println("Esercizio #4: " + tier2Products);
    }

    private static List<Products> createProductList() {
        return Arrays.asList(
                new Products(1L, "Libro di fantascienza", "Books", 120.0),
                new Products(2L, "Pannolini", "Baby", 25.0),
                new Products(3L, "Maglietta per ragazzi", "Boys", 50.0),
                new Products(4L, "Puzzle educativo", "Toys", 15.0),
                new Products(5L, "Laptop", "Electronics", 800.0),
                new Products(6L, "Libro di storia", "Books", 150.0),
                new Products(7L, "Culla", "Baby", 120.0),
                new Products(8L, "Scarpe per ragazzi", "Boys", 40.0),
                new Products(9L, "Gioco educativo", "Toys", 30.0),
                new Products(10L, "Tablet", "Electronics", 600.0)
                // Aggiungi altri prodotti di diverse categorie
        );
    }
}
