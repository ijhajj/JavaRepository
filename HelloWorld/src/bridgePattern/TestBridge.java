package bridgePattern;

public class TestBridge {
	public static void main(String args[]) {
		Department dep1 = new Sales(new FullTime());//creating a fulltime employee for Sales Dept
		dep1.assignEmployee();
		Department dep2 = new IT(new PartTime());
		dep2.assignEmployee();
	}
}
