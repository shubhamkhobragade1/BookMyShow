package com.lerning.BookMyShow.daos;

import com.lerning.BookMyShow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatDao  extends JpaRepository<ShowSeat,Long> {

    @Override
    List<ShowSeat> findAllById(Iterable<Long> longs);

    // usert=update +insert this save method is doing both operatins
    @Override
    <S extends ShowSeat> S save(S entity);
}
