package com.lerning.BookMyShow.daos;

import com.lerning.BookMyShow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoookingDao extends JpaRepository<Booking,Long> {

//    @Override
//    <S extends Booking> S save(S entity);

    Booking save(Booking booking);

}
