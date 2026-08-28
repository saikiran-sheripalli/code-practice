# 🔍 DSA Boot Camp — Series 1: Binary Search

**Curated interview problem set · Target language: Java**

A progressive, tier-based roadmap of the binary search problems most frequently asked at Amazon, Google, Microsoft, and product-based startups. Work top-to-bottom — each tier builds the intuition needed for the next.

> **Complexity note:** `n` = array length. Unless stated otherwise, space is the extra space of the optimal iterative solution (recursive variants add `O(log n)` stack space).

---

## 🟢 Tier 1 — Foundations
*Classic binary search, boundary handling, and search-space thinking.*

| # | Problem | Difficulty | One-line Statement | Pattern | Time | Space | Link | Asked At |
|---|---------|-----------|--------------------|---------|------|-------|------|----------|
| 1 | Binary Search | Easy | Find a target's index in a sorted array. | Classic BS | `O(log n)` | `O(1)` | LC 704 | Amazon, Microsoft |
| 2 | Search Insert Position | Easy | Return index of target, or where it would be inserted. | Lower bound | `O(log n)` | `O(1)` | LC 35 | Amazon, Adobe |
| 3 | First Bad Version | Easy | Find the first "bad" version via an API predicate. | Boundary / predicate BS | `O(log n)` | `O(1)` | LC 278 | Google, Meta |
| 4 | Sqrt(x) | Easy | Compute integer square root without built-ins. | BS on answer (intro) | `O(log n)` | `O(1)` | LC 69 | Amazon, Bloomberg |
| 5 | Guess Number Higher or Lower | Easy | Guess a number using higher/lower feedback. | Predicate BS | `O(log n)` | `O(1)` | LC 374 | Google |

**Tier 1 takeaway:** Nail the `low`/`high`/`mid` template and the `mid = low + (high - low) / 2` overflow-safe pattern before moving on.

---

## 🟡 Tier 2 — Variations
*Rotated arrays, first/last occurrence, peak-finding — binary search where the array isn't a plain sorted list.*

| # | Problem | Difficulty | One-line Statement | Pattern | Time | Space | Link | Asked At |
|---|---------|-----------|--------------------|---------|------|-------|------|----------|
| 6 | Find First and Last Position | Medium | Find start & end index of a target in a sorted array. | First/last occurrence | `O(log n)` | `O(1)` | LC 34 | Amazon, LinkedIn |
| 7 | Find Peak Element | Medium | Find any element greater than both neighbors. | Peak / slope BS | `O(log n)` | `O(1)` | LC 162 | Google, Meta |
| 8 | Find Minimum in Rotated Sorted Array | Medium | Find the smallest element in a rotated sorted array. | Rotated array | `O(log n)` | `O(1)` | LC 153 | Amazon, Microsoft |
| 9 | Search in Rotated Sorted Array | Medium | Search a target in a rotated sorted array (no dupes). | Rotated array | `O(log n)` | `O(1)` | LC 33 | Amazon, Google, Uber |
| 10 | Single Element in a Sorted Array | Medium | Every element appears twice except one — find it. | Parity / index BS | `O(log n)` | `O(1)` | LC 540 | Amazon, Microsoft |
| 11 | Search in Rotated Sorted Array II | Medium | Same as #9 but duplicates are allowed. | Rotated array + dupes | `O(log n)` avg, `O(n)` worst | `O(1)` | LC 81 | Amazon, Facebook |

**Tier 2 takeaway:** Learn to decide *which half is sorted* and whether the target lies within it. Duplicates break the clean `O(log n)` guarantee — know why.

---

## 🟠 Tier 3 — Binary Search on Answer
*The interview power move: when the array isn't the search space, the **answer range** is. Guess a value, check feasibility, shrink the range.*

| # | Problem | Difficulty | One-line Statement | Pattern | Time | Space | Link | Asked At |
|---|---------|-----------|--------------------|---------|------|-------|------|----------|
| 12 | Koko Eating Bananas | Medium | Min eating speed to finish all bananas within `h` hours. | BS on answer + feasibility | `O(n log max)` | `O(1)` | LC 875 | Amazon, Google |
| 13 | Capacity to Ship Packages Within D Days | Medium | Min ship capacity to deliver within `D` days. | BS on answer (max-of-mins) | `O(n log sum)` | `O(1)` | LC 1011 | Amazon, Flipkart |
| 14 | Minimum Days to Make m Bouquets | Medium | Min days to make `m` bouquets of `k` adjacent flowers. | BS on answer + greedy check | `O(n log max)` | `O(1)` | LC 1482 | Google |
| 15 | Find the Smallest Divisor Given a Threshold | Medium | Smallest divisor so the sum of divisions ≤ threshold. | BS on answer | `O(n log max)` | `O(1)` | LC 1283 | Amazon |
| 16 | Allocate Minimum Number of Pages | Hard | Distribute books to `k` students minimizing max pages. | BS on answer (partition) | `O(n log sum)` | `O(1)` | GFG (Book Allocation) | Amazon, Flipkart |
| 17 | Aggressive Cows | Hard | Place `k` cows in stalls maximizing the min distance. | BS on answer (max-of-mins) | `O(n log range)` | `O(1)` | SPOJ AGGRCOW / GFG | Google, DE Shaw |
| 18 | Split Array Largest Sum | Hard | Split array into `k` parts minimizing the largest part sum. | BS on answer (partition) | `O(n log sum)` | `O(1)` | LC 410 | Amazon, Google |

**Tier 3 takeaway:** The template is always the same three questions — *What's the answer range? Is `mid` feasible (a boolean check)? Am I minimizing or maximizing?* Problems 16–18 are the same partition idea in three disguises.

---

## 🔴 Tier 4 — Advanced / Interview Favorites
*The high-signal problems that separate strong candidates — 2D search spaces and cross-array binary search.*

| # | Problem | Difficulty | One-line Statement | Pattern | Time | Space | Link | Asked At |
|---|---------|-----------|--------------------|---------|------|-------|------|----------|
| 19 | Search a 2D Matrix | Medium | Search a target in a row+column sorted matrix (flattened). | 2D → 1D BS | `O(log (m·n))` | `O(1)` | LC 74 | Amazon, Microsoft |
| 20 | Find K Closest Elements | Medium | Return `k` elements closest to `x` in a sorted array. | BS + window boundary | `O(log n + k)` | `O(1)` | LC 658 | Amazon, Google |
| 21 | Search a 2D Matrix II | Medium | Search a matrix sorted along rows *and* columns. | Staircase search | `O(m + n)` | `O(1)` | LC 240 | Amazon, Google |
| 22 | Kth Smallest Element in a Sorted Matrix | Medium | Find the `k`-th smallest value in a sorted matrix. | BS on value range + count | `O(n log range)` | `O(1)` | LC 378 | Amazon, Google |
| 23 | Median of Two Sorted Arrays | Hard | Find the median of two sorted arrays in log time. | Partition BS (cross-array) | `O(log(min(m,n)))` | `O(1)` | LC 4 | Google, Amazon, Adobe |

**Tier 4 takeaway:** #23 is the crown jewel — partition both arrays so the left halves hold exactly half the total. #21 vs #19 is a classic trap: know when the matrix is *fully* sorted (flatten) vs *row-and-column* sorted (staircase).

---

## 🧠 Key Patterns to Master

To crack essentially any binary search interview question, internalize these six patterns:

1. **The exact template.** Master the `[low, high]` invariant and be deliberate about `low <= high` vs `low < high`, and `high = mid` vs `high = mid - 1`. Off-by-one bugs are the #1 cause of failed binary search interviews.

2. **Lower bound / upper bound.** Finding the *first* or *last* index satisfying a condition (`first/last occurrence`, insert position) is the reusable primitive behind half the problems here.

3. **Predicate / monotonic thinking.** Any problem where the answer space splits into `[false … false, true … true]` is a binary search. Ask: *"Is there a boolean check that flips exactly once?"*

4. **Binary search on the answer.** When you're asked for a **minimum-maximum** or **maximum-minimum** ("smallest speed", "largest minimum distance"), don't search the array — search the *range of possible answers* and write a feasibility function.

5. **Rotated & modified arrays.** Always identify which half is sorted, then decide whether the target falls inside it. Handle duplicates as a special case.

6. **Reducing dimensions.** Collapse 2D to 1D (flatten), use staircase elimination, or binary-search over a *value range* while counting — these convert scary matrix problems into familiar ones.

### ⚡ Interview tips
- **State your search space out loud** ("I'll binary search on eating speed from 1 to max pile") — interviewers grade your framing.
- **Write the feasibility check first** for "BS on answer" problems, then wrap binary search around it.
- **Test the boundaries**: empty array, single element, target at index 0 / last, all-duplicates.
- **Prefer** `mid = low + (high - low) / 2` in Java to avoid integer overflow.

---

*DSA Boot Camp — Series 1 · Binary Search · Happy solving! 🚀*