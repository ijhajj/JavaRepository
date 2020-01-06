package objProg;

public class Password {
	private static final int key = 45362562;
	private final int encryptedPwd;
	
	public Password(int password) {
		this.encryptedPwd = encryptMethod(password);
	}
	private int encryptMethod(int password) {
		return password ^ key;
	}
	public final void storePassword() {
		System.out.println("Saving password as " + this.encryptedPwd);
	}
	public boolean letMeIn(int password) {
		if(this.encryptedPwd == encryptMethod(password)) {
			System.out.println("Welcome, you can access the system!");
			return true;
		}else {
			System.out.println("Sorry, wrond password!");
			return false;
		}
	}
}
