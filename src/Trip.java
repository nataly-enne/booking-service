import java.io.Serializable;
import java.util.Random;

public class Trip implements Serializable {
    private String leaving_from;
    private String going_to;
    private String leaving_date;
    private String arriving_date;
    private Boolean isDirect_flight = false;

    private Random gerador = new Random();
    private int trip_code = gerador.nextInt(2000000) + 1000000;

    public Trip() {

    }
    public Trip(String leaving_from, String going_to) {
        this.leaving_from = leaving_from;
        this.going_to = going_to;
    }

    public String getLeaving_from() {
        return leaving_from;
    }

    public void setLeaving_from(String leaving_from) {
        this.leaving_from = leaving_from;
    }

    public String getGoing_to() {
        return going_to;
    }

    public void setGoing_to(String going_to) {
        this.going_to = going_to;
    }

    public String getLeaving_date() {
        return leaving_date;
    }

    public void setLeaving_date(String leaving_date) {
        this.leaving_date = leaving_date;
    }

    public String getArriving_date() {
        return arriving_date;
    }

    public void setArriving_date(String arriving_date) {
        this.arriving_date = arriving_date;
    }

    public Boolean getDirect_flight() {
        return isDirect_flight;
    }

    public void setDirect_flight(char direct_flight) {

        if(direct_flight == 's' || direct_flight == 'S') {
            isDirect_flight = true;
        }
    }

    public int getTrip_code() {
        return trip_code;
    }
}
