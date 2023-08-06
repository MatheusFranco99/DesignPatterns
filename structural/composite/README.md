# Composite

Composite design pattern lets you compose objects into tree structures and then work with these structures as if they were individual objects.

It requires the model to be represented as a tree. Example a box that can contain several boxes and several products. To count the total price inside a box what do you do? You could unwrap all boxes and go over the products. It may be complicated nonetheless. Inspired by the idea of recursion, you can make Products and Boxes implement a common inteface that calculates its price simply by calling the same interface function for the boxes inside a box (and adding the values of products inside the current box).