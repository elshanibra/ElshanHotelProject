package az.iktlab.elshanhotelproject.modelllllllllll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Storages {
    private long id;
    private Filials theFilialToWhichItBelongs;
    private String storageAddress;
    private int numberOfProducts;
}
