# Graph Data Structure Implementation in Java

A comprehensive implementation of a **Directed Graph** using the **Adjacency Matrix** approach. This project focuses on vertex relationships, connectivity analysis, and fundamental traversal algorithms like BFS and DFS.

---

## 🚀 Standardized Features

Following our series' **Standardized Terminology**, this graph implementation provides:

* **`isEmpty()`**: Checks if the graph contains any edges.
* **`display()`**: Outputs the **Adjacency Matrix** for a clear visual representation of the graph's state (Standardized from `printGraph`).
* **Traversals**:
    * **Breadth-First Search (BFS)**: Explores neighbors layer by layer using a Queue.
    * **Depth-First Search (DFS)**: Recursive exploration of paths.

---

## 🔍 Advanced Graph Analysis

This implementation includes specialized methods to analyze the properties of each vertex:
* **Degree Analysis**: Functions to calculate **In-degree** and **Out-degree** for every vertex.
* **Vertex Classification**: Automatically identifies **Source** vertices (no incoming edges), **Sink** vertices (no outgoing edges), and **Sling** vertices (self-loops).
* **Connectivity Checks**: Methods like `DisplayConnectedGraph()` and `DisplayCompleteGraph()` to determine the overall structure of the network.

---

## 📊 Complexity Analysis

| Operation | Complexity |
| :--- | :--- |
| **Adding an Edge** | $O(1)$ |
| **Checking an Edge** | $O(1)$ |
| **Traversal (BFS/DFS)** | $O(V^2)$ (due to Adjacency Matrix) |
| **Space Complexity** | $O(V^2)$ |

---

## 📂 File Structure

To ensure the Graph functions correctly (especially for BFS and connectivity logic), include:
* **`Graph.java`**: The main class containing matrix logic and traversals.
* **`Queue.java`**: Essential for the **BFS** algorithm.
* **`SLL_Tail.java`** & **`SingleNode.java`**: Supporting structures for the Queue.

---

## 📄 License
This project is open-source and available under the [MIT License](LICENSE).
