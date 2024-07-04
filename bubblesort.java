import java.util.*;;
public class bubblesort {
    public static void bubblesort1(int arr[]) {
        for(int counter=0;counter<arr.length;counter++){
            for(int j=0;j<arr.length-1-counter;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }}
    public static void main(String[] args) {
        int arr[]={20,70,50,40,90};
        bubblesort1(arr);
        System.out.println(Arrays.toString(arr));   
    }
    }


