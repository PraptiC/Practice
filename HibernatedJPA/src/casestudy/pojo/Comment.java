package casestudy.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comment{

	@Id
	private int commentId;
	
	@ManyToOne
	@JoinColumn(name="feedId")
	private int feedId;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private String userId;
	private String commentContent;
	private Date commentTimestamp;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getComment() {
		return commentContent;
	}
	public void setComment(String comment) {
		this.commentContent = comment;
	}
	public Date getCommentTimestamp() {
		return commentTimestamp;
	}
	public void setCommentTimestamp(Date commentTimestamp) {
		this.commentTimestamp = commentTimestamp;
	}
	
	
}
