package com.dts.es.dto;
import java.sql.*;

public class StaffDTO {
	
private int sid; 	
private int docid;          // added
private String firstname;
private String lastname;
private String address;
private String city;        // added
private String state;       // added
private String specialization; // added
private String phone;
private String jdate;
private String email;
private String staffRole;
private String workinghours;
private String location;
private Date jdate1;


/* ----------- existing methods ----------- */

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public String getWorkinghours() {
	return workinghours;
}
public void setWorkinghours(String workinghours) {
	this.workinghours = workinghours;
}

public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public String getJdate() {
	return jdate;
}
public void setJdate(String jdate) {
	this.jdate = jdate;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getStaffRole() {
	return staffRole;
}
public void setStaffRole(String staffRole) {
	this.staffRole = staffRole;
}

public Date getJdate1() {
	return jdate1;
}
public void setJdate1(Date jdate1) {
	this.jdate1 = jdate1;
}


/* ----------- added methods ----------- */

public int getDocid() {
	return docid;
}
public void setDocid(int docid) {
	this.docid = docid;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

}