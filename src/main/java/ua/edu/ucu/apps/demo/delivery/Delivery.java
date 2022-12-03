package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.item.Item;

import java.util.LinkedList;

public interface Delivery {
     public void deliver(LinkedList<Item> flowerList);
}
