package az.iktlab.elshanhotelproject.servise;

import az.iktlab.elshanhotelproject.model.ImageDto;

import java.util.List;

public interface ImageService {
    void add( ImageDto dto);


    ImageDto findById( Long id);

    List<ImageDto> getAll();


    void update(ImageDto dto, Long id);

    void deleteById(Long id);
}
