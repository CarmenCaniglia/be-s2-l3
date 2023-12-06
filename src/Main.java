import Entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Book1", "Books", 120.0),
                new Product("Book2","Books", 10.0),
                new Product("Book3","Books", 15.0),
                new Product("Book4","Books", 101.0)
        );

        Predicate<Product> isBook = product -> product.getCategory().equals("Books") && product.getPrice() > 100;
        List<Product> booksOver100 = products.stream().filter(isBook).toList();
        booksOver100.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
    }
}