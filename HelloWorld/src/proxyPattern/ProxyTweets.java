package proxyPattern;

public class ProxyTweets implements Twitter{
	private static RealTimeTweets tweets;
	private String twitterHandle;
	private String password;
	
	public ProxyTweets(String twitterHandle,String password) {
		this.twitterHandle = twitterHandle;
		this.password = password;
	}
	@Override
	public void DisplayTweets() {
		if(password.equals("1234")) {
			//System.out.println(tweets);
			if (tweets==null) {
				tweets = new RealTimeTweets(twitterHandle);
			}
			tweets.DisplayTweets();
		}
		
	}

}
