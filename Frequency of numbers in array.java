import java.util.HashMap;
public class Main{
    public static void main(String[]args){
        HashMap<Integer,Integer> frequency =new HashMap<>();
        int i;
        int arr[] = {2,2,2,3,3,3};
        for(i=0;i<arr.length;i++){
            int n=arr[i];
            if(frequency.containsKey(n)){
                int prev = frequency.get(n);
                frequency.put(n,prev+1);
            }
            else{
                frequency.put(n,1);
            }
        }
        for(int key:frequency.keySet()){
                System.out.println(key +" "+ frequency.get(key));
            }
    }
}