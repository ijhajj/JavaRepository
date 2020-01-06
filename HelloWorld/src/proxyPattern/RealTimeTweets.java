package proxyPattern;

public class RealTimeTweets implements Twitter{
	private String twitterHandle;
	
	public RealTimeTweets(String twitterHandle) {
		this.twitterHandle =  twitterHandle;
	}
	@Override
	public void DisplayTweets() {
		System.out.println("Displaying tweets for " +  twitterHandle);
		
	}

}
