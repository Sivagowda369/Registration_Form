package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Dtls")
public class User_Dtls 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int username;
	@Column(name="Name")
	private String fullname ;
	
	
	@Column
    private String email;
	@Column
    private String phoneNo;
	@Column
    private String password;
	
	@Column
    private String confirm_Password;
	@Column
    private String gender;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_Password() {
		return confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User_Dtls [username=" + username + ", fullname=" + fullname + ", email=" + email + ", phoneNo="
				+ phoneNo + ", password=" + password + ", confirm_Password=" + confirm_Password + ", gender=" + gender
				+ "]";
	}

	
	
	

}
