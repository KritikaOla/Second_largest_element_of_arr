import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter length of arr= ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter elements of arr= ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);        //here i've sorted the array 
        System.out.print("secon largest element is= " + arr[n -2]);
    }
}
