package builderPattern;

public class PersonFMain {

	public static void main(String[] args) {
		PersonFBuilder pb =  new PersonFBuilder();
		PersonF person = pb.lives()
								.at("123 Street")
								.in("London")
								.postCode("123456")
							.works()
								.at("Infy")
								.asA("Developer")
								.earning(10000)
							.build();
		System.out.println(person);

	}

}
