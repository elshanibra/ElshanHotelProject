package az.iktlab.elshanhotelproject.dao.entity;

import az.iktlab.elshanhotelproject.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private long Id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "guest_name",nullable = false)
    private String guestName;

    @Column(name = "guest_surname",nullable = false)
    private String guestSurname;

    @Column(name = "guest_gender",nullable = false)
    private Gender gender;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "timestamp default now()",nullable = false)
    private LocalDateTime createdAt= LocalDateTime.now();

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "timestamp default now()", nullable = false)
    private LocalDateTime updatedAt=LocalDateTime.now();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "ReservationEntity",
            joinColumns = @JoinColumn(name = "reservation_id", referencedColumnName = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "r_id", referencedColumnName = "r_id"))
    private List<RoomEntity> rooms;
   
}
