package information;

public class Human {
	protected String name;
	protected int age;
	protected String gender;
	protected String department;
	protected Boolean isLeader;
	protected String jobTitle;
	
	public Human(String name, int age, String gender, String department, Boolean isLeader,
			String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.isLeader = isLeader;
		this.jobTitle = jobTitle;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Boolean getIsLeader() {
		return isLeader;
	}
	
	public void setIsLeader(Boolean isLeader) {
		this.isLeader = isLeader;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
