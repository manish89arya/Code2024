import java.util.HashMap;
import java.util.Arrays;
public class TwoSum{


public int[] getTwoSum(int[] nums, int target)
{

HashMap<Integer, Integer> map = new HashMap<>();
for(int i = 0; i < nums.length; i++)
{
int tmp = target-nums[i];
if(map.containsKey(tmp))
{
    return new int[]{map.get(tmp), i};
}

map.put(nums[i],i);
}

return null;
}


public static void main(String[] args){


int[] nums = {3,3};
int target = 6;

TwoSum ts = new TwoSum();
 
System.out.println(Arrays.toString( ts.getTwoSum(nums,target)));



}

}