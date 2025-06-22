package Module_1;

import java.util.Scanner;

class SUM{
    public void Sum(int [][]arr ,int n,int m,int x){
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(x==0)
                sum+=arr[i][j];
                else
                    sum+=arr[j][i];
            }
            if(x==1)
            System.out.print(sum + " ");
            else
            System.out.println(sum);
        }
    }
}

public class Q4 {
    public static void ARRAY2D() {
        int n,m ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        n=input.nextInt();
        System.out.print("Enter number of columns : ");
        m=input.nextInt();
        int [][] arr = new int[n][m];

        System.out.print("Enter elements : \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=input.nextInt();
            }
        }
        SUM S = new SUM();
        System.out.print("Sum of all elements of each row : \n");
        S.Sum(arr,n,m,0);
        System.out.print("\nSum of all elements of each column : \n");
        S.Sum(arr,m,n,1);
    }
}