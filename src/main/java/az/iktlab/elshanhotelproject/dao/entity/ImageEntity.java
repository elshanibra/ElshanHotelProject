package az.iktlab.elshanhotelproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "i_id")
    private Long id;

    @Column(name = "image_name",nullable = false)
    private String name;

    @Column(name = "image_url",nullable = false)
    private String imageUrl;
}
