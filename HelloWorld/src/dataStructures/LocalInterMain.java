package dataStructures;

import java.util.Scanner;

public class LocalInterMain {
	private static Scanner scanner = new Scanner(System.in);
	private static Button printButton = new Button("print");
	private static Button delButton = new Button("Delete");
	public static void main(String[] args) {
		//Local class - visible only within this block
		class ClickListener implements Button.OnClickListener{
			public ClickListener() {
				System.out.println("ClickListener constructor");
			}
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		}
		printButton.setOnClickListener(new ClickListener());
		listen();
		//scanner.close();
		
		//Anonymous class
		delButton.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked from inside an anonymous class implementation");
				
			}
		});
			
		
	}	
	
	

	private static void listen() {
		boolean quit = false;
		while(!quit) {
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 0:
				quit = true;
				System.out.println("Quitting the menu.. bye bye!");
				break;
			case 1:
				printButton.OnClick();
				break;
			case 2:
				delButton.OnClick();
				break;
			default:
				break;
			}
		}
	}

}


