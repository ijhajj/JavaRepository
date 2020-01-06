package builderPattern;

public class SimpleBuilder {
	public static void main(String[] args) {
		String hello = "hello";
		System.out.println("<p>"+ hello + "</p>");
		String[] words = {"Hello","World"};
		//StringBuilder is a built in Builder - providing an API to user to create strings more easily rather than using string concatenation
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>\n");
		
		for (String word:words) {
			sb.append(String.format(" <li>%s</li>\n",word));
		}
		sb.append("</ul");
		System.out.println(sb);
		
		//HTMLBuilder Class
		System.out.println("HTMLBuilder class");
		HTMLBuilder builder = new HTMLBuilder("ul");
		builder.addChild("li", "hello")
				.addChild("li", "world");
		System.out.println(builder);
		
		//PhoneBuilder
		Phone pro = new PhoneBuilder().os("Android").battery(1000).ram(576).processor("Intel2").getPhone();
		System.out.println(pro);
	}
}
