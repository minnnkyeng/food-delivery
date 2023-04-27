package xyz.minnn.food.service;

import org.springframework.stereotype.Service;
import xyz.minnn.food.repository.FoodRepository;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
}
