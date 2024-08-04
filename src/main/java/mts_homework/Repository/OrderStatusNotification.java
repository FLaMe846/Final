package mts_homework.Repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderStatusNotification {
    private Long orderId;
    private String status;
}
