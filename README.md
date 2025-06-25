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

> [It is explained more here](Please insert working link here)

## Complexity Analysis

### Time Complexity

**O(n)**: In the worst case scenario, it will traverse through the complete input string.

## Edge Cases

- **All characters appear more than once:** For such an input string, it returns the statement that there is no non-repeating character in the input.
- **Input string consist of only one character:** For such an input string, it returns the statement that there is no non-repeating character in the input.
- **When inputString=null:** When string to check is _null_, it returns the statement that there is no non-repeating character in the input.
- **When inputString=""/" ":** When string to check is _empty_ or _blank(i.e. contains n number of whitespaces only)_, it returns the statement that there is no non-repeating character in the input.

Please note that some edge cases are partially covered in the _pre-check_ part of the logic.

## Technologies Used

- Java 11

## Commands

To compile and test, please checkout the project on your local machine and run _main method_ in the Executor class.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=[GitHub]%20Hello%20from%20Github).
