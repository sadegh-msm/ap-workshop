/**
 * set player for game
 * 
 * @author Ali Rezaee
 * @since 2020.03.25
 * @version 13
 */
public class Vote {
	// person
	private person person;
	// date of voting
	private String date;

	/**
	 * Constructor for Vote
	 * 
	 * @param person who voted
	 */
	public Vote(person person) {
		JalaliCalendar jalaliCalendar = new JalaliCalendar();

		this.person = person;
		this.date = jalaliCalendar.getDayOfWeekDayMonthString();
	}

	/**
	 * get person
	 * 
	 * 
	 * @return person
	 */
	public person getPerson() {
		return person;
	}

	/**
	 * get Date
	 * 
	 * 
	 * @return Date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * hashcode for voting
	 * 
	 * 
	 * @return hashing for each object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	/**
	 * chek is equal or not
	 * 
	 * 
	 * @return if correct return true and not false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}

}
