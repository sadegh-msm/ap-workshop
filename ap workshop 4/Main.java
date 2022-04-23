
/**
 * set player for game
 * 
 * @author Ali Rezaee
 * @since 2020.03.25
 * @version 13
 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		VotingSystem votingSystem = new VotingSystem();
		person voter = new person("Ali", "ahmady");
		person voter1 = new person("reza", "mortazavi");
		ArrayList<String> option = new ArrayList<String>();
		ArrayList<String> days = new ArrayList<String>();
		option.add("yes");
		option.add("no");
		days.add("Sunday");
		days.add("Monday");
		days.add("Thursday");
		votingSystem.creatVoting("Do you come ?", 1, option);
		votingSystem.creatVoting("Wich day?", 0, days);
		System.out.println("print voting question");
		votingSystem.printVotingQustion();
		System.out.println("print first voting ");
		votingSystem.printVoting(0);
		ArrayList<String> option1 = new ArrayList<String>();
		ArrayList<String> option2 = new ArrayList<String>();
		ArrayList<String> days1 = new ArrayList<String>();
		option1.add("yes");
		option2.add("random");
		days1.add("Sunday");
		days1.add("Monday");
		votingSystem.vote(voter, 0, option1);
		votingSystem.vote(voter1, 0, option2);
		votingSystem.printVoting(1);
		votingSystem.vote(voter, 1, days1);
		votingSystem.vote(voter1, 1, days1);
		System.out.println("Result 1 :");
		votingSystem.getResult(0);
		System.out.println("Result 2 :");
		votingSystem.getResult(1);

	}
}
