package Online.Shopping.Management.System.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "users")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class user {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private String password;
private long phone;
public user(String name, String email, String password, long phone) {
	super();
	this.name = name;
	this.email = email;
	this.password = password;
	this.phone = phone;
}
public user() {
	super();
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}

}
