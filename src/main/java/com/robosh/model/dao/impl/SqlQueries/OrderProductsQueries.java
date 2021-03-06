package com.robosh.model.dao.impl.SqlQueries;

public enum OrderProductsQueries {
    GET_TOTAL_DISH_PRICE("select sum(price) as price" +
            " from dish, dishes, order_products " +
            " WHERE " +
            " order_products_id = order_products_dishes_id" +
            " AND" +
            " dishes_dish_id = dish_id" +
            " AND" +
            " user_user_id = (?)"),
    GET_TOTAL_DRINK_PRICE("select sum(drink_price) as price " +
            " from drink, drinks, order_products " +
            " WHERE " +
            " order_products_id = order_products_drinks_id" +
            " AND" +
            " drinks_drink_id = drink_id" +
            " AND" +
            " user_user_id = (?)"),
    CREATE_ORDER_PRODUCTS("INSERT INTO order_products(user_user_id) VALUES((?))"),
    FIND_ORDER_PRODUCTS_BY_ID(
            " SELECT order_products_id, user.* FROM order_products, user" +
                    " WHERE order_products_id = (?)" +
                    " AND user_user_id = user_id"),
    FIND_ORDER_PRODUCTS_BY_USER(
            " SELECT order_products_id from order_products" +
                    " WHERE user_user_id = (?)"),
    FIND_ALL_ORDER_PRODUCTS(
            "SELECT * FROM order_products, user WHERE user_user_id = user_id"),
    DELETE_ORDER_PRODUCTS("DELETE FROM  order_products WHERE user_user_id = (?)"),
    DELETE_DISH_FROM_ORDER_PRODUCTS("DELETE FROM dishes " +
            "WHERE (dishes_dish_id = (?) AND order_products_dishes_id = (?))"),
    DELETE_DRINK_FROM_ORDER_PRODUCTS("DELETE FROM drinks " +
            "WHERE (drinks_drink_id = (?) AND order_products_drinks_id = (?))"),
    ADD_DRINK_TO_ORDER_PRODUCTS("INSERT INTO" +
            " drinks(drinks_drink_id, order_products_drinks_id)" +
            "VALUES((?), (?))"),
    ADD_DISH_TO_ORDER_PRODUCTS("INSERT INTO" +
            " dishes(dishes_dish_id, order_products_dishes_id)" +
            "VALUES((?), (?))"),
    SELECT_DISHES_FROM_ORDER_PRODUCTS("SELECT " +
            "dish.* " +
            "FROM " +
            "dish, " +
            "dishes, " +
            "order_products" +
            " WHERE " +
            "order_products_id = order_products_dishes_id " +
            "AND " +
            "dishes_dish_id = dish_id " +
            "AND " +
            "user_user_id = (?)"),
    SELECT_DRINKS_FROM_ORDER_PRODUCTS("SELECT " +
            "drink.*" +
            "FROM " +
            "drink, " +
            "drinks, " +
            "order_products" +
            " WHERE " +
            "order_products_id = order_products_drinks_id " +
            "AND " +
            "drinks_drink_id = drink_id " +
            "AND " +
            "user_user_id = (?)"),
    IS_ORDER_PRODUCTS_EXIST("Select order_products_id from order_products where user_user_id = (?)");
    String query;

    OrderProductsQueries(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
