import java.util.*;
public class EOElement{
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
        System.out.print("Event Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] %2 == 0){
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println();
        System.out.print("Odd Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] %2 != 0){
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}