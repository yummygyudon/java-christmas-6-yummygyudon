package christmas.domain.repository;

import christmas.domain.entity.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderRepository {
    private static OrderRepository repository;
    private final List<Order> orders ;

    private OrderRepository() {
        orders = new ArrayList<>();
    }

    public static OrderRepository createRepository() {
        if (repository == null) {
            repository = new OrderRepository();
        }
        return repository;
    }
    // init
    public void init() {
        orders.clear();
    }

    // insert
    public void insert(Order order) {
        orders.add(order);
    }

    // select
    public List<Order> findAll() {
        return Collections.unmodifiableList(orders);
    }

    // function


}
