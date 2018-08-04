
public class demoE implements SExchange {

	public static void main(String[] args) {

		AccHolder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b =StockSingleton.getStock();
		b.getQuote();
		
		System.out.println(h==b);
		
		Stock s1 = StockSingleton.getStock();

		System.out.println(h);
		System.out.println(s1);
		//s1.viewQuote();

	}

	@Override
	public void getQuote() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewQuote() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setQuote() {
		// TODO Auto-generated method stub

	}

}
