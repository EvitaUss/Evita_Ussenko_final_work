package lv.lu.evita.ussenko.finalwork;

import lv.lu.evita.ussenko.finalwork.model.Product;
import lv.lu.evita.ussenko.finalwork.repository.ProductRepository;
import lv.lu.evita.ussenko.finalwork.service.ProductService;
import lv.lu.evita.ussenko.finalwork.ui.ConsulUi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Map<Long, Product> repository = new HashMap<>();
        ProductRepository productRepository = new ProductRepository(repository);
        ProductService productService = new ProductService(productRepository);
        Scanner scanner = new Scanner(System.in);



        new ConsulUi(productService, scanner).run();
    }
}
