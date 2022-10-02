public class LargestNumbers {
    public static void main(String args[]){
        int arr[]=new int []{10,78,24};
        int max=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element of an array is "+max);
    }
}
