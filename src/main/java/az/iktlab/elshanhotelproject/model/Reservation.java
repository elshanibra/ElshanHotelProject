package az.iktlab.elshanhotelproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private long Id;
//    private long roomId; onetomany
    private String username;
    private String guestName;
    private String guestSurname;
    private Gender gender;
}
