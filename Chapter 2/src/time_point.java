public class time_point {
    int sec, min, hour;
    boolean showSec = false;

    public void setTime(int hour, int min, int sec) {
        if (hour > 24 || min > 60 || sec > 60 || hour <= 0 || min <= 0 || sec <= 0)
            System.out.println("Wrong time values, check you values and try again!");
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public time_point(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public time_point(int hour, int min){
        this.hour = hour;
        this.min = min;
        setShowSec(false);
    }

    public void setShowSec(boolean x) {
        showSec = x;
    }

    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }
    @Override
    public String toString(){
        if(showSec)
            return hour + ":" + min + ":" + sec;
        return hour + ":" + min;
    }

    public void tick(){
        sec += 1;
        if(sec == 60){
            min += 1;
            sec = 0;
        }
        if(min == 60){
            hour += 1;
            min = 0;
        }
        if(hour == 24){
            hour = 0;
        }
    }
}
