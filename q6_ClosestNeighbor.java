//student_6804062612021
package homework4;

import java.util.Scanner;

public class q6_ClosestNeighbor {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[][] A = inputArr(n);
        System.out.printf("%.2f\n",leastDistance(A,n));
    }
    
    public static double[][] inputArr(int n){
        Scanner input = new Scanner(System.in);
        double[][] A = new double[n][2];
        for (int i = 0; i<n; i++) {
            A[i][0] = input.nextDouble();
            A[i][1] = input.nextDouble();
        }
        
        return A;
    }
    
    public static double leastDistance (double[][] A, int n) {
        double minDistance = Math.sqrt(Math.pow(A[0][0]-A[1][0],2)+Math.pow(A[0][1]-A[1][1],2));
        double temp;
        
        for (int i = 0; i<n; i++) {
            for (int j = i+1; j<n; j++) {
                temp = Math.sqrt(Math.pow(A[i][0]-A[j][0],2)+Math.pow(A[i][1]-A[j][1],2));
                //System.out.println("\n"+temp);
                if (temp < minDistance) {
                    minDistance = temp;
                }
            }
        }
        
        return minDistance;
    }
}


//8
/*
3 3 
-1 3 
1 1 
4 2 
2 0.5 
-1 -1 
4 -0.5 
2 -1
*/
