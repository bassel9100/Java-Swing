import java.sql.Time;

public class Flight {
    private String no, destination, comment;
    private TimePoint dep, arr;

    public Flight(String no, String destination, int depHour, int depMin, int arrHour, int arrMin){
        this.no = no;
        this.destination = destination;
        dep = new TimePoint(depHour, depMin);
        arr = new TimePoint(arrHour, arrMin);
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public String getNo(){
        return no;
    }

    public String getDestination(){
        return destination;
    }

    public TimePoint getDeparture(){
        return new TimePoint(dep.getHour(), dep.getMin());
    }

    public TimePoint getArrival(){
        return new TimePoint(arr.getHour(), arr.getMin());
    }

    public void delay(int minutes){
        dep.tick(minutes);
        arr.tick(minutes);
        setComment("Delayed by " + minutes + " minutes");
    }

    @Override
    public String toString(){
        return no + " " + destination + " " + dep.toString() + " " + comment;
    }
}
