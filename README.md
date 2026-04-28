# assignment3_ads
# Student: Serikkazy Akarys
# Group: SE-2514

# 1) Algorithm Selection Requirement
Category A: Basic Sorting
• Insertion Sort

Category B: Advanced Sorting
• Quick Sort

Category C: Searching
• Binary Search

# 2) Core Class Implementations
<img width="811" height="816" alt="Снимок экрана 2026-04-28 235759" src="https://github.com/user-attachments/assets/63afb64d-cf6b-4714-9608-f69ea0c8e7be" />
<img width="856" height="959" alt="Снимок экрана 2026-04-29 004223" src="https://github.com/user-attachments/assets/e982cbfe-35e9-4668-ab8b-c8577366bff6" />
<img width="718" height="357" alt="Снимок экрана 2026-04-29 004246" src="https://github.com/user-attachments/assets/72cea2af-fa2c-4c54-bef7-cfe25335d1c3" />
<img width="692" height="469" alt="Снимок экрана 2026-04-29 004259" src="https://github.com/user-attachments/assets/5bb124b0-b600-4b42-afbc-0eb9f6955cde" />
<img width="857" height="912" alt="Снимок экрана 2026-04-29 004313" src="https://github.com/user-attachments/assets/79de19bc-d6ce-4a6d-8fc0-edc21a214055" />
<img width="856" height="432" alt="Снимок экрана 2026-04-29 004329" src="https://github.com/user-attachments/assets/88cbecd1-68f8-4c38-a628-983a8efd68e6" />
<img width="510" height="818" alt="Снимок экрана 2026-04-28 235821" src="https://github.com/user-attachments/assets/a9598e41-4748-4351-9632-e6b00e6669b7" />


# 3) Implementation Requirements (Part 1)
<img width="1028" height="940" alt="Снимок экрана 2026-04-29 001052" src="https://github.com/user-attachments/assets/84333e11-5a84-4224-802d-de13e2042824" />
<img width="1025" height="225" alt="Снимок экрана 2026-04-29 001106" src="https://github.com/user-attachments/assets/d10e0ea7-822e-4dea-8c3b-5109797b2f56" />
<img width="771" height="766" alt="Снимок экрана 2026-04-29 001017" src="https://github.com/user-attachments/assets/480a8f1c-0c34-4630-be83-30aa31696254" />
<img width="647" height="675" alt="Снимок экрана 2026-04-29 001030" src="https://github.com/user-attachments/assets/ae243d0c-7fd8-4781-9d92-7378a5eaa230" />


# 4) Data Processing Tasks (Part 2 – Performance Analysis)
## Which sorting algorithm performed faster? Why?
Quick Sort, Merge Sort, and Heap Sort are faster than Bubble Sort, Insertion Sort, and Selection Sort.
This is because their average time complexity is O(N log N), where as Bubble Sort has a complexity of O(n²).

## How does performance change with input size?
For O(n²) algorithms, the execution time grows quadratically: if the data size increases by 10 times, the time increases by approximately 100 times.
For O(N log N) algorithms, the execution time grows much more slowly, making them far more efficient for large datasets.

## How does sorted vs unsorted data affect performance?
Quick Sort's worst-case (O(N²)) comparison occurs when the chosen pivot is always the smallest or largest in the sequence.
Merge Sort consistently uses ≤ N lg N comparisons, regardless of the initial data order.

## Do the results match the expected Big-O complexity?
Yes, Bubble Sort - O(n²), Heap Sort - O(n LogN), Merge Sort - O(N log N), Quick Sort - on average O(N logN), in the worst case O(N²)

## Which searching algorithm is more efficient? Why?
Binary Search is more efficient than Linear Search.
Because, Binary Search has a time complexity of O(log N), while Linear Search has a complexity of O(N). Also, Binary Search gives better performance because it uses the "bisection search method," starting with the middle element and eliminating half of the remaining data at each step. 

## Why does Binary Search require a sorted array?
The algorithm uses the bisection method. It compares the target number with the middle element.
Search direction: Only in a sorted array can one know exactly which half a number is located: left or right.
Without sorting, the logic breaks and results become incorrect.

# 5) Report Requirements (README.md in GitHub Repository)
In this project, I learned how algorithm efficiency depends on input size and complexity. Quick Sort performed much better than Insertion Sort on large datasets.
Theoretical complexity (Big-O) matches practical results, but real execution time can vary due to system performance and input data.
The main challenge was implementing Quick Sort and correctly measuring execution time using System.nanoTime().
