package Hostel;

public class TimeTable {
    Booking[][] times = new Booking[5][7];

    public TimeTable(int numberWeek, int numberDay){
//        times[numberWeek][numberDay];
    }

    public boolean makeBooking(int week, int day, Booking booking){
        return times[week][day] == null;

    }

    public boolean cancelBooking(int week, int day){
        if (times[week][day] == null){
            return false;
        }else{
            times[week][day] = null;
            return true;
        }
    }


}
