package firstHibernate_app.first_hibernate_app_001;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class TestFlight 
{
    public static void main( String[] args )
    {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
//        
//        Flight flight = new Flight();
//		flight.setFlight_name("DL1091790");
//        
//        session.beginTransaction();
//        session.save(flight);
//        session.getTransaction().commit();
//		session.close();
		// Only once i close the session then the object is removed from the session,
		// hence you need to open a session
		// again.

		// Code for One TO One
		Session session2 = sessionFactory.openSession();
		Flight flight = new Flight();
		flight.setFlight_name("DL10917902312");

		FlightCompany flightCompany = new FlightCompany();
		flightCompany.setCompanyName("Jet Airways");

		PassengerDetails passenger = new PassengerDetails();
		passenger.setPassengerId(1);
		passenger.setPassengerName("Vishal");

		PassengerDetails passenger1 = new PassengerDetails();
		passenger.setPassengerId(2);
		passenger.setPassengerName("Vishal2");

		

		ArrayList<PassengerDetails> listOfPassenger = new ArrayList<PassengerDetails>() ;
		listOfPassenger.add(passenger);
		listOfPassenger.add(passenger1);

		flight.setPasenger(listOfPassenger);
				
		session2.beginTransaction();
		session2.save(passenger);
		session2.save(flight);
		session2.getTransaction().commit();
		session2.close();

    }
}
