Got it! I can help rewrite your README description for GitHub so it keeps the same structure and meaning but looks slightly different—enough to avoid being identical. Here's a polished version:

---

# DSA Assignment in Java (From Scratch)

This repository contains a Data Structures and Algorithms (DSA) assignment implemented entirely in **Java** without using any built-in collections (no `ArrayList`, `LinkedList`, etc.). Each question is implemented in its own class, and all functionalities are demonstrated through `Main.java`. Time complexities are included where relevant, and the implementations focus on clarity, simplicity, and readability.

## Project Structure

```
src/
├─ Main.java
├─ Q1_DoublyLinkedList.java
├─ Q2_ArrayQueue.java
├─ Q2_LinkedListQueue.java
├─ Q3_Searching.java
├─ Q4_RecursionProblems.java
├─ Q5_Sorting.java
└─ Q6_BST.java
```

---

## Q1: Doubly Linked List (DLL)

This module implements a **Doubly Linked List** from scratch using nodes with `data`, `next`, and `prev` pointers. It supports traversing in both directions while maintaining `head` and `tail` correctly during insertions and deletions.

**Implemented Operations:**

* Insert at beginning/end
* Delete first/last node
* Delete by value, delete before/after a given value
* Find minimum and maximum values
* Print list forward and backward

**Edge Cases Handled:** empty list, missing values

**Time Complexity:**

| Operation                                          | Complexity |
| -------------------------------------------------- | ---------- |
| insertFirst, insertLast                            | O(1)       |
| deleteFirst, deleteLast                            | O(1)       |
| deleteByValue, deleteBeforeValue, deleteAfterValue | O(n)       |
| findMin, findMax                                   | O(n)       |

---

## Q2: Queue Implementations

Two queue implementations are provided to compare **array-based** and **linked-list-based** approaches.

**Array Queue:**

* Uses a circular buffer with `head`, `tail`, and `size`
* Dynamically resizes when full
* Enqueue and dequeue operations shown during execution

**Linked List Queue:**

* Maintains `head` and `tail` nodes for constant-time operations
* No resizing needed

**Time Complexity Comparison:**

| Queue Type        | Enqueue                         | Dequeue | Peek | Memory                                |
| ----------------- | ------------------------------- | ------- | ---- | ------------------------------------- |
| Array Queue       | O(1) amortized (O(n) on resize) | O(1)    | O(1) | Contiguous array, may over-allocate   |
| Linked List Queue | O(1)                            | O(1)    | O(1) | Extra pointer per node, flexible size |

**Finding Min/Max:** O(n) for both implementations (by scanning elements)

---

## Q3: Searching Algorithms

This section demonstrates searching in a **sorted array** using iterative and recursive techniques:

* **Iterative Binary Search** (find 20)
* **Recursive Binary Search** (find 25)
* **Recursive Linear Search** (find 12)
* **Recursive Min/Max** computation

**Complexity:**

| Algorithm               | Time     | Space                                |
| ----------------------- | -------- | ------------------------------------ |
| Binary Search           | O(log n) | Iterative: O(1), Recursive: O(log n) |
| Recursive Linear Search | O(n)     | O(n)                                 |
| Recursive Min/Max       | O(n)     | O(n)                                 |

---

## Q4: Recursion Problems

Classic problems solved purely using **recursion**:

* Factorial
* Fibonacci sequence
* Sum of array elements
* Check if array is sorted
* Find min/max in array

Each method reduces problem size per call until a base condition is reached and then propagates results back up the call stack.

---

## Q5: Sorting Algorithms

Two sorting algorithms are implemented for the array `{5, 1, 4, 2, 8}`:

* **Merge Sort:**

  * Divide-and-conquer strategy with auxiliary array for merging
  * Guaranteed O(n log n) time

* **Quick Sort:**

  * Partitions around a pivot recursively
  * Average case O(n log n), worst case O(n²)

| Algorithm  | Time Complexity                  | Space Complexity         |
| ---------- | -------------------------------- | ------------------------ |
| Merge Sort | O(n log n) (all cases)           | O(n)                     |
| Quick Sort | O(n log n) avg/best, O(n²) worst | O(log n) (avg recursion) |

---

## Q6: Binary Search Tree (BST)

This module builds a **BST** by inserting `{50, 30, 70, 20, 40, 60, 80}` and demonstrates:

* Inorder, Preorder, Postorder traversals
* Searching for 60
* Deleting node 80 (handles all BST deletion cases)
* Finding minimum and maximum
* Counting total and leaf nodes
* Computing tree height

**BST Complexity:**

| Operation                | Average Case | Worst Case |
| ------------------------ | ------------ | ---------- |
| Insert/Search/Delete     | O(log n)     | O(n)       |
| Traversals/Counts/Height | O(n)         | O(n)       |

