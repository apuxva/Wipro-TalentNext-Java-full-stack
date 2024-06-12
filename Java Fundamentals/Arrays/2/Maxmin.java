//Write a program to initialize an integer array and find the maximum and minimum value of the array.
public class Maxmin {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,9};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The min value in the arr:" + min);
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The max value in the arr:" + max);
    }
}
