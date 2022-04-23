
/**
 * set player for game
 * 
 * @author Ali Rezaee
 * @since 2020.03.25
 * @version 13
 */
import java.util.*;

public class VotingSystem {
	// list of voting
	private ArrayList<Voting> votingList;

	/**
	 * Constructor for voting system
	 * 
	 */
	public VotingSystem() {
		votingList = new ArrayList<Voting>();
	}

	/**
	 * create voting
	 * 
	 * @param a  is question
	 * @param a2 type of voting
	 * @param a3 choises
	 */
	public void creatVoting(String a, int a2, ArrayList<String> a3) {
		Voting m = new Voting(a2, a);
		votingList.add(m);
		for (int i = 0; i < a3.size(); i++) {
			m.creatPoll(a3.get(i));
		}
	}

	/**
	 * print question
	 * 
	 */
	public void printVotingQustion() {
		for (int i = 0; i < votingList.size(); i++) {
			System.out.println(votingList.get(i).getQuestion());
		}
	}

	/**
	 * print voting
	 * 
	 * @param number of voting
	 */
	public void printVoting(int a) {
		System.out.println(votingList.get(a).getQuestion());

		for (int i = 0; i < votingList.get(a).getPolls().size(); i++) {
			System.out.println(votingList.get(a).getPolls().get(i));
		}
	}

	/**
	 * voting
	 * 
	 * @param a      is person
	 * @param number of voting
	 * @param a3     his choises
	 */
	public void vote(person a, int a2, ArrayList<String> a3) {
	
		votingList.get(a2).vote(a, a3);
	}

	/**
	 * create voting
	 * 
	 * @param a is number of voting
	 */
	public void getResult(int a) {
		votingList.get(a).printVotes();
	}
}
