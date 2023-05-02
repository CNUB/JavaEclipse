package chap07;

public class PlusMinusTest1 {

	public static void main(String[] args) {
		PlusMinus pm = new PlusMinus();
		String sp, sm;
		sp = pm.plus(50, 30);
		sm = pm.minus(50, 30);
		System.out.println(sp);
		System.out.println(sm);
	}

}
