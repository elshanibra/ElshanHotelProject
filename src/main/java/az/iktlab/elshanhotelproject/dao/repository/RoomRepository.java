package az.iktlab.elshanhotelproject.dao.repository;

import az.iktlab.elshanhotelproject.dao.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity,Long> {
}
