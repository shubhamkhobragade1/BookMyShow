package com.lerning.BookMyShow.daos;

import com.lerning.BookMyShow.models.Show;
import com.lerning.BookMyShow.models.ShowSeatPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatPriceDao extends JpaRepository<ShowSeatPrice,Long> {



    List<ShowSeatPrice> findAllByShow(Show show);

}
