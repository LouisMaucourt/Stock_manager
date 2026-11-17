package services;

import models.Product;
import java.util.ArrayList;

public class ProductService{

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public int getProductCount(){
        return products.size();
    }
    public void displayProduct(){
        for(Product product: products){
            System.out.println("id:" + " " + product.getId() + " Title:" + product.getTitle() + "Catégorie : "+ product.getCategoryName() + " Price :" + product.getPrice() + " Stock:" + product.getStock());
        }
    }
    public boolean removeProduct(int id){
        for(Product product: products){
            if(product.getId() == id){
                products.remove(product);
                return true;
            }
        }
        return false;
    }
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public void displayProductByCategory(int categoryId) {
        for (Product product : products) {
            if (product.getCategory() != null &&
                product.getCategory().getId() == categoryId) {

                System.out.println("Produit de la catégorie " + categoryId +" | ID: " + product.getId() +" | Title: " + product.getTitle() +" | Price: " + product.getPrice());
            }
        }
    }
    public boolean updateProductPrice(int id, int price){
        Product product = getProductById(id);
        if(product == null) return false;
        product.setPrice(price);
        return true;
    }
    public boolean editProduct(int id, String title, String description, int price, int stock) {
    Product product = getProductById(id);

    if (product == null) return false;

    product.setTitle(title);
    product.setDescription(description);
    product.setPrice(price);
    product.setStock(stock);

    return true;
}

}