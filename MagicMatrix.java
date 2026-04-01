import java.util.*;
public class MagicMatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[0][j];
        }
        for(int i=1;i<n;i++){
            int rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=arr[i][j];
            }
            if(rowSum != sum){
                System.out.print("No magic");
                return;
            }
        }
        for(int j=0;j<n;j++){
            int colSum=0;
            for(int i=0;i<n;i++){
                colSum+=arr[i][j];
            }
            if(colSum != sum){
                System.out.print("No magic");
                return;
            }
        }
        int d1=0;
        for(int i=0;i<n;i++){
            d1+=arr[i][i];
        }
        int d2=0;
        for(int i=0;i<n;i++){
            d2+=arr[i][n-1-i];
        }
        if(d1 == sum && d2 == sum){
            System.out.println("Magic matrix");
        }
        else{
            System.out.println("No a matrix");
        }
    }
}