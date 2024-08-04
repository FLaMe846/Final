package mts_homework;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Order {

    private Long id;

    private String product;
    private int quantity;
    private String status;
}