package chap07;


class MultiDiv extends PlusMinus{
	int mul;
	double div;
	// private double div;
	public String multi(int x, int y) {
		mul = x * y;
		return "두 수의 곱은 : " + mul;
	}
	public String div(int x, int y) {
		div = x * y;
		return "두 수를 나눈 값은 : " + div;
	}
}

public class FourRulesTest1 {
	public static void main(String[] args) {
		String splus, sminus, smul, sdiv;
		MultiDiv md = new MultiDiv();
		// md.div = 3;
		splus = md.plus(50, 30);
		sminus = md.minus(50, 30);
		smul = md.multi(50, 30);
		sdiv = md.div(50, 30);
		
		System.out.println(splus);
		System.out.println(sminus);
		System.out.println(smul);
		System.out.println(sdiv);
	}

}
