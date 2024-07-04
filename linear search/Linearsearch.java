import java.util.*;;

public class Linearsearch {
    public static void main(String[] args) {
        int arr[] = { 10, 15, 8, 9, 100, 43, 56 };
        System.err.println("enter the element you want to search : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean found=false;
        for (int i=0;i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("element is found at index :" + i);
                found=true;
                break;
            } 
        }
        if (!found) {
            System.out.println("element is not found");
        }
    }
}