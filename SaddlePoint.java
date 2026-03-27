import java.util.*;
public class SaddlePoint {
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
            int min=arr[i][0];
            int col=0;
            for(int j=1;j<c;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    col=j;
                }
            }
            boolean saddle=true;
            for(int k=0;k<r;k++){
                if(arr[k][col] > min){
                    saddle=false;
                }
            }
            if(saddle){
                System.out.print(min);
            }
        }
    }
}