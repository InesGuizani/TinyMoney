package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class User {
	
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long idUser;
	private String FirstName;
	private String LastName;
	private String Password;
	private String Address;
	
	@Enumerated(EnumType.STRING)
	private UserRole UserRole;
	
	private String Email;
	private String Job;
	private String Picture;
	private long Numtel;
	
	@ManyToMany
	private Set<Account>account;
	
	@ManyToMany
	private Set<Complaint>complaint;
	
	@ManyToMany
	private Set<Agency>agency;
	
	public User(String firstName,String lastName, String password, String address, tn.esprit.spring.entities.UserRole userRole,
			String email, String job, String picture, long numtel) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		Address = address;
		UserRole = userRole;
		Email = email;
		Job = job;
		Picture = picture;
		Numtel = numtel;
	}
	public User() {
		
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public UserRole getUserRole() {
		return UserRole;
	}
	public void setUserRole(UserRole userRole) {
		UserRole = userRole;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public long getNumtel() {
		return Numtel;
	}
	public void setNumtel(long numtel) {
		Numtel = numtel;
	}
	
	

}
