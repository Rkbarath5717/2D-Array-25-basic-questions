import java.util.*;
public class ColumMaxSum {
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
        int MaxSum=0;
        int col=0;
        for(int j=0;j<c;j++){
            int sum=0;
            for(int i=0;i<r;i++){
                sum+=arr[i][j];
            }
            if(sum>MaxSum){
                MaxSum=sum;
                col=j;
            }
        }
        System.out.println(MaxSum);
        System.out.println(col);

    }
}