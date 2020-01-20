package model;

public enum RoomNumber {
    A("Sensational"),
    B("Adventure"),
    C("Famili"),
    D("Terror"),
    E("Comedy");

    private String roomName;

    RoomNumber(String roomName) {
        this.roomName = roomName;
    }
}
