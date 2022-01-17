# Table of Contents
1. [Algorithmic problem 1](#algorithmic-problem-1---parking-dilemma)
    1. [Run solution](#run-solution)
    2. [Test solution](#test-solution)
    3. [Example](#example)
2. [Algorithmic problem 2](#algorithmic-problem-2)
    1. [Run solution](#run-solution-1)
    2. [Test solution](#test-solution-1)
    3. [Example](#example-1)

# Algorithmic problem 1 - Parking Dilemma

In this problem it is required to find the optimal solution for the park roof cover

## Run solution

```bash
java Task1.java
```

## Test solution

After running code there will be 3 lines for user input:

1. "n" -> integer (number of parked places)
2. "cars" -> integer array (takes n space seperated integers)
3. "k" -> integer (the number of cars that must be covered by the roof)

## Example

<ul>
    <li>n = 4 (number of parked places);</li>
    <li>cars[n] = [6 2 12 7] (parking positions where cars are parked);</li>
    <li>k = 3 (number of cars that must be covered by the roof);</li>
    <li>result = 6 (output for the minimum length of a roof that can cover k cars).</li>
</ul>


```bash
4
6 2 12 7
3
6
```

<br/>
<br/>

# Algorithmic problem 2

In this problem first we will check neighnbors of each element of matrix, then we will find country number as claimed by neighbors

## Run solution

```bash
java Task2.java
```

## Test solution

After running code you need to enter following inputs in sequence:

1. Number of rows -> integer
2. Number of columns -> integer
3. Elements of matrix (in one line whole row must be entered)

## Example

In first two lines:
<ol>
    <li>Rows = 7</li>
    <li>Columns = 3</li>
</ol>

<br/>

Matrix:
<ol>
    <li>Each element should be entered for each row</li>
    <li>Each line contains the elements of whole row</li>
</ol>

 After these push enter and add the elements of next row.


5 4 4 
<br />
4 3 4 
<br />
3 2 4 
<br />
2 2 2 
<br />
3 3 4 
<br />
1 4 4 
<br />
4 1 1


Output:
11 (country count).



```bash
7
3
5 4 4
4 3 4
3 2 4
2 2 2
3 3 4
1 4 4
4 1 1
11
```
