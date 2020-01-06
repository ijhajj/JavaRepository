
public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		int myFirstNumber = 5;
		int mySecondNumber = 12;
		int myThirdNumber = 6;
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		String str = "7" + (5 + 10);
		System.out.println(str);
		int m = 50;
		int n = ++m;//m=n=51
		int o = m--;//o=51,m=50
		int p = --o + m--;//50 +
		System.out.println(p);
		int k = 4;
		boolean flag = k++ == 5;
		System.out.println(flag);
		byte b = 1;
		byte e = 0;
		e += b;
		
		String s = "a";//String pool
		String[] sa = {"a",s,s.substring(0,1),new String("a"),""+'a'};
		for (int i=0;i<sa.length;i++) {
			System.out.println(i);
			System.out.println(s==sa[i]);//1st is in string pool = true, second is immutable = true, new obj - false, am not sure why true
			System.out.println(s.contentEquals(sa[i]));//checks the content - will always return true
		}
		int i = 1;
		i = i++;
		System.out.println(i);
		
		
	}
}
