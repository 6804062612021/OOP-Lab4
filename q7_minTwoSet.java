package homework4;

import java.util.Scanner;

class TwoSet {
	int[] num;
	int totalSum;
	int targetSum;
	
    TwoSet(int[] num) {
		this.num = num;
		totalSum = sum(num);
		targetSum = totalSum/2;
	}

	static int sum(int[] num) {
		int s = 0;
		for (int i=0; i<num.length; i++) {
			s += num[i];
		}
		return s;
	}
	
	int minDiff() {
		boolean[] possibleSum = new boolean[targetSum + 1];
		possibleSum[0] = true;
		for (int i = 0; i < num.length; i++) {
			int curr = num[i];
			
			for (int j = targetSum; j >= curr; j--) {
				if (possibleSum[j - curr]) {
					possibleSum[j] = true;
				}
			}
		}
		
		int bestSumA = 0;
		for (int j = targetSum; j >= 0; j--) {
			if (possibleSum[j]) {
				bestSumA = j;
				break;
			}
		}
		int sumB = totalSum - bestSumA;
        return Math.abs(sumB - bestSumA);
	}
}

public class q7_minTwoSet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int[] num = new int[n];
		
		for (int i=0; i<n; i++) {
			num[i] = input.nextInt();
		}
		
		TwoSet set = new TwoSet(num);
		System.out.println(set.minDiff());
    }
}
