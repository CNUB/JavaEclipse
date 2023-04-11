package chap6;

import java.util.Random;

public class NultiArrayTest {

	public static void main(String[] args) {
		Random rand = new Random(); 
		int[][] score = new int[4][4];
	
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				score[i][j] = rand.nextInt(10);
			}
		}
		
		for (int k = 0; k < 4; k++) {
			int sum = 0;
			//for(int l = 0; l < 4; l++) {
			for(int value : score[k]) sum += value;
			System.out.println(sum);
		}
		
	}

}
