package az.iktlab.elshanhotelproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    private Long id;
    private String name;
    private String imageUrl;
}
