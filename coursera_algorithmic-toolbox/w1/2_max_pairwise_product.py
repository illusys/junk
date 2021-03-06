# Problem Description
# Problem

# Given a sequence of non-negative integers a0,…,an−1, find the maximum pairwise product, that is, the largest integer that can be obtained by multiplying two different elements from the sequence (or, more formally, max0≤i≠j≤n−1aiaj). Different elements here mean ai and aj with i≠j (it can be the case that ai=aj).
# Input format

# The first line of the input contains an integer n. The next line contains n non-negative integers a0,…,an−1 (separated by spaces).
# Constraints

# 2≤n≤2⋅105; 0≤a0,…,an−1≤105.
# Output format

# Output a single number — the maximum pairwise product.
# Sample 1

# Input:
# 3
# 1 2 3

# Output:
# 6

# Explanation:
# 6=2×3

# Sample 2
# Input:
# 10
# 7 5 14 2 8 8 10 1 2 3

# Output:
# 140

# Explanation:
# 140=14×10

n = int(input())
a = [int(x) for x in input().split()]
assert(len(a) == n)

result = 0

for i in range(0, n):
    for j in range(i+1, n):
        if a[i]*a[j] > result:
            result = a[i]*a[j]

print(result)
