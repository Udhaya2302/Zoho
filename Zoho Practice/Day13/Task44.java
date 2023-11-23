
import java.util.Arrays;

public class Task44{
    public static void main(String[] args){
        int[] nums = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 20;
       
        if (Quadruplet(nums, target))
		{
            System.out.println("Quadruplet exists.");
        }
		else
		{
            System.out.println("Quadruplet does not exist.");
        }
    }

public static boolean Quadruplet(int[] nums, int target)
	{
        Arrays.sort(nums);
       
        for (int i = 0; i < nums.length - 3; i++)
			{
            for (int j = i + 1; j < nums.length - 2; j++)
				{
                int left = j + 1;
                int right = nums.length - 1;
               
                while (left < right)
				{
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                   
                    if (sum == target)
				{
                        return true;
                    }
				else if (sum < target)
					{
                        left++;
                    }
				else
					{
                        right--;
                    }
                }
            }
        }
       
        return false;
    }

}
