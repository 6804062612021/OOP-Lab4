//student_6804062612021
package homework4;

import java.util.Scanner;

class Matrix {
    public int r;
    public int c;
    public int[][] M;
    
    public Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        this.M = new int[r][c];
    };
    public void inputMatrix(Scanner input) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                this.M[i][j]=input.nextInt();
            }
        }
    }
    public void printMatrix() {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class MatrixMultiplication {
    public static Matrix multiply(Matrix A, Matrix B) {
        if (A.c!=B.r) {
            return null;
        }
        
        Matrix C = new Matrix(A.r,B.c);
        
        for(int i=0; i<A.r; i++) {
            for(int j=0; j<B.c; j++) {
                C.M[i][j] = 0;
                for(int k=0; k<A.c; k++) {
                    C.M[i][j] += A.M[i][k]*B.M[k][j];
                }
            }
        }
        
        return C;
    }
}

public class q5_MatrixMultiplication {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r = input.nextInt();
        int c = input.nextInt();
        Matrix A = new Matrix(r,c);
        A.inputMatrix(input);
        
        r = input.nextInt();
        c = input.nextInt();
        Matrix B = new Matrix(r,c);
        B.inputMatrix(input);
        
        Matrix C;
        C = MatrixMultiplication.multiply(A, B);
        C.printMatrix();
    }
}


/*
3 2 
1 2 
-1 0 
3 2 
2 3 
1 5 2 
-2 0 1

*/