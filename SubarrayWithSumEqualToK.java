
import java.util.*;
class SubarrayWithSumEqualToK {
    public static void main(String[] args) {
        int arr[]={1,1,1};
        
        int k=2;
        HashMap<Integer,Integer>map= new HashMap<>();
        int sum=0;
        map.put(0,1);
        int count=0;
        for(int n:arr){
            sum+= n;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        
        }
        System.out.println("Try programiz.pro"+count);
    }
}
