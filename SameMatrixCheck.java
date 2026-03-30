import java.util.*;
public class SameMatrixCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int [r][c];
        int brr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[i][j]=scn.nextInt();
            }
        }
        boolean same=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==brr[i][j]){
                    same=true;
                }
            }
        }
        if(same){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}