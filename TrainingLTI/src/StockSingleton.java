
public final class StockSingleton {
	private static Stock lti=null;
	private StockSingleton() {
		
	}
	public static Stock getStock() {
		if(lti==null)
			lti=new Stock();
		return lti;
		
	}
	

}
