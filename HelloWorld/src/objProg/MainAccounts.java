package objProg;
import dataStructures.Album;


public class MainAccounts {

	public static void main(String[] args) {
		Accounts IPAccount = new Accounts("IP");
		IPAccount.deposit(1000);
		IPAccount.deposit(1000);
		IPAccount.withdrawl(500);
		IPAccount.withdrawl(-200);
		//IPAccount.balance = 5000;
		System.out.println("Balance in IP's account : " + "" + IPAccount.getBalance());
		
		Album al = new Album("IP","IP");
		
		PrivateClass pr = new PrivateClass("IP",40);
		SubClass sb = new SubClass("IPS",43);
		
		

	}

}
