package services;

import models.Order;
import java.util.ArrayList;

public class OrderService {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println("ORDER : "+ "id: " + order.getId()
                    + " Nom: " + order.getProduct().getTitle()
                    + " Quantité: " + order.getQuantity());
        }
    }
}