package org.Pluralsight;

public class Reservation {
    private String getRoomType;
    private int getPrice;
    private int getNumberOfNights;
    private boolean isWeekend;
    private int ReservationTotal;

    public Reservation(String getRoomType, int getPrice, int getNumberOfNights, boolean isWeekend, int ReservationTotal) {
        this.getRoomType = getRoomType;
        this.getPrice = getPrice;
        this.getNumberOfNights = getNumberOfNights;
        this.isWeekend = isWeekend;
        this.ReservationTotal = ReservationTotal;
    }

    public String getRoomType() {
        return getRoomType;
    }

    public void setGetRoomType(String getRoomType) {
        this.getRoomType = getRoomType;
    }

    public int getPrice() {
        return getPrice;
    }

    public void setGetPrice(int getPrice) {
        this.getPrice = getPrice;
    }

    public int getNumberOfNights() {
        return getNumberOfNights;
    }

    public void setGetNumberOfNights(int getNumberOfNights) {
        this.getNumberOfNights = getNumberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getReservationTotal() {
        return ReservationTotal;
    }

    public void setReservationTotal(int reservationTotal) {
        ReservationTotal = reservationTotal;
    }
}








