package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class FlowerBucket extends Item {
    List<Flower> flower_list = new ArrayList<>();

    public double price() {
        double price = 0;
        for (Flower flower: flower_list) {
            price += flower.price();
        }
        return price;
    }

    public Flower searchFlower(double price) {
        for (Flower flower: flower_list) {
            if (flower.price() == price) {
                return flower;
            }
        }
        return null;
    }

    public void addFlowers(Flower flower){
        flower_list.add(flower);
    }
}
