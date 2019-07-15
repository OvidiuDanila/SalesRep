# SalesRep
Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order. 

Functions Homework

Requirements:

Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order. The sorting should be done based on the amount of revenue generated via sales. Each rep has a number of sales, and a quota / sale.

After the sorting, the first object should be the rep with the most revenue generated. The last object in the array should be the rep with the least revenue generated.

E.g 

Sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales.

Sales guy 2 has 7 sales with a quota of 800$. He has achieved 5600$ worth of sales.


Sorting code example:

SalesRepresentative [ ] reps = ...

SalesRepresentative [ ] sortedReps = sort(reps); 

// you need to implement the sort(SalesRepresentative [ ] reps) method. This can not be a static method.
