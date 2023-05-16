// Run Configuration -> Argument -> 10 \n 20
public class Sample2 {

	public static void main(String[] args) {
		System.out.println("sum : " + (args[0] + args[1]));
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("sum : " + (num1 + num2));
	}

}
