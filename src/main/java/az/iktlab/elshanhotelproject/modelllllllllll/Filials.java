package az.iktlab.elshanhotelproject.modelllllllllll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filials {
    private Long id;
    private String name;
    private String filialAddress;
    private TypeOfSale typeOfSale;
    private AcceptPayment acceptPayment;


}
