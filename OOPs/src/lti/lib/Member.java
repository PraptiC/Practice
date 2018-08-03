package lti.lib;

public class Member implements BookMemberDetails{

	public String mName;
	public boolean hasIssued = false;
	@Override
	public String getBooks() {
		if(hasIssued == false)
		return null;
		else
			return 
	}

	@Override
	public void issueBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		
	}

}
