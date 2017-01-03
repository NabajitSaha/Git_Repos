
public class Person {
	private String firstname;
	private String lastname;
	private double hourlyRate;
	
	public Person() {
		this.firstname = "John";
		this.lastname = "Doe";
		this.hourlyRate = 10;
	}

	/**
	 * @param firstname
	 * @param lastname
	 * @param hourlyRate
	 */
	public Person(String firstname, String lastname, double hourlyRate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", hourlyRate=" + hourlyRate + "]";
	}
	
	public double getPayment(int hours){
			return this.hourlyRate*hours;
		
	}

}
