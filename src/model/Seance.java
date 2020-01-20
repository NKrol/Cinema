package model;

import java.io.Serializable;

public class Seance extends Film implements Serializable {

    private String cinemaName;
    private int numbersOfSeats;
    private RoomNumber roomNumber;


    public Seance(String title, String type, String rokProdukcji, String production, String cinemaName, int numbersOfSeats, RoomNumber roomNumber) {
        super(title, type, rokProdukcji, production);
        this.cinemaName = cinemaName;
        this.numbersOfSeats = numbersOfSeats;
        this.roomNumber = roomNumber;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setNumbersOfSeats(int numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    public RoomNumber getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(RoomNumber roomNumber) {
        this.roomNumber = roomNumber;
    }
}
