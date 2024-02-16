package com.lerning.BookMyShow.dtos;

public class SignUpResponseDto {

    private ResponseStatus responseStatus;
    private Long userId;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
