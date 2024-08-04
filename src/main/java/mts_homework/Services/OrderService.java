package mts_homework.Services;

public class OrderService {

    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        order.setStatus("Placed");
        return orderRepository.save(order);
    }
}
