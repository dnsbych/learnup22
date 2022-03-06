package ru.learnup.vtb.operasales.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learnup.vtb.operasales.repository.entities.EventEntity;

public interface EventsRepository extends JpaRepository<EventEntity, Long> {

    void deleteById(Long id);
}
