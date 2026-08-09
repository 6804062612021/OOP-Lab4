package homework4;

import java.util.Scanner;

class FindPokemon {
    int r, c;
    int maxR, maxC;
    int[][] arr;
    
    FindPokemon(int r, int c) {
        this.r = r;
        this.c = c;
        this.arr = new int[r][c];
    }
    
    public void inputArr(Scanner input) {
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                arr[i][j]=input.nextInt();
            }
        }
    }
    
    boolean less10(int x, int y) {
        return Math.abs(x-y)<=10;
    }
    
    public void findMaxSum() {
        int maxSum = -1, x, y;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                x = arr[i][j];
                if (j+1<c) {
                    y = arr[i][j+1];
                    if (less10(x,y)) {
                        if (x+y > maxSum) {
                            maxSum = x+y;
                            maxR = i;
                            maxC = j;
                        }
                    }
                }
                
                if (i+1<r) {
                    y = arr[i+1][j];
                    if (less10(x,y)) {
                        if (x+y > maxSum) {
                            maxSum = x+y;
                            maxR = i;
                            maxC = j;
                        }
                    }
                }
            }
        }
        
        printMaxIndex();
    }
    
    void printMaxIndex() {
        System.out.println((maxR+1)+" "+(maxC+1));
    }
}

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        FindPokemon pikachu = new FindPokemon(r,c);
        pikachu.inputArr(input);
        pikachu.findMaxSum();
    }
}

/*
4 5 
5 1 2 10 4 
4 30 3 0 100 
3 25 10 4 10 
3 20 4 8 5

4 4 
0 0 0 0 
0 0 0 0 
0 1 1 1 
1 1 0 0
*/