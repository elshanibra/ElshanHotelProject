package az.iktlab.elshanhotelproject.dao.repository;

import az.iktlab.elshanhotelproject.dao.entity.ImageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<ImageEntity,Long> {
}
