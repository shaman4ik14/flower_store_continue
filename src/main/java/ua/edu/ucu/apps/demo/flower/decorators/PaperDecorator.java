package ua.edu.ucu.apps.demo.flower.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.demo.item.Item;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {
        return 13 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " with Paper decorator");
        return item.getDescription();
    }
}
