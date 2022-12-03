package ua.edu.ucu.apps.demo.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;

@AllArgsConstructor
public class Flower extends Item {
    @Getter @Setter
    private String color;
    @Getter @Setter
    private double petal;
    @Setter
    private double price;

    @Override
    public double price() {
        return price;
    }
}
