import java.util.*;
public class BelowAboveDiagonal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.print("Above Diagonal: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j < n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Below Diagonal: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j > n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}