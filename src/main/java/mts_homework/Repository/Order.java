package mts_homework.Repository;

import javax.persistence.*;
import lombok.*;
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)

    @Column(name = "name", nullable = false)
    private String product;
    private int quantity;
    private String status;
}