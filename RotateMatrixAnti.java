import java.util.*;
public class RotateMatrixAnti{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int k=scn.nextInt();
        k=k%4;
        System.out.println();
        for(int t=0;t<k;t++){
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            for(int j=0;j<n;j++){
                int start=0;
                int end=n-1;
                while(start<end){
                    int temp=arr[start][j];
                    arr[start][j]=arr[end][j];
                    arr[end][j]=temp;
                    start++;
                    end--;
                }
            }
        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}