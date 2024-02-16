package com.lerning.BookMyShow.daos;

import com.lerning.BookMyShow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowDao extends JpaRepository<Show,Long> {

    @Override
    Optional<Show> findById(Long aLong);
}
