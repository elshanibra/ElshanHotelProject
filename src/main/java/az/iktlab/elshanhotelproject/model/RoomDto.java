package az.iktlab.elshanhotelproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private int salary;
    private byte floorNumber;
    private byte humanCapacity;
    private RoomStatus roomStatus;
    private RoomType roomType;
    private Boolean enterRoomDirectParking;
}
