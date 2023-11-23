Skip to content
4–Sum Problem | Quadruplets with a given sum
4-sum problem: Given an unsorted integer array, check if it contains four elements tuple (quadruplets) having a given sum.

For example,

Input:
 
nums = [ 2, 7, 4, 0, 9, 5, 1, 3 ]
target = 20
 
Output: Quadruplet exists.
 
Below are quadruplets with the given sum 20
 
(0, 4, 7, 9)
(1, 3, 7, 9)
(2, 4, 5, 9)
Practice This Problem

1. Naive Recursive Approach
The idea is similar to the 0–1 Knapsack problem and uses recursion. For each item, either consider it or exclude it and recur for the remaining items. Return true if the desired sum is found by including or excluding the current item.

This approach is demonstrated below in C++, Java, and Python:

C++
Java

class Main
{
    // Naive recursive function to check if quadruplet exists in an array
    // with the given sum
    public static boolean hasQuadruplet(int[] nums, int n, int target, int count)
    {
        // if the desired sum is reached with 4 elements, return true
        if (target == 0 && count == 4) {
            return true;
        }
 
        // return false if the sum is not possible with the current configuration
        if (count > 4 || n == 0) {
            return false;
        }
 
        // Recur with
        // 1. Including the current element
        // 2. Excluding the current element
 
        return hasQuadruplet(nums, n - 1, target - nums[n - 1], count + 1) ||
                        hasQuadruplet(nums, n - 1, target, count);
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 20;
 
        if (hasQuadruplet(nums, nums.length, target, 0)) {
            System.out.println("Quadruplet exists");
        }
        else {
            System.out.println("Quadruplet Doesn't Exist");
        }
    }
}
Download  Run Code

Output:

Quadruplet exists

Python
The time complexity of the above solution is exponential and requires additional space for the recursion (call stack). We can also use four nested loops and consider every quadruplet in the given array to check if the desired sum is found. This can reduce the time complexity to O(n4) for the input of n elements and doesn’t require any extra space.

2. Efficient solution using Hashing
The idea is to consider every pair of elements in the array one by one and insert it into a hash table. For each pair of elements (i, j), calculate the remaining sum. If the remaining sum exists in the map and elements involved in the previous occurrence doesn’t overlap with the current pair, i.e., (i, j, i, y) or (i, j, x, i) or (i, j, j, y), or (i, j, x, j), print the quadruplet and return.

Following is the C++, Java, and Python program that demonstrates it:

C++
Java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
class Pair
{
    public int x, y;
 
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
 
class Main
{
    // Function to check if quadruplet exists in an array with the given sum
    public static boolean hasQuadruplet(int[] nums, int n, int target)
    {
        // create an empty map
        // key —> target of a pair in the array
        // value —> list storing an index of every pair having that sum
        Map<Integer, List<Pair>> map = new HashMap<>();
 
        // consider each element except the last element
        for (int i = 0; i < n - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < n; j++)
            {
                // calculate the remaining sum
                int val = target - (nums[i] + nums[j]);
 
                // if the remaining sum is found on the map,
                // we have found a quadruplet
                if (map.containsKey(val))
                {
                    // check every pair having a sum equal to the remaining sum
                    for (Pair pair: map.get(val))
                    {
                        int x = pair.x;
                        int y = pair.y;
 
                        // if quadruplet doesn't overlap, print it and
                        // return true
                        if ((x != i && x != j) && (y != i && y != j))
                        {
                            System.out.println("Quadruplet Found ("
                                        + nums[i] + ", " + nums[j] + ", "
                                        + nums[x] + ", " + nums[y] + ")");
                            return true;
                        }
                    }
                }
 
                // insert the current pair into the map
 
                // null check (Java 8)
                map.putIfAbsent(nums[i] + nums[j], new ArrayList<>());
                map.get(nums[i] + nums[j]).add(new Pair(i, j));
            }
        }
 
        // return false if quadruplet doesn't exist
        return false;
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 20;
 
        if (!hasQuadruplet(nums, nums.length, target)) {
            System.out.println("Quadruplet Doesn't Exist");
        }
    }
}
Download  Run Code

Output:

Quadruplet Found (4, 0, 7, 9)

Python
The time complexity of the above solution is O(n3) and requires O(n2) extra space, where n is the size of the input.

 
Also See:

Print all quadruplets with a given sum | 4 sum problem extended

Rate this post

Average rating 4.86/5. Vote count: 133


Last Reviewed By: Admin
Previous:Determine whether a graph is Bipartite using DFSNext:Print all quadruplets with a given sum | 4 sum problem extended




This website uses cookies. By using this site, you agree to the use of cookies, our policies, copyright terms and other conditions. Read our Privacy Policy. 