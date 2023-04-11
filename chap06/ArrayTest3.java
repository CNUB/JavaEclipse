package chap6;



public class ArrayTest3 {

	public static void main(String[] args) {
		
		int score[] = {88, 97, 45, 67, 45, 99};
		int max = score[0];
		for(int i : score) {
			if (max <= i) max = i;
		}
		System.out.print("가장 높은 값 : " + max);
	}

}
