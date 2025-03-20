# Binary Search Algorithm

[***Binary search***](https://www.w3schools.com/dsa/dsa_algo_binarysearch.php) is a **search algorithm** used to find the position of a target value within a sorted array. It works by repeatedly dividing the search interval in half until the target value is found or the interval is empty. The search interval is halved by comparing the target element with the middle value of the search space.

## Conditions to apply Binary Search

1. The data structure must be sorted.
2. Access to any element of the data structure should take constant time.

## Step-by-step Algorithm

> PS: The Binary Search Algorithm can be implemented in the following two ways
>
> - Iterative Binary Search Algorithm
>
> - Recursive Binary Search Algorithm

- Divide the search space into two halves by finding the middle index “mid”. 
- Compare the middle element of the search space with the key. 
- If the key is found at middle element, the process is terminated.
- If the key is not found at middle element, choose which half will be used as the next search space.
    - If the key is smaller than the middle element, then the left side is used for next search.
    - If the key is larger than the middle element, then the right side is used for next search.
- This process is continued until the key is found or the total search space is exhausted.

## Complexity Analysis

Each time Binary Search checks a new value to see if it is the target value, the search area is halved.

**This means that even in the worst case scenario where Binary Search cannot find the target value, it still only needs `log2 n` comparisons to look through a sorted array of n values.**

![Binary Search x Linear Search](https://www.w3schools.com/dsa/img_binarysearch_timecomplexity.png)

- Time Complexity: 
    - Best Case: O(1)
    - Average Case: O(log N)
    - Worst Case: O(log N)
- Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).
