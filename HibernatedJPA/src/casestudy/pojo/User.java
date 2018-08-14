package casestudy.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lti.pojo.one2many.Employee;

@Entity
@Table(name="users_forum")
public class User {

	@Id 
	//@Column(name="userid", length=30)
	private String userid;
	private String password;
	private String email;
	
	@OneToMany(mappedBy="userId",cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<Feed> feeds = new HashSet<Feed>();
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
