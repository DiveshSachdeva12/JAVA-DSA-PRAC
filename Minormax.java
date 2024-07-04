public class Minormax {
    public static void main(String[] args) {
        int arr[]={8,400,200,100,4,5,1,0};
        int min =arr[0];
       for(int i=0;i<arr.length;i++){
        if (arr[i]>min) {
            min =arr[i];
        }
        System.out.println(arr[i]);
       }
    }
    
}
