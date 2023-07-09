package c.order;

import java.util.ArrayList;

//Credit: https://gist.githubusercontent.com/maggandalf/2328268/raw/c400fb71a4f9a104d2a65b030b8b0b5078dc6126/Order.java
public class Order {

    private Customer customer;
    private int orderNumber;
    private List<Product> purchasedProducts =new ArrayList();

    public Order(Customer user, int orderNumber) {
        super();
        this.customer = user;
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {}

    public String formatEmail() {
        return "Dear "+ customer.getName() + " thank you for placing order. Your order number is "+orderNumber+". The purchase price is "+calculateTotalCost()+"$.";
    }

    public String sendEmail() { ...}

    private double calculateTotalCost() {
        double cost = 0.0D;

        for (Product product : purchasedProducts) {
            cost += product.getPrice();
        }

        return cost;
    }

}