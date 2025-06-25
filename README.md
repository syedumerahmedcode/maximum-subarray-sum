# maximum-subarray-sum

## Table of content

- [Introduction](#introduction)
- [Explanation](#explanation)
- [Complexity Analysis](#complexity-analysis)
- [Edge Cases](#edge-cases)
- [Technologies Used](#technologies-used)
- [Commands](#commands)
- [Contribution](#contribution)
- [Contact Information](#contact-information)

## Introduction

Given a input array of integers `inputToCheck`, find the maximum sum of a contiguous subarray in an integer array.

Please note that it is also known as Kadane's Algorithm.

For Example

```java
Input

inputToCheck = [-2, 1, -3, 4, -1, 2, 1, -5, 4];

Output

result: 6, which corresponds to the subarray [4, -1, 2, 1].
```

## Explanation

The main idea behind Kadane's Algorithm is that the maximum sum of a subarray ending at a particular index can be derived from the maximum sum of the subarray ending at the previous index. This allows us to build the solution incrementally.

### Initialization:

We start with two variables:

`maximumSoFar:` This holds the maximum sum found so far. We initialize it to the first element of the array.

`maximumEndingHere:` This holds tthe maximum sum of the subarray that ends at the current index. We initialize it to the first element of the array as well.

### Iterate Through the Array:

For each element in the array (starting from the second element), we:

- update `maximumEndingHere` using `maximumEndingHere = max(currentElement, maximumEndingHere + currentElement)`. This step checks whether to start a new subarray at the current element or to continue the existing subarray. Also, we

- Update `maximumSoFar` via `maximumSoFar = max(maximumSoFar, maximumEndingHere)`. This helps us in keeping track of the overall maximum sum found.

### Resetting:

If `maximumEndingHere` becomes negative, it indicates that the current subarray is not contributing positively to any future subarray. In this case, you can reset maxEndingHere to zero (or the next element).

### Return the Result:

After iterating through the array, `maximumSoFar` will contain the maximum sum of any contiguous subarray.

### Dry-run

Let's consider an example array: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`.

#### Initialization

- `maximumSoFar = -2`
- `maximumEndingHere = -2`

#### Iteration

Index 1 `(1)`:

- `maximumEndingHere = max(1, -2 + 1) = 1`
- `maximumSoFar = max(-2, 1) = 1`

Index 2 `(-3)`:

- `maximumEndingHere = max(-3, 1 - 3) = -2`
- `maximumSoFar = max(1, -2) = 1`

Index 3 `(4)`:

- `maximumEndingHere = max(4, -2 + 4) = 4`
- `maximumSoFar = max(1, 4) = 4`

Index 4 `(-1)`:

- `maximumEndingHere = max(-1, 4 - 1) = 3`
- `maximumSoFar = max(4, 3) = 4`

Index 5 `(2)`:

- `maximumEndingHere = max(2, 3 + 2) = 5`
- `maximumSoFar = max(4, 5) = 5`

Index 6 `(1)`:

- `maximumEndingHere = max(1, 5 + 1) = 6`
- `maximumSoFar = max(5, 6) = 6`

Index 7 `(-5)`:

- `maximumEndingHere = max(-5, 6 - 5) = 1`
- `maximumSoFar = max(6, 1) = 6`

Index 8 `(4)`:

- `maximumEndingHere = max(4, 1 + 4) = 5`
- `maximumSoFar = max(6, 5) = 6`

#### Final result

After processing all elements, `maximumSoFar` is 6, which corresponds to the subarray _[4, -1, 2, 1]_.

> [It is explained more here](Please insert working link here)

## Complexity Analysis

### Time Complexity

**O(n)**: In the worst case scenario, O(n), where n is the number of elements in the array. The algorithm makes a single pass through the array.

## Edge Cases

- **first edge case subheading:** Brief explanation of the first edge case scenario.
- **second edge case subheading:** Brief explanation of the second edge case scenario.
- **third edge case subheading:** Brief explanation of the third edge case scenario.

## Technologies Used

- Java 11

## Commands

To compile and test, please checkout the project on your local machine and run _main method_ in the Executor class.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=[GitHub]%20Hello%20from%20Github).
