package az.iktlab.elshanhotelproject.servise;

import az.iktlab.elshanhotelproject.model.RoomDto;

import java.util.List;

public interface RoomService {
    void add( RoomDto dto);


    RoomDto findById( Long id);

    List<RoomDto> getAll();


    void update(RoomDto dto, Long id);

    void deleteById(Long id);
}
