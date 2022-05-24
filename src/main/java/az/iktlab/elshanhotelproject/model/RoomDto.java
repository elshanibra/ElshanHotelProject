package az.iktlab.elshanhotelproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private BigDecimal price;
    private byte floorNumber;
    private byte humanCapacity;
    private RoomStatus roomStatus;
    private RoomType roomType;
    private Boolean enterRoomDirectParking;
}
