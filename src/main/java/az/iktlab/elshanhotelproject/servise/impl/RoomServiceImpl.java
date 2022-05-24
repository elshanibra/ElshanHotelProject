package az.iktlab.elshanhotelproject.servise.impl;
import az.iktlab.elshanhotelproject.dao.entity.RoomEntity;
import az.iktlab.elshanhotelproject.dao.repository.RoomRepository;
import az.iktlab.elshanhotelproject.model.RoomDto;
import az.iktlab.elshanhotelproject.servise.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void add(RoomDto dto) {
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setPrice(dto.getPrice());
        roomEntity.setFloorNumber(dto.getFloorNumber());
        roomEntity.setHumanCapacity(dto.getHumanCapacity());
        roomEntity.setRoomType(dto.getRoomType());
        roomEntity.setRoomStatus(dto.getRoomStatus());
        roomEntity.setEnterRoomDirectParking(dto.getEnterRoomDirectParking());
        roomRepository.save(roomEntity);


    }

    @Override
    public RoomDto findById(Long id) {
        RoomEntity roomEntity = roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not founded"));
        RoomDto dto = new RoomDto();
        dto.setPrice(roomEntity.getPrice());
        dto.setFloorNumber(roomEntity.getFloorNumber());
        dto.setHumanCapacity(roomEntity.getHumanCapacity());
        dto.setRoomType(roomEntity.getRoomType());
        dto.setRoomStatus(roomEntity.getRoomStatus());
        dto.setEnterRoomDirectParking(roomEntity.getEnterRoomDirectParking());

        return dto;
    }

    @Override
    public List<RoomDto> getAll() {
        List<RoomEntity> rooms = (List<RoomEntity>) roomRepository.findAll();

        return rooms.stream()
                .map(roomEntity -> new RoomDto(roomEntity.getPrice(), roomEntity.getFloorNumber(), roomEntity.getHumanCapacity(),
                        roomEntity.getRoomStatus(), roomEntity.getRoomType(), roomEntity.getEnterRoomDirectParking()))
                .collect(Collectors.toList());

    }

    @Override
    public void update(RoomDto dto, Long id) {
        RoomEntity roomEntity = roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not founded"));
        roomEntity.setPrice(dto.getPrice());
        roomEntity.setFloorNumber(dto.getFloorNumber());
        roomEntity.setHumanCapacity(dto.getHumanCapacity());
        roomEntity.setRoomType(dto.getRoomType());
        roomEntity.setRoomStatus(dto.getRoomStatus());
        roomEntity.setEnterRoomDirectParking(dto.getEnterRoomDirectParking());
        roomRepository.save(roomEntity);


    }

    @Override
    public void deleteById(Long id) {
        roomRepository.deleteById(id);

    }
}
