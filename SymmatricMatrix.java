import java.util.*;
public class SymmatricMatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        boolean Symmatric=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] != arr[j][i]){
                    Symmatric=false;
                }
            }
        }
        if(Symmatric){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}