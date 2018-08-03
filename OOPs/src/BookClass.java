
public class BookClass {

	static int books = 1;
	static String bookName = "Alchemist";

	static void issuedBook(MemberClass m) {
		books = books - 1;
		if(books==0)
			System.out.println(m.Member);
		else
			System.out.println("Books not issued.");
		//System.out.println(books);
	}

	static void returnBook() {
		books = books + 1;
		System.out.println("Available: "+books);
	}

}
