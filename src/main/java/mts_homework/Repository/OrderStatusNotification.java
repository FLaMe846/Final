package mts_homework.Repository;

import lombok.*;
import jakarta.persistence.*;
import java.util.Collection;
import java.util.List;
@Getter
@Setter
public class OrderStatusNotification {
    private Long orderId;
    private String status;
}
