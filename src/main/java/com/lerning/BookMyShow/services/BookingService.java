package com.lerning.BookMyShow.services;

import com.lerning.BookMyShow.daos.BoookingDao;
import com.lerning.BookMyShow.daos.ShowDao;
import com.lerning.BookMyShow.daos.ShowSeatDao;
import com.lerning.BookMyShow.daos.UserDao;
import com.lerning.BookMyShow.exceptions.SeatNotAvailableExceptions;
import com.lerning.BookMyShow.exceptions.ShowNotFoundExceptions;
import com.lerning.BookMyShow.exceptions.UserNotFoundExceptions;
import com.lerning.BookMyShow.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@Transactional( isolation = Isolation.SERIALIZABLE);
public class BookingService {
    @Autowired
    private UserDao userDao;
    private ShowDao showDao;
    private ShowSeatDao showSeatDao;
    private BoookingDao bookingDao;
    private PriceCalculatorService priceCalculatorService;
    public Booking bookTicket(Long bookingId, List<Long> showSeatIds, Long userId, Long showId) throws UserNotFoundExceptions, ShowNotFoundExceptions, SeatNotAvailableExceptions {

        Optional userOptional=userDao.findById(userId);

        if (userOptional.isEmpty()){
            throw new UserNotFoundExceptions("user not found for given id");

        }
        User user= (User) userOptional.get();

        Optional showOptional=showDao.findById(userId);

        if (showOptional.isEmpty()){
            throw new ShowNotFoundExceptions("show not found for given id");

        }
        Show show= (Show) showOptional.get();

        List<ShowSeat> seatList=showSeatDao.findAllById(showSeatIds);

        for(ShowSeat showSeat:seatList){
            if (showSeat.getShowSeatStatus()!=ShowSeatStatus.AVAILABLE){
                throw new SeatNotAvailableExceptions(" seat not available");
            }
        }
        // if all show seat available
        for(ShowSeat showSeat:seatList){
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKD);
            showSeatDao.save(showSeat);
        }

        Booking booking=new Booking();
        booking.setUser(user);
        booking.setShowSeatList(seatList);
        booking.setBookingStatus(BookingStatus.IN_PROGRESS);
//        int price=priceCalculatorService.c;
        booking.setAmount(priceCalculatorService.calculatePrice(seatList,show));
        Booking savedBooking =bookingDao.save(booking);
        return savedBooking;
    }
}
