package com.cloudkitchen.fooditem_ms.external;

import com.cloudkitchen.fooditem_ms.dto.FoodIngredientMappingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "foodingredientmapping-ms")
public interface FoodIngredientMappingClient {

    @GetMapping("/api/food-ingredients/{foodItemId}")
    List<FoodIngredientMappingDTO> getMappingsByFoodItemId(@PathVariable("foodItemId") Long foodItemId);
}
