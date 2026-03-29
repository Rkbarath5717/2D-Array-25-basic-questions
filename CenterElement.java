import java.util.*;
public class CenterElement{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        if(n%2 != 0){
            System.out.print(arr[n/2][n/2]);
        }
        else{
            System.out.print("No center");
        }
    }
}