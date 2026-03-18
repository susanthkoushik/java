public class Main{
    public static void main(String[]args){
        int arr[]={2,80,3,46,52};
        int max=arr[0];
        int i;
        for(i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(max);
            }
        }
    }
}