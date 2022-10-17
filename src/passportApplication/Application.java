package passportApplication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Application {

	Log log = LogFactory.getLog(Application.class);
	private String name;
	private int age;
	private String nationality;
	private String criminalRecord;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCriminalRecord() {
		return criminalRecord;
	}

	public void setCriminalRecord(String criminalRecord) {
		this.criminalRecord = criminalRecord;
	}

	public Application(String name, int age, String nationality, String criminalRecord) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.criminalRecord = criminalRecord;
	}

	@Override
	public String toString() {
		return "Application [age=" + age + ", nationality=" + nationality + ", criminalRecord=" + criminalRecord + "]";
	}

	public void checkcredentials() {
		if (this.name.equals("Bob") || this.name.equals("Jack"))
		{
			log.error("You have a criminal record. Application not approved.");
		}
		if (this.age >= 18 && this.nationality.equals("Indian") && this.criminalRecord.equals("No")) {
			log.info("Application approved");
		} else {
			checkErrors();
		}
	}

	private void checkErrors() {
		
		try{if (this.age<18) {
			log.error("Age is less than 18");
		}}catch(Exception e){
			throw new RuntimeException("Age is less than 18");
		}
		try{if (!this.nationality.equals("Indian")) {
			log.error("Nationality is not Indian");
		}}catch(Exception e) {
			throw new RuntimeException("Nationality is not Indian");
		}
		try{if (this.criminalRecord.equals("Yes")) {
			log.error("Criminal record found");
		}}catch(Exception e) {
			throw new RuntimeException("Criminal record found");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
