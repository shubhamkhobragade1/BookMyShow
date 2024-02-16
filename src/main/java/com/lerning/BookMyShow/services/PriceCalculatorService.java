package com.lerning.BookMyShow.services;

import com.lerning.BookMyShow.daos.ShowSeatPriceDao;
import com.lerning.BookMyShow.models.Show;
import com.lerning.BookMyShow.models.ShowSeat;
import com.lerning.BookMyShow.models.ShowSeatPrice;

import java.util.List;

public class PriceCalculatorService {

    private ShowSeatPriceDao showSeatPriceDao;

    public int  calculatePrice(List<ShowSeat> showSeatList, Show show){
        // get all seats of show
        List<ShowSeatPrice> showSeatPriceList=showSeatPriceDao.findAllByShow(show);

        int amount=0;

        for (ShowSeatPrice seatPrice: showSeatPriceList){
            for (ShowSeat showSeat:showSeatList){
                if (seatPrice.getSeatType().equals(showSeat.getSeat().getSeatType())){
                    amount+=seatPrice.getPrice();
                    break;
                }
            }
        }
        return amount;


    }

}
