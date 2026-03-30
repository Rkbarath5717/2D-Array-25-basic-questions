import java.util.*;
public class RowMaxSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int maxSum=0;
        int rowIndex=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            if(sum > maxSum){
                maxSum=sum;
                rowIndex=i;
            }
        }
        System.out.println(maxSum);
        System.out.println(rowIndex);
    }
}