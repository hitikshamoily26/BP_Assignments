import java.util.*;
import java.util.List;

 public class Permutations {
 public static void main(String[] args) throws Exception {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the array size: ");
     int size = s.nextInt();
    int[] nums1 = new int[size];
    for(int i=0;i <nums1.length;i++){
        System.out.println("Enter the element");
        nums1[i]=s.nextInt();
        
    }
    
	System.out.println("\nOriginal array: "+Arrays.toString(nums1));
    List<List<Integer>> result1 = new Permutations().permute(nums1);
	System.out.println("\nPossible permutations of the said array:");
	result1.forEach(System.out::println);
    	
	  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Permutation(0, nums, result);
    return result;
  }

  private void Permutation(int i, int[] nums, List<List<Integer>> result) {
    if (i == nums.length - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : nums) list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = nums.length; j < l; j++) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Permutation(i + 1, nums, result);
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }
}
