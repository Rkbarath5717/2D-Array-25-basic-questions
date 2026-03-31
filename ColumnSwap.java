import java.util.*;
public class ColumnSwap {
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
        int c1=scn.nextInt();
        int c2=scn.nextInt();
        for(int i=0;i<r;i++){
            int temp=arr[c1][i];
            arr[c1][i]=arr[c2][i];
            arr[c2][i]=temp;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}