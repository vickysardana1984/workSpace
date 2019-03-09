package firstHibernate_app.first_hibernate_app_001;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Passenger")
public class PassengerDetails {

	@Id
	private int passengerId;
	private String passengerName;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

}
