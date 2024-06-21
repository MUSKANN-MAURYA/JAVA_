import java.util.*;

public class linearsearch {
   public static int findIndex(int[] arr,int target){
    int result=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return result;

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers u want in the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element : ");
        int target=sc.nextInt();
        
        //function calling
        int result=findIndex(arr,target);
        if(result==0){
            System.out.println("element not found in the array");
        }
        else{
            System.out.println("element is present in the array at location : "+result);
        }

    }
}