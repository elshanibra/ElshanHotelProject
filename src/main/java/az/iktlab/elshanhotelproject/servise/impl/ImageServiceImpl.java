package az.iktlab.elshanhotelproject.servise.impl;

import az.iktlab.elshanhotelproject.dao.entity.ImageEntity;
import az.iktlab.elshanhotelproject.dao.repository.ImageRepository;
import az.iktlab.elshanhotelproject.model.ImageDto;
import az.iktlab.elshanhotelproject.servise.ImageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public void add(ImageDto dto) {
        ImageEntity imageEntity=new ImageEntity();
        imageEntity.setName(dto.getName());
        imageEntity.setImageUrl(dto.getImageUrl());
        imageRepository.save(imageEntity);
    }

    @Override
    public ImageDto findById(Long id) {
        ImageEntity imageEntity=imageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not founded"));
        ImageDto dto=new ImageDto();
        dto.setName(imageEntity.getName());
        dto.setImageUrl(imageEntity.getImageUrl());
        return dto;
    }

    @Override
    public List<ImageDto> getAll() {
        List<ImageEntity> images=(List<ImageEntity>) imageRepository.findAll();

        return images.stream()
                .map(imageEntity -> new ImageDto(imageEntity.getName(),imageEntity.getImageUrl()))
                .collect(Collectors.toList());
    }

    @Override
    public void update(ImageDto dto, Long id) {
        ImageEntity imageEntity=imageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not founded"));
        imageEntity.setName(dto.getName());
        imageEntity.setImageUrl(dto.getImageUrl());
        imageRepository.save(imageEntity);

    }

    @Override
    public void deleteById(Long id) {
        imageRepository.deleteById(id);

    }
}
