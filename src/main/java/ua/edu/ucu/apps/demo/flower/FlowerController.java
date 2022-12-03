package ua.edu.ucu.apps.demo.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/flower")
@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Flower("blue", 100, 100));
    }
}
