import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingServiceInterface {


    protected BookingServiceImpl() throws RemoteException {
        super();

    }

    @Override
    public void route(Trip trip)
            throws RemoteException {
        System.out.println("------------------------------------");

        System.out.println("Saindo de: "+ trip.getLeaving_from());
        System.out.println("Para: " + trip.getGoing_to());

        System.out.println("Data de Saida: " + trip.getLeaving_date());
        System.out.println("Data de Retorno: " + trip.getArriving_date());

        System.out.println("Voo Direto: " + trip.getDirect_flight());

        System.out.println("Código do Voo: " + trip.getTrip_code());

        System.out.println("------------------------------------");
    }
}
