
/**
 * set player for game
 * 
 * @author Ali Rezaee
 * @since 2020.03.25
 * @version 13
 */
public class person {
	// first name
	private String firstName;
	// last name
	private String lastName;

	/**
	 * Constructor for person
	 * 
	 * @param firstname of person
	 * @param lastname  of person
	 */
	public person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * get string of person
	 * 
	 * 
	 * @return compelete name
	 */
	@Override
	public String toString() {
		return "person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	/**
	 * get first name
	 * 
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * get last name
	 * 
	 * @return lastname
	 */
	public String getLastName() {
		return lastName;
	}

}
