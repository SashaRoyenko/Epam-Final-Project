package com.robosh.model.dao;

import com.robosh.model.entity.Dish;
import com.robosh.model.entity.Drink;
import com.robosh.model.entity.OrderProducts;
import com.robosh.model.entity.User;

import java.util.List;

public interface OrderProductsDao extends Dao<OrderProducts> {
    void addDish(Dish dish, OrderProducts orderProducts);
    void addDrink(Drink drink, OrderProducts orderProducts);
    void deleteDish(Dish dish, OrderProducts orderProducts);
    void deleteDrink(Drink drink, OrderProducts orderProducts);
    List<Drink> selectDrinks(User user);
    List<Dish> selectDishes(User user);
}