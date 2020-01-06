package facadePattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsuranceMain {

	public static void main(String[] args) throws ParseException{
		InsuranceFacade if1 = new InsuranceFacade("1254351",new SimpleDateFormat("dd/mm/yyyy").parse("01/01/1980"),"Colorado");
		if1.getQuote();

	}

}
