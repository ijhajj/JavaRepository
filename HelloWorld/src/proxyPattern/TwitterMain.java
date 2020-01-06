package proxyPattern;

public class TwitterMain {
	public static void main(String...args) {
		Twitter ipTwitter = new ProxyTweets("IPTwitter","1234");
		Twitter henryTwitter = new ProxyTweets("HenryTwitter","123");
		ipTwitter.DisplayTweets();
		henryTwitter.DisplayTweets();
		//System.out.println(ipTwitter);
		//System.out.println(henryTwitter);
	}
}
