package ex3;

public class ResourceProvider {
	public ResourceProvider() {
		System.out.println("provider Constructor");
	}
	
	private static ResourceProvider provider;
	private static ResourceProvider getProvider() {
		System.out.println("getProvider method call");
		if(provider==null)
			provider=new ResourceProvider();
		return provider;
	}
}
