package Hostel;

public class TimeTable {
    private Booking[][] times;

    public TimeTable(int numberWeek, int numberDay) {
        this.times = new Booking[numberDay][numberDay];
    }

    //    public TimeTable(int numberWeek, int numberDay) {
//        this.times= Booking[numberWeek][numberDay];
//    }

    public boolean makeBooking(int week, int day, Booking booking) {
        return times[week][day] == null;
    }

    public boolean cancelBooking(int week, int day) {
        if (times[week][day] == null) {
            return false;
        } else {
            times[week][day] = null;
            return true;
        }
    }

    public boolean isFree(int week, int day) {
        if (times[week][day] == null) {
            return true;
        } else {
            return false;
        }
    }

    public Booking getBooking(int week, int day) {
        return times[week][day];
    }

}
