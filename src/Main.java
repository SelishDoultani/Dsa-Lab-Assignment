public class Main {
    public static void main(String[] args) {
        System.out.println("----- DSA Assignment ----\n");

        System.out.println("--- Doubly Linked List ---");
        Q1_DoublyLinkedList doublyList = new Q1_DoublyLinkedList();

        doublyList.insertFirst(10);
        doublyList.insertFirst(20);
        doublyList.insertLast(30);
        doublyList.insertLast(40);
        doublyList.insertLast(5);
        doublyList.insertLast(50);

        System.out.print("List forward: ");
        doublyList.displayForward();
        System.out.print("List backward: ");
        doublyList.displayBackward();

        System.out.println("Remove first node: " + doublyList.deleteFirst());
        System.out.println("Remove last node: " + doublyList.deleteLast());
        System.out.print("After deletions: ");
        doublyList.displayForward();

        doublyList.insertFirst(20);
        System.out.print("After adding 20 again: ");
        doublyList.displayForward();
        System.out.println("Remove node with value 20: " + doublyList.deleteByValue(20));
        System.out.print("Current list: ");
        doublyList.displayForward();

        System.out.println("Remove node before 30: " + doublyList.deleteBeforeValue(30));
        System.out.print("Updated list: ");
        doublyList.displayForward();

        doublyList.insertFirst(20);
        System.out.print("Added 20 again: ");
        doublyList.displayForward();
        System.out.println("Remove node after 20: " + doublyList.deleteAfterValue(20));
        System.out.print("Final DLL list: ");
        doublyList.displayForward();

        System.out.println("DLL Min value: " + doublyList.findMin());
        System.out.println("DLL Max value: " + doublyList.findMax());
        System.out.println();

        System.out.println("--- Array Queue (Resizable) ---");
        Q2_ArrayQueue arrQ = new Q2_ArrayQueue(3);
        arrQ.enqueue(10);
        arrQ.enqueue(20);
        arrQ.enqueue(30);

        System.out.print("Queue state: ");
        arrQ.display();

        arrQ.enqueue(40);
        System.out.print("Queue after enqueue(40): ");
        arrQ.display();

        System.out.println("Front element: " + arrQ.peek());
        System.out.println("Dequeue element: " + arrQ.dequeue());
        System.out.print("Queue now: ");
        arrQ.display();
        System.out.println("Minimum: " + arrQ.findMin() + ", Maximum: " + arrQ.findMax());
        System.out.println();

        System.out.println("--- Linked List Queue ---");
        Q2_LinkedListQueue linkQ = new Q2_LinkedListQueue();
        linkQ.enqueue(10);
        linkQ.enqueue(20);
        linkQ.enqueue(30);
        linkQ.enqueue(40);

        System.out.print("Queue ");
        linkQ.display();
        System.out.println("Front item: " + linkQ.peek());
        System.out.println("Removed item: " + linkQ.dequeue());
        System.out.print("Queue after removal: ");
        linkQ.display();
        System.out.println("Min: " + linkQ.findMin() + ", Max: " + linkQ.findMax());
        System.out.println();

        System.out.println("--- Searching  ---");
        int[] searchArr = {3, 8, 12, 20, 25, 30};

        System.out.println("Binary search iterative for 20 -> Index: " +
                Q3_Searching.binarySearchIterative(searchArr, 20));
        System.out.println("Binary search recursive for 25 -> Index: " +
                Q3_Searching.binarySearchRecursive(searchArr, 25, 0, searchArr.length - 1));
        System.out.println("Linear recursive search for 12 -> Index: " +
                Q3_Searching.linearSearchRecursive(searchArr, 12, 0));

        System.out.println("Minimum (recursive): " + Q3_Searching.findMinRecursive(searchArr, 0));
        System.out.println("Maximum (recursive): " + Q3_Searching.findMaxRecursive(searchArr, 0));
        System.out.println();

        System.out.println("--- Recursion  ---");
        System.out.println("Factorial of 5: " + Q4_RecursionProblems.factorial(5));
        System.out.println("Fibonacci of 6: " + Q4_RecursionProblems.fibonacci(6));

        int[] arrToSum = {2, 4, 6, 8};
        System.out.println("Sum of array {2,4,6,8}: " + Q4_RecursionProblems.sumArray(arrToSum, 0));

        int[] sortedArr = {3, 5, 7, 9};
        System.out.println("Check if {3,5,7,9} sorted? " + Q4_RecursionProblems.isSorted(sortedArr, 0));

        System.out.println("Min in array: " + Q4_RecursionProblems.minArray(arrToSum, 0));
        System.out.println("Max in array: " + Q4_RecursionProblems.maxArray(arrToSum, 0));
        System.out.println();

        System.out.println("--- Sorting  ---");
        int[] sortData = {5, 1, 4, 2, 8};

        int[] mergeData = Q5_Sorting.copyArray(sortData);
        Q5_Sorting.mergeSort(mergeData);
        System.out.print("MergeSort result: ");
        Q5_Sorting.printArray(mergeData);

        int[] quickData = Q5_Sorting.copyArray(sortData);
        Q5_Sorting.quickSort(quickData, 0, quickData.length - 1);
        System.out.print("QuickSort result: ");
        Q5_Sorting.printArray(quickData);
        System.out.println();

        // BST Demo
        System.out.println("--- Binary Search Tree ---");
        Q6_BST bstTree = new Q6_BST();
        int[] bstItems = {50, 30, 70, 20, 40, 60, 80};
        for (int v : bstItems) bstTree.insert(v);

        System.out.print("Inorder traversal: ");
        bstTree.inorder();
        System.out.print("Preorder traversal: ");
        bstTree.preorder();
        System.out.print("Postorder traversal: ");
        bstTree.postorder();

        System.out.println("Search 60: " + bstTree.search(60));
        System.out.println("Delete 80: " + bstTree.delete(80));
        System.out.print("Inorder after deletion: ");
        bstTree.inorder();

        System.out.println("BST Min: " + bstTree.findMin());
        System.out.println("BST Max: " + bstTree.findMax());/**/
        System.out.println("Total nodes: " + bstTree.countNodes());
        System.out.println("Leaf nodes: " + bstTree.countLeafNodes());
        System.out.println("Tree height: " + bstTree.height());
    }
}
