package ua.edu.ucu.apps.demo.order;

import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
        System.out.println("Payment is done by " + payment.getClass().getSimpleName());
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
        System.out.println("Payment is done by " + delivery.getClass().getSimpleName());
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item: items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
            System.out.println("Items are paid and delivered successfully!");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(Item item) {
        items.remove(item);
        return item;
    }
}
