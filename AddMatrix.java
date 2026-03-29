import java.util.*;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int arr[][]=new int [n][m];
        int brr[][]=new int[n][m];
        int sum[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                brr[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}