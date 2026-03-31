import java.util.*;
public class RowReverse {
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
            for(int i=0;i<r;i++){
                int start=0;
                int end=c-1;
                while(start<end){
                    int temp=arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;
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