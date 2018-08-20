package ctrl;

import java.util.Map;

import javax.servlet.http.HttpSession;

//import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bean.CommentBean;
import entity.Comment;
import entity.Feed;
import entity.User;
import service.FeedService;

@Controller
public class FeedController {

	@Autowired
	private FeedService service;

	@RequestMapping(value = "query.do", method = { RequestMethod.POST }) // AskQuestion btn
	public String askQuestion(@RequestParam("query") String query, Map model, HttpSession session) {
		Feed feed = new Feed();
		feed.setQuery(query);

		User user = (User) session.getAttribute("User"); // get user from session
		feed.setUser(user);

		service.askQuestion(feed);
		model.put("Feeds", service.getMyFeeds(user.getUserId())); // returns all qs by user
		return "feeds"; // go to feeds.jsp

	}

	@RequestMapping("feeds.do")
	public String showFeeds(Map model, HttpSession session) {
		User user = (User) session.getAttribute("User");
		model.put("Feeds", service.getMyFeeds(user.getUserId()));
		return "feeds";
	}

	@RequestMapping("question.do") // clicking on any question
	public String showQuestion(@RequestParam("id") int fid, HttpSession session) {
		Feed feed = service.getQuestion(fid);
		session.setAttribute("Question", feed);
		return "response"; // response.jsp
	}

	//@RequestMapping(value ="comment.do", method = RequestMethod.POST) // submit comment
	@RequestMapping(value ="comment.do") // submit comment
	public String submitComment(@RequestParam("response") String response, HttpSession session) {
		Comment comment = new Comment();
		comment.setResponse(response);
		comment.setFeed((Feed) session.getAttribute("Question"));
		comment.setUser((User) session.getAttribute("User"));

		Feed feed = service.submitComment(comment);
		session.setAttribute("Question", feed);
		return "response";
	}
	
	@RequestMapping("search.do") // search feeds
	public String searchFeed(@RequestParam("keyword")String keyword, Map model) {
		model.put("Feeds",service.searchFeeds(keyword));
		return "feeds";
	}
	
}
