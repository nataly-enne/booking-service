import java.util.Random;

public class Flights {

    private String code;
    private String leaving_from;
    private String going_to;
    private String leaving_date;
    private int flight_capacity;

    private Random gerador = new Random();
    private int flight_code = gerador.nextInt(2000000)+1000000;

    public Flights() {
    }

    public Flights(String code, String leaving_from, String going_to, String leaving_date, int flight_capacity) {
        this.code = code;
        this.leaving_from = leaving_from;
        this.going_to = going_to;
        this.leaving_date = leaving_date;
        this.flight_capacity = flight_capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getFlight_capacity() {
        return flight_capacity;
    }

    public void setFlight_capacity(int flight_capacity) {
        this.flight_capacity = flight_capacity;
    }

    public void decreaseFlightCapacity() {
        this.flight_capacity = this.flight_capacity - 1;
    }

    public String toString() {
        return "\n --------------------------\n"
                + "Codigo: " + this.getCode() + "\nSaida: " + this.getLeaving_from() + "\nDestino: " +this.getGoing_to() +
                "\nData de saida: " + this.getLeaving_date() + "\nCapacidade do aviao: " + this.getFlight_capacity();
    }
}
