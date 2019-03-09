package firstHibernate_app.first_hibernate_app_001;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "FlightCompany")
public class FlightCompany {

	@Id
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
