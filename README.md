# TwoDimBucketStarterCode
Use this starter code to complete Lab 1 for CS 245

The brute force method best represented my thoughts, visualizaton, and process I took trying to solve this problem.
After some additional research, I realize that it is not the most efficient method.

![image](https://github.com/Veomett/two-dimensional-water-bucket-sanjanarattan/assets/123421542/aa1fdb9e-b76c-4529-b556-936f66cdcaa3)


I visualized each value in the array as a coordinate (x1,y1) where each x and y is comparable to one another. \

The data structure I thought best followed this style was HashMap but I beleive that method is inefficient because you can't store keys and values as ints that can be compared later. (I could be wrong but this is my understanding as of now).

So then I used for loops to put each possible coordinate (x,y) into a comboAray [x,y]. This method worked, and I realized I did not need the array at all, I could just compare the x and y's dirrectly in the for loops as i, j and height[i] and height[j]. 

This was not specified in the rubric, so I decided negative values can not hold any water, so negatives are treated as 0. currMax is set to 0 in the start of the program so negative areas are discarded. 

Lastly I want to admit I have never done java-style documentation so I got a tad bit help from chatgpt but now I know!!
