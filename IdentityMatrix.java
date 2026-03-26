import java.util.*;
public class IdentityMatrix{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();   //Enter a single number 
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        boolean isIdentity = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j && arr[i][j] !=1){
                    isIdentity=false;
                }
                if(i !=j && arr[i][j] !=0){
                    isIdentity=false;
                }
            }
        }
        if(isIdentity){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}