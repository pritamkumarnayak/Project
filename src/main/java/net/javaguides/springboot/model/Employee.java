package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Registration_Id")
	private String RegistrationId;
	
	@Column(name = "First_Name")
	private String FirstName;

	@Column(name = "Last_Name")
	private String LastName;
	
	@Column(name = "Gender")
	private String Gender;
	
	@Column(name = "Email_Id")
	private String EmailId;
	
	@Column(name = "Phone_Number")
	private String PhoneNumber;
	
	@Column(name = "Permanent_Address")
	private String PermanentAddress;
	
	@Column(name = "Present_Address")
	private String PresentAddress;
	
	@Column(name = "Age")
	private String Age;
	
	@Column(name = "Date_Of_Birth")
	private String DateOfBirth;
	
	@Column(name = "Martial_Status")
	private String MartialStatus;
	
	@Column(name = "Joined_Date")
	private String JoinedDate;
	
	@Column(name = "Assigned_Job_Role")
	private String AssignedJobRole;
	
	@Column(name = "Experienced_About_Vehicle")
	private String ExperiencedAboutVehicle;
	public Employee() {
		
	}
	
	public Employee(String RegistrationId, String FirstName, String LastName, String Gender, String EmailId, String PhoneNumber, String PermanentAddress, String PresentAddress, String Age, String DateOfBirth, String MartialStatus, String JoinedDate, String AssignedJobRole, String ExperiencedAboutVehicle) {
		super();
		this.RegistrationId = RegistrationId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Gender = Gender;
		this.EmailId = EmailId;
		this.PhoneNumber = PhoneNumber;
		this.PermanentAddress = PermanentAddress;
		this.PresentAddress = PresentAddress;
		this.Age = Age;
		this.DateOfBirth = DateOfBirth;
		this.MartialStatus = MartialStatus;
		this.JoinedDate = JoinedDate;
		this.AssignedJobRole = AssignedJobRole;
		this.ExperiencedAboutVehicle = ExperiencedAboutVehicle;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegistrationId() {
		return RegistrationId;
	}
	public void setRegistrationId(String RegistrationId) {
		this.RegistrationId = RegistrationId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String EmailId) {
		this.EmailId = EmailId;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getPermanentAddress() {
		return PermanentAddress;
	}
	public void setPermanentAddress(String PermanentAddress) {
		this.PermanentAddress = PermanentAddress;
	}
	public String getPresentAddress() {
		return PresentAddress;
	}
	public void setPresentAddress(String PresentAddress) {
		this.PresentAddress = PresentAddress;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String Age) {
		this.Age = Age;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
	public String getMartialStatus() {
		return MartialStatus;
	}
	public void setMartialStatus(String MartialStatus) {
		this.MartialStatus = MartialStatus;
	}
	public String getJoinedDate() {
		return JoinedDate;
	}
	public void setJoinedDate(String JoinedDate) {
		this.JoinedDate = JoinedDate;
	}
	public String getAssignedJobRole() {
		return AssignedJobRole;
	}
	public void setAssignedJobRole(String AssignedJobRole) {
		this.AssignedJobRole = AssignedJobRole;
	}
	public String getExperiencedAboutVehicle() {
		return ExperiencedAboutVehicle;
	}
	public void setExperiencedAboutVehicle(String ExperiencedAboutVehicle) {
		this.ExperiencedAboutVehicle = ExperiencedAboutVehicle;
	}
}
