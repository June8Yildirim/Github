package Hostel;

import java.util.ArrayList;

public class Apartment {
    ArrayList<Oblong> rooms = new ArrayList<>();
    Oblong Room1 = new Oblong(5.2, 4.7);

    public void addRoom(Oblong Room) {
        rooms.add(Room);
    }

    public double getRoomArea(int roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            if (i == roomNumber) {
                return rooms.get(i).calculateArea();
            }
        }
        return -1;
    }

    public double getRoomHeight(int roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            if (i == roomNumber) {
                return rooms.get(i).getHeight();
            }
        }
        return -1;
    }

    public double getRoomLength(int roomNumber) {
        for (int i = 0; i < rooms.size(); i++) {
            if (i == roomNumber) {
                return rooms.get(i).getLength();
            }
        }
        return -1;
    }

}
