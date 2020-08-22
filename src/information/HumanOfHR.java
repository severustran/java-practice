package information;

public class HumanOfHR extends Human implements HumanServices {
	
	private String[] jobDesc = {"HR planning", "Recruiment"};
	private float rangeSalary = 1.2F;

	public HumanOfHR(String name, int age, String gender, String department, Boolean isLeader, String jobTitle) {
		super(name, age, gender, department, isLeader, jobTitle);
	}
	
	public String showJobDesc() {
		if (isLeader) {
			return jobDesc[0];
		} else {
			return jobDesc[1];
		}
	}
	
	@Override
	public long calcSalary() {
		if (isLeader)
			return (long)((4500000*rangeSalary)+(4500000*rangeSalary*20/100));
		else
			return (long)(4500000*rangeSalary);
	}

	@Override
	public void showInfo() {
		System.out.println("Welcome " + name);
		System.out.println("Your department is: " + department);
		System.out.println("Your position is: " + jobTitle);
		System.out.println("Your work is: " + showJobDesc());
		System.out.println("Your base salary is: " + calcSalary());
	}
}
