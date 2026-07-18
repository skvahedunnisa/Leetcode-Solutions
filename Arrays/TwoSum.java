import java.util.HashMap;
import java.util.HashSet;
public class TwoSum {
  public static boolean bruteForce(int[] arr, int target) {
    //Time Complexity : O(n^2) Space Complexity: O(1)
    for(int i=0;i<arr.length;i++) {
      for(int j=i+1;j<arr.length;j++) {
        if(arr[i] + arr[j] == target) {
          return true;
        }
      }
    }
    return false;
  }
  //Using HashSet Time:O(n) Space:O(n) 
  public static boolean hashSet(int[] arr,int target) {
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr.length;i++) {
      int need = target - arr[i];
      if(set.contains(need)) {
        return true;
      }
      set.add(arr[i]);
    }
    return false;
  }
//Using HashMap when asked to return indices Time:O(n) Space: O(n)
public static int[] hashMap(int[] arr, int target) {
  HashMap<Integer,Integer> map = new HashMap<>();
  for(int i=0;i<arr.length;i++) {
    int need = target - arr[i];
    if(map.containsKey(need)) {
      return new int[]{map.get(need),i};
    }
    map.put(arr[i],i);
  }
  return new int[]{};
}}
