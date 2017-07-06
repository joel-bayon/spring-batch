package flat.file;

import java.util.Date;

public class Contact {
private Long id = 0L;
private String firstname,lastname;
private Date birth;

public Contact(String firstname, String lastname, Date birth) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.birth = birth;
}

public Contact() {}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}

@Override
public String toString() {
	return "Contact [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", birth=" + birth + "]";
}

}
