package information;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		final String[] DEPARTMENTS = { "Board", "Human Resource", "Information Technology" };
		final String[] TITLES_OF_BOARD = {"Director", "Manager"};
		final String[] TITLES_OF_HR = {"HR Mananger", "Agent"};
		final String[] TITLES_OF_IT = {"Tech Lead", "Developer"};
		
		boolean isLeader;
		String jobTitle;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Enter your gender: ");
		String gender = sc.nextLine();
		System.out.println("Enter number to choose your department: ");
		for (int i = 0; i < DEPARTMENTS.length; i++) {
			System.out.println(i+1 + ":" + DEPARTMENTS[i]);
		}
		int keyOfDepartment = Integer.parseInt(sc.nextLine());
		System.out.println("Enter number to choose your position: ");
		switch (keyOfDepartment) {
		case 1: {
			for (int i = 0; i < TITLES_OF_BOARD.length; i++) {
				System.out.println(i+1 + ":" + TITLES_OF_BOARD[i]);
			}
			int keyOfTitles = Integer.parseInt(sc.nextLine());
			isLeader = (keyOfTitles == 1) ? true : false;
			jobTitle = TITLES_OF_BOARD[keyOfTitles-1];
			break;
		}
		case 2: {
			for (int i = 0; i < TITLES_OF_HR.length; i++) {
				System.out.println(i+1 + ":" + TITLES_OF_HR[i]);
			}
			int keyOfTitles = Integer.parseInt(sc.nextLine());
			isLeader = (keyOfTitles == 1) ? true : false;
			jobTitle = TITLES_OF_HR[keyOfTitles-1];
			break;
		}
		case 3: {
			for (int i = 0; i < TITLES_OF_IT.length; i++) {
				System.out.println(i+1 + ":" + TITLES_OF_IT[i]);
			}
			int keyOfTitles = Integer.parseInt(sc.nextLine());
			isLeader = (keyOfTitles == 1) ? true : false;
			jobTitle = TITLES_OF_IT[keyOfTitles-1];
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + keyOfDepartment);
		}
		switch (keyOfDepartment) {
		case 1: {
			HumanOfBoard humanOfBoard = new HumanOfBoard(name, age, gender, DEPARTMENTS[keyOfDepartment-1], isLeader, jobTitle);
			humanOfBoard.showInfo();
			break;
		}
		case 2: {
			HumanOfHR humanOfHR = new HumanOfHR(name, age, gender, DEPARTMENTS[keyOfDepartment-1], isLeader, jobTitle);
			humanOfHR.showInfo();
			break;
		}
		case 3: {
			HumanOfIT humanOfIT = new HumanOfIT(name, age, gender, DEPARTMENTS[keyOfDepartment-1], isLeader, jobTitle);
			humanOfIT.showInfo();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + keyOfDepartment);
		}
	}

}
