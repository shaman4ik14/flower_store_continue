package ua.edu.ucu.apps.demo.flower.decorators;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.demo.item.Item;

@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
