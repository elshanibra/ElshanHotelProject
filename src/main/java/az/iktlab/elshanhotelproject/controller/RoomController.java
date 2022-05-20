package az.iktlab.elshanhotelproject.controller;

import az.iktlab.elshanhotelproject.model.RoomDto;
import az.iktlab.elshanhotelproject.servise.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    @PostMapping
    public void add(@RequestBody RoomDto dto) {
        roomService.add(dto);

    }

    @GetMapping("/{id}")
    public RoomDto findById(@PathVariable Long id) {
        return roomService.findById(id);}

    @GetMapping
    public List<RoomDto> getAll() {
        return   roomService.getAll();

    }

    @PutMapping("/{id}")
    public void update(@RequestBody RoomDto dto,@PathVariable Long id) {
        roomService.update(dto,id);

    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        roomService.deleteById(id);

    }


}
