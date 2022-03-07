package ru.learnup.vtb.operasales.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.learnup.vtb.operasales.repository.entities.EventEntity;

import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    void deleteById(Long id);

    EventEntity getById(Long id);

    @Query("from EventEntity e where e.name like :search_str")
    List<EventEntity> getFilter1(String search_str);


    @Query("from EventEntity e order by e.id asc")
    List<EventEntity> getAllOrderById();


}
