package Hostel;

public class Booking {
    private String room;
    private String name;

    public Booking(String room, String name){
        this.name= name;
        this.room = room;
    }

    public String getRoom(){
        return room;
    }
    public  String getName(){
        return name;
    }

}
