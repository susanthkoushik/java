import java.util.HashMap;
public class Main{
    public static void main(String[]args){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i;
        int arr[] = {1,1,2,2,3};
        for(i=0;i<arr.length;i++){
            int n = arr[i];
            if(hm.containsKey(n)){
                int prev = hm.get(n);
                hm.put(n,prev+1);
            }
            else{
                hm.put(n,0);
            }
            
        }
        for(int key : hm.keySet()){
            System.out.println(key + " " + hm.get(key));
        }
        System.out.println("the repeating elemrnts are :");
        for(int key : hm.keySet()){
            if(hm.get(key)>0){
                System.out.println(key);
            }
        }
    }
}