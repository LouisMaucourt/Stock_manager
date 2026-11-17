import models.Product;
import models.Category;
import models.Order;

import services.ProductService;
import services.CategoryService;
import services.OrderService;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        CategoryService categoryService = new CategoryService();
        OrderService orderService = new OrderService();

        Category category1 = new Category(1, "Catégorie 1");
        Category category2 = new Category(2, "Catégorie 2");

        Product product1 = new Product(1, "Produit 1", "Description", 10, 25, category1);
        Product product2 = new Product(2, "Produit 2", "Description", 10, 15, category2);
        Product product3 = new Product(3, "Produit 3", "Description", 10, 50, category2);

        Order order1 = new Order(1, product3, 2);

        categoryService.addCategory(category1);
        categoryService.addCategory(category2);

        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);

        orderService.addOrder(order1);


        categoryService.displayCategories();
        productService.displayProductByCategory(2);
        orderService.displayOrders();


        productService.updateProductPrice(1, 10);
        productService.editProduct(1, "new test 1", "des", 500, 100);
        productService.displayProduct();
        productService.removeProduct(3);

        Product product = productService.getProductById(2);
       
        if (product != null) {
            System.out.println("Produit trouvé : " + product.getId() + " " + product.getTitle());
        } else {
            System.out.println("Produit pas trouvé :'(");
        }

        System.out.println("Nombre de produits : " + productService.getProductCount());
    }
}