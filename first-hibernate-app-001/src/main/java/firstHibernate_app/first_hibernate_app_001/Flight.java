//A flight will have multiple passengers and a passenger can also have many flights.
//A flight will have only one company name.

package firstHibernate_app.first_hibernate_app_001;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//Class to be persisted into the database.
@Entity(name="flight_name")
public class Flight {
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Primary key 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long flight_id;

	private String flight_name;
	
	@OneToMany
	@JoinColumn(name = "Passengers")
	private List<PassengerDetails> passengerListDetails;

	public FlightCompany getCompany() {
		return company;
	}

	public void setCompany(FlightCompany company) {
		this.company = company;
	}

	public void setPasenger(List<PassengerDetails> pasenger) {
		this.passengerListDetails = passengerListDetails;
	}
	// One flight will have only one flight name.
	@OneToOne
	private FlightCompany company;

	public List<PassengerDetails> getPasengerList() {
		return passengerListDetails;
	}


	public long getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(long flight_id) {
		this.flight_id = flight_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
}
