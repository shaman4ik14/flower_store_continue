package ua.edu.ucu.apps.demo.flower.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.demo.item.Item;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator{
    private Item item;

    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " with Ribbon decorator");
        return item.getDescription();
    }
}
