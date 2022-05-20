package az.iktlab.elshanhotelproject.controller;

import az.iktlab.elshanhotelproject.model.ImageDto;
import az.iktlab.elshanhotelproject.servise.ImageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }


    @PostMapping
    public void add(@RequestBody ImageDto dto) {
        imageService.add(dto);

    }

    @GetMapping("/{id}")
    public ImageDto findById(@PathVariable Long id) {
        return imageService.findById(id);}

    @GetMapping
    public List<ImageDto> getAll() {
        return   imageService.getAll();

    }

    @PutMapping("/{id}")
    public void update(@RequestBody ImageDto dto,@PathVariable Long id) {
        imageService.update(dto,id);

    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        imageService.deleteById(id);

    }
}
