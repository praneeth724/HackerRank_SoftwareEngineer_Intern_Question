# 🛒 HackerRank Software Enginner Intern Certified Solutions 

## Overview

This repository contains solutions to a set of interesting problems, including:

1. **Price Check Problem**:
   - A shop uses old-style cash registers where prices are manually entered, which can lead to errors. 
   - The task is to identify discrepancies between expected and entered prices for sold products.

2. **SQL Query for Customer Filtering**:
   - Query to filter and sort customer data based on combined name lengths and other criteria.

3. **Data Structure Analysis**:
   - Determining which data structures support operations like erasing elements at the beginning or end in O(1) time.

---

## Problem Descriptions

### 1. Price Check Problem
- **Language**: Java
- **Task**: Compare expected product prices with the sold prices and count the errors.
- **Solution**: Implemented in the `priceCheck` method within the Java program.
- **Key Features**:
  - Input: Lists of products, their prices, sold products, and sold prices.
  - Output: Number of errors in selling prices.

### 2. SQL Customer Query
- **Language**: MySQL
- **Task**: Filter customer data where the combined length of `FIRST_NAME` and `LAST_NAME` is less than 12 characters. Sort by:
  1. Combined name lengths.
  2. Alphabetical order.
  3. Customer ID.
- **Solution**:
  ```sql
  SELECT 
      ID, 
      FIRST_NAME, 
      LAST_NAME
  FROM 
      CUSTOMER
  WHERE 
      LENGTH(FIRST_NAME) + LENGTH(LAST_NAME) < 12
  ORDER BY 
      LENGTH(FIRST_NAME) + LENGTH(LAST_NAME), 
      CONCAT(FIRST_NAME, LAST_NAME), 
      ID;

### 3. Data Structure O(1) Operations
#### Question: Which data structure allows erasing from the beginning or end in O(1) time?
Options:

A) deque

B) vector

C) stack

D) segment tree

Answer: A) deque



### 4. SQL Result Tuple Count
#### Question: How many tuples does the result of the following SQL query return where result = 'Supplymentary'?

Options:

A) 2

B) 0

C) 3

D) 4

Answer: A) 2
