import java.util.*;
public class RowColumnReverse{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[r-i-1][c-j-1]);
            }
            System.out.println();
        }
    }
}