public class Main{
    public static void main(String[]args){
        int arr[]={1,35,66,87,4,99};
        int i;
        int max=arr[0];
        int min=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max number in the array" + " "+ max);
        for(i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min number in the array" + " " + min);
    }
}