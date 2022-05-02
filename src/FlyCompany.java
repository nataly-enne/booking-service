import java.util.ArrayList;


public class FlyCompany {

    private String name;
    private ArrayList<String> f_codes = new ArrayList<String>();
    private ArrayList<Flights> flights;
    private Flights flights1 = new Flights("ABC123", "NATAL", "SAO PAULO", "20/05/2021", 182);
    private Flights flights2 = new Flights("ASD133", "JOAO PESSOA", "RIO DE JANEIRO", "21/06/2021", 150);
    private Flights flights3 = new Flights("DEC113", "NATAL", "MOSSORO", "15/01/2022", 50);

    public FlyCompany() {
        flights = new ArrayList<>();

        flights.add(flights1);
        flights.add(flights2);
        flights.add(flights3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flights getFlightsByLeaving(String leaving_from) {
        for (Flights f : flights) {
            if(f.getLeaving_from().compareTo(leaving_from) == 0)
                return f;
        }
        return null;
    }

    public ArrayList<Flights> getAllFlights() {
        return flights;
    }

    public void setNewFlight(Flights f) {
        flights.add(f);
    }

    public String reserveTicket(String flight) {
        for(Flights f : flights){
            if(flight.compareTo(f.getCode()) == 0) {
                f.decreaseFlightCapacity();
                return "Passagem Reservada!";
            }
        }
        return "Voo com código '" + flight + "' não encontrado!";
    }


}
