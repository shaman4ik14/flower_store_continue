package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.demo.flower.TulipFlower;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flower.RoseFlower;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.LinkedList;

public class DeliveryTests {
    private LinkedList<Item> items;

    @BeforeEach
    public void init() {
        items = new LinkedList<>();

        items.add(new RoseFlower("white", 5, 200));
        items.add(new TulipFlower("red", 50, 400));

        FlowerBucket newBucket = new FlowerBucket();
        newBucket.addFlowers(new RoseFlower("white", 5, 200));
        newBucket.addFlowers(new TulipFlower("red", 50, 400));

        items.add(newBucket);
    }

    @Test
    public void testDHL() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        dhlStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }

    @Test
    public void testPost() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        postStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }
}
