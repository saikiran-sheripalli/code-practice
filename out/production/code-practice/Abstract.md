# 🔍 DSA Boot Camp — Series 1: Binary Search

**Curated interview problem set · LeetCode-style statements · Target language: Java**

Each problem below is written the way LeetCode presents them — a clear description, a worked example, and constraints — followed by the pattern, optimal complexity, link, and companies known to ask it. Work top-to-bottom through the four tiers.

> **Complexity note:** `n` = input size. Space is the extra space of the optimal iterative solution (recursive variants add `O(log n)` stack space). Use `mid = low + (high - low) / 2` in Java to avoid integer overflow.

---

## 🟢 Tier 1 — Foundations
*Classic binary search, boundary handling, and search-space thinking.*

### 1. Binary Search · Easy · LC 704
**Description:** Given an array of integers `nums` sorted in ascending order and an integer `target`, return the index of `target` if it exists in `nums`, otherwise return `-1`. You must write an algorithm with `O(log n)` runtime.

**Example:**
```
Input:  nums = [-1, 0, 3, 5, 9, 12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4.
```
**Constraints:** `1 <= nums.length <= 10^4`; `-10^4 < nums[i], target < 10^4`; all elements are unique and sorted ascending.

**Pattern:** Classic BS · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Microsoft

---

### 2. Search Insert Position · Easy · LC 35
**Description:** Given a sorted array of distinct integers `nums` and a `target`, return the index if the target is found. If not, return the index where it would be inserted to keep the array sorted. Must run in `O(log n)`.

**Example:**
```
Input:  nums = [1, 3, 5, 6], target = 5   → Output: 2
Input:  nums = [1, 3, 5, 6], target = 2   → Output: 1
Input:  nums = [1, 3, 5, 6], target = 7   → Output: 4
```
**Constraints:** `1 <= nums.length <= 10^4`; `-10^4 <= nums[i], target <= 10^4`; `nums` sorted ascending, all distinct.

**Pattern:** Lower bound · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Adobe

---

### 3. First Bad Version · Easy · LC 278
**Description:** You are a product manager leading a team. The latest version of your product fails quality checks. Since each version is built on the previous one, all versions after a bad one are also bad. Given `n` versions `[1, 2, ..., n]` and an API `boolean isBadVersion(int version)`, find the first bad version while minimizing the number of API calls.

**Example:**
```
Input:  n = 5, bad = 4
Output: 4
Explanation: isBadVersion(3)=false, isBadVersion(5)=true, isBadVersion(4)=true.
             So version 4 is the first bad one.
```
**Constraints:** `1 <= bad <= n <= 2^31 - 1`.

**Pattern:** Boundary / predicate BS · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Google, Meta

---

### 4. Sqrt(x) · Easy · LC 69
**Description:** Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. You may **not** use any built-in exponent function or operator (e.g. `pow` or `x ** 0.5`).

**Example:**
```
Input:  x = 8   → Output: 2
Explanation: The square root of 8 is 2.828..., rounded down it is 2.
```
**Constraints:** `0 <= x <= 2^31 - 1`.

**Pattern:** BS on answer (intro) · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Bloomberg

---

### 5. Guess Number Higher or Lower · Easy · LC 374
**Description:** I pick a number from `1` to `n`. You guess repeatedly. Each guess calls `int guess(int num)` which returns `-1` (my number is lower), `1` (my number is higher), or `0` (correct). Return the number I picked.

**Example:**
```
Input:  n = 10, pick = 6
Output: 6
```
**Constraints:** `1 <= n <= 2^31 - 1`; `1 <= pick <= n`.

**Pattern:** Predicate BS · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Google

**🔑 Tier 1 takeaway:** Nail the `low`/`high`/`mid` template and the overflow-safe mid before moving on.

---

## 🟡 Tier 2 — Variations
*Rotated arrays, first/last occurrence, peak-finding.*

### 6. Find First and Last Position of Element in Sorted Array · Medium · LC 34
**Description:** Given an array `nums` sorted in non-decreasing order, find the starting and ending index of a given `target`. If `target` is not found, return `[-1, -1]`. Must run in `O(log n)`.

**Example:**
```
Input:  nums = [5, 7, 7, 8, 8, 10], target = 8   → Output: [3, 4]
Input:  nums = [5, 7, 7, 8, 8, 10], target = 6   → Output: [-1, -1]
```
**Constraints:** `0 <= nums.length <= 10^5`; `-10^9 <= nums[i], target <= 10^9`; `nums` non-decreasing.

**Pattern:** First/last occurrence · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, LinkedIn

---

### 7. Find Peak Element · Medium · LC 162
**Description:** A peak element is one strictly greater than its neighbors. Given `nums`, return the index of **any** peak. You may assume `nums[-1] = nums[n] = -∞` (out-of-bounds neighbors are negative infinity). Must run in `O(log n)`.

**Example:**
```
Input:  nums = [1, 2, 3, 1]   → Output: 2
Explanation: 3 is a peak; its index is 2.
Input:  nums = [1, 2, 1, 3, 5, 6, 4]   → Output: 5 (or 1)
```
**Constraints:** `1 <= nums.length <= 1000`; `-2^31 <= nums[i] <= 2^31 - 1`; no two adjacent values are equal.

**Pattern:** Peak / slope BS · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Google, Meta

---

### 8. Find Minimum in Rotated Sorted Array · Medium · LC 153
**Description:** A sorted array of unique elements was rotated between `1` and `n` times. Given the rotated array `nums`, return the minimum element. Must run in `O(log n)`.

**Example:**
```
Input:  nums = [3, 4, 5, 1, 2]   → Output: 1
Explanation: The original was [1,2,3,4,5], rotated 3 times.
Input:  nums = [4, 5, 6, 7, 0, 1, 2]   → Output: 0
```
**Constraints:** `1 <= nums.length <= 5000`; `-5000 <= nums[i] <= 5000`; all unique; array is a rotation of an ascending sort.

**Pattern:** Rotated array · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Microsoft

---

### 9. Search in Rotated Sorted Array · Medium · LC 33
**Description:** An ascending sorted array of distinct integers is possibly rotated at an unknown pivot. Given the rotated array `nums` and a `target`, return its index, or `-1` if absent. Must run in `O(log n)`.

**Example:**
```
Input:  nums = [4, 5, 6, 7, 0, 1, 2], target = 0   → Output: 4
Input:  nums = [4, 5, 6, 7, 0, 1, 2], target = 3   → Output: -1
```
**Constraints:** `1 <= nums.length <= 5000`; `-10^4 <= nums[i], target <= 10^4`; all values distinct.

**Pattern:** Rotated array · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Google, Uber

---

### 10. Single Element in a Sorted Array · Medium · LC 540
**Description:** In a sorted array, every element appears exactly twice except for one element that appears once. Return that single element. Must run in `O(log n)` time and `O(1)` space.

**Example:**
```
Input:  nums = [1, 1, 2, 3, 3, 4, 4, 8, 8]   → Output: 2
Input:  nums = [3, 3, 7, 7, 10, 11, 11]      → Output: 10
```
**Constraints:** `1 <= nums.length <= 10^5`; `0 <= nums[i] <= 10^5`; sorted, exactly one single element.

**Pattern:** Parity / index BS · **Time:** `O(log n)` · **Space:** `O(1)` · **Asked at:** Amazon, Microsoft

---

### 11. Search in Rotated Sorted Array II · Medium · LC 81
**Description:** Same as LC 33, but `nums` may contain **duplicates**. Given the rotated array and a `target`, return `true` if it exists, otherwise `false`. Duplicates can degrade performance — analyze the worst case.

**Example:**
```
Input:  nums = [2, 5, 6, 0, 0, 1, 2], target = 0   → Output: true
Input:  nums = [2, 5, 6, 0, 0, 1, 2], target = 3   → Output: false
```
**Constraints:** `1 <= nums.length <= 5000`; `-10^4 <= nums[i], target <= 10^4`; array is a rotation of a non-decreasing sort; duplicates allowed.

**Pattern:** Rotated array + dupes · **Time:** `O(log n)` avg, `O(n)` worst · **Space:** `O(1)` · **Asked at:** Amazon, Facebook

**🔑 Tier 2 takeaway:** Decide *which half is sorted*, then whether the target lies within it. Duplicates break the clean `O(log n)` guarantee — know why.

---

## 🟠 Tier 3 — Binary Search on Answer
*When the array isn't the search space, the **answer range** is. Guess a value, check feasibility, shrink the range.*

### 12. Koko Eating Bananas · Medium · LC 875
**Description:** Koko has `n` piles of bananas; `piles[i]` is the size of the i-th pile. She eats at a speed of `k` bananas per hour: each hour she picks one pile and eats `k` from it (or the whole pile if it has fewer than `k`, then stops for that hour). Return the **minimum** integer speed `k` such that she can eat all bananas within `h` hours.

**Example:**
```
Input:  piles = [3, 6, 7, 11], h = 8   → Output: 4
Input:  piles = [30, 11, 23, 4, 20], h = 5   → Output: 30
```
**Constraints:** `1 <= piles.length <= 10^4`; `piles.length <= h <= 10^9`; `1 <= piles[i] <= 10^9`.

**Pattern:** BS on answer + feasibility · **Time:** `O(n log max)` · **Space:** `O(1)` · **Asked at:** Amazon, Google

---

### 13. Capacity To Ship Packages Within D Days · Medium · LC 1011
**Description:** Packages on a conveyor belt must ship within `days` days, in the given order. Each day the ship loads packages (in order) not exceeding its capacity. Return the **minimum** ship capacity that allows shipping all packages within `days` days.

**Example:**
```
Input:  weights = [1,2,3,4,5,6,7,8,9,10], days = 5   → Output: 15
Explanation: Split as (1..5)(6,7)(8)(9)(10) → max load 15.
```
**Constraints:** `1 <= days <= weights.length <= 5 * 10^4`; `1 <= weights[i] <= 500`.

**Pattern:** BS on answer (max-of-mins) · **Time:** `O(n log sum)` · **Space:** `O(1)` · **Asked at:** Amazon, Flipkart

---

### 14. Minimum Number of Days to Make m Bouquets · Medium · LC 1482
**Description:** Given `bloomDay[i]` (the day the i-th flower blooms), you want `m` bouquets, each needing `k` **adjacent** flowers. Return the minimum number of days to wait to make `m` bouquets, or `-1` if impossible.

**Example:**
```
Input:  bloomDay = [1,10,3,10,2], m = 3, k = 1   → Output: 3
Input:  bloomDay = [1,10,3,10,2], m = 3, k = 2   → Output: -1
Explanation: Need 3*2=6 flowers but only 5 exist.
```
**Constraints:** `bloomDay.length == n`; `1 <= n <= 10^5`; `1 <= bloomDay[i] <= 10^9`; `1 <= m <= 10^6`; `1 <= k <= n`.

**Pattern:** BS on answer + greedy check · **Time:** `O(n log max)` · **Space:** `O(1)` · **Asked at:** Google

---

### 15. Find the Smallest Divisor Given a Threshold · Medium · LC 1283
**Description:** Given an array `nums` and an integer `threshold`, choose a positive integer divisor. Divide each element by it (rounding **up**) and sum the results. Return the **smallest** divisor such that the sum ≤ `threshold`.

**Example:**
```
Input:  nums = [1, 2, 5, 9], threshold = 6   → Output: 5
Explanation: divisor 5 → ceil(1/5)+ceil(2/5)+ceil(5/5)+ceil(9/5) = 1+1+1+2 = 5 ≤ 6.
```
**Constraints:** `1 <= nums.length <= 5 * 10^4`; `1 <= nums[i] <= 10^6`; `nums.length <= threshold <= 10^6`.

**Pattern:** BS on answer · **Time:** `O(n log max)` · **Space:** `O(1)` · **Asked at:** Amazon

---

### 16. Allocate Minimum Number of Pages (Book Allocation) · Hard · GFG
**Description:** Given `n` books where `arr[i]` is the number of pages in book `i`, and `m` students, allocate books so that: each student gets a contiguous sequence of books, every book is allocated, and each student gets at least one book. Minimize the **maximum** number of pages assigned to any student. Return that minimum, or `-1` if `m > n`.

**Example:**
```
Input:  arr = [12, 34, 67, 90], m = 2   → Output: 113
Explanation: Best split is [12,34,67] and [90] → max = 113.
```
**Constraints:** `1 <= n <= 10^5`; `1 <= arr[i] <= 10^6`; `1 <= m <= 10^5`.

**Pattern:** BS on answer (partition) · **Time:** `O(n log sum)` · **Space:** `O(1)` · **Asked at:** Amazon, Flipkart

---

### 17. Aggressive Cows · Hard · SPOJ AGGRCOW / GFG
**Description:** Given `n` stall positions on a line and `k` cows, place the cows in stalls so that the **minimum** distance between any two cows is as **large** as possible. Return that largest minimum distance.

**Example:**
```
Input:  stalls = [1, 2, 4, 8, 9], k = 3   → Output: 3
Explanation: Place cows at 1, 4, 8 → min gap = 3, which is the maximum achievable.
```
**Constraints:** `2 <= n <= 10^5`; `2 <= k <= n`; positions up to `10^9`.

**Pattern:** BS on answer (max-of-mins) · **Time:** `O(n log range)` · **Space:** `O(1)` · **Asked at:** Google, DE Shaw

---

### 18. Split Array Largest Sum · Hard · LC 410
**Description:** Given an array `nums` and an integer `k`, split `nums` into `k` non-empty **contiguous** subarrays. Minimize the largest sum among these subarrays. Return that minimized largest sum.

**Example:**
```
Input:  nums = [7, 2, 5, 10, 8], k = 2   → Output: 18
Explanation: Best split is [7,2,5] and [10,8] → largest sum = 18.
```
**Constraints:** `1 <= nums.length <= 1000`; `0 <= nums[i] <= 10^6`; `1 <= k <= min(50, nums.length)`.

**Pattern:** BS on answer (partition) · **Time:** `O(n log sum)` · **Space:** `O(1)` · **Asked at:** Amazon, Google

**🔑 Tier 3 takeaway:** Always ask the same three questions — *What's the answer range? Is `mid` feasible (a boolean check)? Am I minimizing or maximizing?* Problems 16–18 are the same partition idea in three disguises.

---

## 🔴 Tier 4 — Advanced / Interview Favorites
*2D search spaces and cross-array binary search.*

### 19. Search a 2D Matrix · Medium · LC 74
**Description:** Given an `m x n` matrix where each row is sorted left-to-right, and the first integer of each row is greater than the last integer of the previous row, determine whether `target` exists. Must run in `O(log(m·n))`.

**Example:**
```
Input:  matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3   → Output: true
Input:  same matrix, target = 13   → Output: false
```
**Constraints:** `1 <= m, n <= 100`; `-10^4 <= matrix[i][j], target <= 10^4`.

**Pattern:** 2D → 1D BS · **Time:** `O(log(m·n))` · **Space:** `O(1)` · **Asked at:** Amazon, Microsoft

---

### 20. Find K Closest Elements · Medium · LC 658
**Description:** Given a sorted array `arr`, and integers `k` and `x`, return the `k` closest integers to `x`, sorted in ascending order. Closeness is by absolute difference; ties prefer the smaller value.

**Example:**
```
Input:  arr = [1,2,3,4,5], k = 4, x = 3   → Output: [1,2,3,4]
Input:  arr = [1,2,3,4,5], k = 4, x = -1  → Output: [1,2,3,4]
```
**Constraints:** `1 <= k <= arr.length <= 10^4`; `arr` sorted ascending; `-10^4 <= arr[i], x <= 10^4`.

**Pattern:** BS + window boundary · **Time:** `O(log n + k)` · **Space:** `O(1)` (excl. output) · **Asked at:** Amazon, Google

---

### 21. Search a 2D Matrix II · Medium · LC 240
**Description:** Given an `m x n` matrix sorted in ascending order along **both** rows and columns (but rows are not globally ordered against each other), determine whether `target` exists.

**Example:**
```
Input:  matrix = [[1,4,7,11],[2,5,8,12],[3,6,9,16],[10,13,14,17]], target = 5  → Output: true
Input:  same matrix, target = 20   → Output: false
```
**Constraints:** `1 <= m, n <= 300`; `-10^9 <= matrix[i][j], target <= 10^9`; each row and each column sorted ascending.

**Pattern:** Staircase search · **Time:** `O(m + n)` · **Space:** `O(1)` · **Asked at:** Amazon, Google

---

### 22. Kth Smallest Element in a Sorted Matrix · Medium · LC 378
**Description:** Given an `n x n` matrix where each row and each column is sorted ascending, return the `k`-th smallest element **in sorted order** (not the k-th distinct element). Aim for better than `O(n^2)` memory.

**Example:**
```
Input:  matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8   → Output: 13
Explanation: Sorted order is [1,5,9,10,11,12,13,13,15], the 8th value is 13.
```
**Constraints:** `n == matrix.length == matrix[i].length`; `1 <= n <= 300`; `-10^9 <= matrix[i][j] <= 10^9`; `1 <= k <= n^2`.

**Pattern:** BS on value range + count · **Time:** `O(n log range)` · **Space:** `O(1)` · **Asked at:** Amazon, Google

---

### 23. Median of Two Sorted Arrays · Hard · LC 4
**Description:** Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n`, return the median of the combined sorted array. The overall run time must be `O(log(m+n))`.

**Example:**
```
Input:  nums1 = [1, 3], nums2 = [2]   → Output: 2.00000
Explanation: Merged = [1,2,3], median is 2.
Input:  nums1 = [1, 2], nums2 = [3, 4]   → Output: 2.50000
Explanation: Merged = [1,2,3,4], median is (2+3)/2 = 2.5.
```
**Constraints:** `0 <= m, n <= 1000`; `1 <= m + n <= 2000`; `-10^6 <= nums1[i], nums2[i] <= 10^6`; both arrays sorted ascending.

**Pattern:** Partition BS (cross-array) · **Time:** `O(log(min(m,n)))` · **Space:** `O(1)` · **Asked at:** Google, Amazon, Adobe

**🔑 Tier 4 takeaway:** #23 is the crown jewel — partition both arrays so the left halves hold exactly half the total. #21 vs #19 is a classic trap: know when the matrix is *fully* sorted (flatten) vs *row-and-column* sorted (staircase).

---

## 🧠 Key Patterns to Master

1. **The exact template.** Master the `[low, high]` invariant; be deliberate about `low <= high` vs `low < high`, and `high = mid` vs `high = mid - 1`. Off-by-one bugs are the #1 cause of failed binary search interviews.
2. **Lower bound / upper bound.** Finding the *first* or *last* index satisfying a condition is the reusable primitive behind half these problems.
3. **Predicate / monotonic thinking.** Any problem whose answer space splits into `[false … false, true … true]` is a binary search. Ask: *"Is there a boolean check that flips exactly once?"*
4. **Binary search on the answer.** For **min-of-max** or **max-of-min** phrasing ("smallest speed", "largest minimum distance"), search the *range of possible answers* and write a feasibility function.
5. **Rotated & modified arrays.** Identify which half is sorted, then decide whether the target falls inside it. Handle duplicates as a special case.
6. **Reducing dimensions.** Flatten 2D → 1D, use staircase elimination, or binary-search over a value range while counting.

### ⚡ Interview tips
- **State your search space out loud** ("I'll binary search on eating speed from 1 to max pile") — interviewers grade your framing.
- **Write the feasibility check first** for "BS on answer" problems, then wrap binary search around it.
- **Test the boundaries:** empty array, single element, target at index 0 / last, all-duplicates.
- **Prefer** `mid = low + (high - low) / 2` in Java to avoid overflow.

---

*DSA Boot Camp — Series 1 · Binary Search · Happy solving! 🚀*
