import java.util.*;
public class RowSwap {
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
        int r1=scn.nextInt();
        int r2=scn.nextInt();
        for(int j=0;j<c;j++){
            int temp=arr[r1][j];
            arr[r1][j]=arr[r2][j];
            arr[r2][j]=temp;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}