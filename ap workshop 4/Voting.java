
/**
 * set player for game
 * 
 * @author Ali Rezaee
 * @since 2020.03.25
 * @version 13
 */
import java.util.*;

public class Voting {
	// type og voting
	private int type;
	// question of question
	private String question;
	// voters who attend in voting
	private ArrayList<person> voters;
	// choise to person who voted this choise
	private HashMap<String, HashSet<Vote>> polls;

	/**
	 * Constructor for card
	 * 
	 * @param n for declare type of voting
	 * @param m question of voting
	 */
	public Voting(int n, String m) {
		type = n;
		question = m;
		voters = new ArrayList<person>();
		polls = new HashMap<String, HashSet<Vote>>();

	}

	/**
	 * give question
	 * 
	 * 
	 * @return question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * give choise & add to polls
	 * 
	 * 
	 * @param choise
	 */
	public void creatPoll(String a) {
		polls.put(a, new HashSet<Vote>());
	}

	/**
	 * give person & his choises & add to voting
	 * 
	 * 
	 * @param person a & his choises n
	 */
	public void vote(person a, ArrayList<String> n) {
	if(n.get(0)=="random") {
			Random r = new Random();
			int t=r.nextInt(getPolls().size());
			n.remove(0);
			n.add(getPolls().get(t));
			
		}
		voters.add(a);
		if (type == 1 && n.size() > 1) {
			System.out.println("you must choose one chise ");
		} else {
			System.out.println("vote submitted ");
			Vote v = new Vote(a);
			for (int i = 0; i < n.size(); i++) {
				for (String key : polls.keySet()) {
					if (n.get(i) == key) {
						polls.get(key).add(v);
					}
				}
			}
		}
	}

	/**
	 * give person who voted
	 */
	public void getVoters() {
		for (int i = 0; i < voters.size(); i++) {
			System.out.println(voters.get(i).toString());
		}
	}

	/**
	 * print result of voting
	 * 
	 */
	public void printVotes() {
		for (int i = 0; i < getPolls().size(); i++) {
			System.out.print(getPolls().get(i) + " = " + polls.get(getPolls().get(i)).size() + " ( ");
			for (Vote obj : polls.get(getPolls().get(i))) {
				System.out.print(obj.getPerson().toString() + " voted in " + obj.getDate() + ", ");
			}
			System.out.println(")");
		}
	}

	/**
	 * give choises
	 * 
	 * @return choises
	 */
	public ArrayList<String> getPolls() {
		ArrayList<String> a = new ArrayList<String>();
		for (String key : polls.keySet()) {
			a.add(key);
		}

		return a;
	}

}
