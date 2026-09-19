//student_6804062612021
package homework4;

import java.util.Arrays;

class AscendSortFreq {
	double[] A;
	
	AscendSortFreq(double[] A) {
		this.A = A;
	}
	
	double[] AscendSort() {
		if (A.length == 0) return new double[0];
		
		double[] sorted = A.clone();
		Arrays.sort(sorted);
		
		int uniqueCount = 1;
		for (int i = 1; i < sorted.length; i++) {
			if (Double.compare(sorted[i], sorted[i - 1]) != 0) {
				uniqueCount++;
			}
		}
		
		double[] B = new double[uniqueCount];
		B[0] = sorted[0];
		int index = 1;
		for (int i = 1; i < sorted.length; i++) {
			if (Double.compare(sorted[i], sorted[i - 1]) != 0) {
				B[index++] = sorted[i];
			}
		}
		return B;
	}
	
	int[] SortCommuFreq(double[] B) {
		int[] C = new int[B.length];
		
		for (int i = 0; i < B.length; i++) {
			double curr = B[i];
			for (int j = 0; j < A.length; j++) {
				if (A[j] == curr)
					C[i]++;
			}
		}
		
		return C;
	}
}

public class q4_ArraySortFreq {
	public static void main(String[] args) {
		double[] A = {9,5,9,5,8,9,9,8,9,8};
	AscendSortFreq aSort = new AscendSortFreq(A);
	double[] B = aSort.AscendSort();
	int[] C = aSort.SortCommuFreq(B);
	
	System.out.println("A = " + Arrays.toString(A));
	System.out.println("B = " + Arrays.toString(B));
	System.out.println("C = " + Arrays.toString(C));
	}
}
