package singletonPattern;

public class MultitonSingleton {
	public static void main(String args[]) {
	Printer mainPrinter = Printer.getInstance(Subsystem.PRIMARY);
	Printer auxPrinter1 = Printer.getInstance(Subsystem.AUXILIARY);
	Printer auxPrinter2 = Printer.getInstance(Subsystem.AUXILIARY);
	}
	
}
