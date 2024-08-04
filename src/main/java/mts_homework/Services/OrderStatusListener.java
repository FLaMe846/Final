package mts_homework.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusListener {
    @Autowired
    private OrderService orderService;

    @KafkaListener(topics = "order-status", groupId = "order_group")
    public void listen(OrderStatusNotification notification) {
        orderService.updateOrderStatus(notification.getOrderId(), notification.getStatus());
    }
}