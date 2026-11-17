package services;

import models.Category;
import java.util.ArrayList;

public class CategoryService {

    private ArrayList<Category> categories = new ArrayList<>();

    public void addCategory(Category category) {
        categories.add(category);
    }

    public Category getCategoryById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public void displayCategories() {
        for (Category category : categories) {
            System.out.println("id: " + category.getId() + " Name: " + category.getName());
        }
    }

}