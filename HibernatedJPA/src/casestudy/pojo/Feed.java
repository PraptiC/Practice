package casestudy.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lti.pojo.one2many.Employee;

@Entity
@Table
public class Feed {

	@Id
	private int feedId;
	private String question;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private String userId;
	private Date feedTimestamp;
	
	@OneToMany(mappedBy="feedId",cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<Comment> comments = new HashSet<Comment>();
	
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getFeedTimestamp() {
		return feedTimestamp;
	}
	public void setFeedTimestamp(Date feedTimestamp) {
		this.feedTimestamp = feedTimestamp;
	}
	
	
}
