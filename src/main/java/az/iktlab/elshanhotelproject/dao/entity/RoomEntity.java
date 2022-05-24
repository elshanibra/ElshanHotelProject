package az.iktlab.elshanhotelproject.dao.entity;

import az.iktlab.elshanhotelproject.model.RoomStatus;
import az.iktlab.elshanhotelproject.model.RoomType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table
@Entity
public class RoomEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "r_id")
private Long id;

@Column(name = "room_salary",nullable = false)
private BigDecimal price;

@Column(name = "floor_number",nullable = false)
private byte floorNumber;

@Column(name = "human_capacity",nullable = false)
private byte humanCapacity;

@Enumerated(EnumType.STRING)
@Column(name = "room_status")
private RoomStatus roomStatus;

@Enumerated(EnumType.STRING)
@Column(name = "room_type")
private RoomType roomType;

@Column(name = "enter_room_direct_parking")
private Boolean enterRoomDirectParking;

@CreationTimestamp
@Column(name = "created_at", columnDefinition = "timestamp default now()",nullable = false)
private LocalDateTime createdAt= LocalDateTime.now();

@UpdateTimestamp
@Column(name = "updated_at", columnDefinition = "timestamp default now()", nullable = false)
private LocalDateTime updatedAt=LocalDateTime.now();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "roomEntity",
            joinColumns = @JoinColumn(name = "r_id", referencedColumnName = "r_id"),
            inverseJoinColumns = @JoinColumn(name = "image_id", referencedColumnName = "i_id"))
    private List<ImageEntity> images;

}
