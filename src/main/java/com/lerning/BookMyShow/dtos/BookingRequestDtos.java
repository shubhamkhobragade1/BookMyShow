package com.lerning.BookMyShow.dtos;

import java.util.List;

public class BookingRequestDtos {

    private Long userId;
    private Long showId;
    private Long BookingId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Long getBookingId() {
        return BookingId;
    }

    public void setBookingId(Long bookingId) {
        BookingId = bookingId;
    }

    public List<Long> getShowSeatIds() {
        return showSeatIds;
    }

    public void setShowSeatIds(List<Long> showSeatIds) {
        this.showSeatIds = showSeatIds;
    }

    private List<Long> showSeatIds;




}
