import java.util.*;
public class ColumnReverse{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int j=0;j<c;j++){
            int start=0;
            int end=r-1;
            while(start<end){
                int temp=arr[start][j];
                arr[start][j]=arr[end][j];
                arr[end][j]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}