            package com.cloudkitchen.fooditem_ms.repository;

            import com.cloudkitchen.fooditem_ms.model.FoodItem;
            import org.springframework.data.jpa.repository.JpaRepository;

            public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

            }
