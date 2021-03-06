package com.pavelchak.Repository;

import com.pavelchak.domain.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoggerRepository extends JpaRepository<LoggerEntity, Long> {
    List<LoggerEntity> findByPersonLike(String like);
}
