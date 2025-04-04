package io.medsys.opteamer.model;

import io.medsys.opteamer.model.enums.OperationRoomState;
import io.medsys.opteamer.model.enums.OperationRoomType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "operation_rooms")
public class OperationRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="room_nr")
    private Integer roomNr;
    @Column(name="building_block")
    private String buildingBlock;
    @Column(name="floor")
    private String floor;
    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private OperationRoomType type;
    @Enumerated(EnumType.STRING)
    @Column(name="state")
    private OperationRoomState state;
}
