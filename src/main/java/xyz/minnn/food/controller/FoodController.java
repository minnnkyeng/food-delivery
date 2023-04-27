package xyz.minnn.food.controller;

import org.springframework.stereotype.Controller;
import xyz.minnn.food.service.FoodService;

@Controller
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
}
