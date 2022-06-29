 // To Print the reverse of an array 
import java.util.Scanner;
class Main{
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array  ");
        int len = sc.nextInt();
        int [] arr = new int[len];
        System.out.println("Enter the elements of array ");
        for(int i = 0 ; i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your output ");
        for(int i = len-1 ; i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

		


