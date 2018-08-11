package casestudy.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feed {

	@Id
	private int feedId;
	private String question;
	private String userId;
	private Date feedTimestamp;
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
