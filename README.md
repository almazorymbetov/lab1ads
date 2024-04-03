Laboratory work 1
I decided to create 10 classes for each problem <br>
problem no.1: there is a loop that makes a comparison between the initial minimum element and the next elements <br>
problem no.2: I also used a loop to sum all elements and divide it by the length(number of elements) of array <br>
problem no.3: there is a loop until i squared is less than or equal to n, but when the remainder is equal to 0, then it returns false or composite <br>
problem no.4: I wrote a recursive method and considered situations when n=0 or n=1 (which means 0! or 1! = 0), and in other moments it returns n itself multiplicated to the function where we put n-1 till n=1 <br>
problem no.5: In the recursive function, it considered the moment when n=0 (then the Fibonacci number equals to 0) and used the formula F=F(n-1)+F(n-2) (called these functions again) <br>
problem no.6: This code with the recursive function "power" has three situations: 1. When n=0, every number in the power of 0 will be 1. 2. when n is negative, then it returns 1 / a in the power of a negative number, and 3. the number a will be multiplicated itself unless n is equal to 0 <br>
problem no.7: used a recursive function where the first and last elements of the array swapped, then called the recursive function "revers", where the first and last indexes moved to the center of the array, and finally it returned a reversed array<br>
problem no.8: I used Character.isDigit(string.charAt()) to determine if the first element is a digit, then called the recursive function again with the substring to check other elements. <br>
problem no.9: just used the formula C(n,k)=C(n-1,k-1) + C(n-1,k) <br>
problem no.10: Used Euclidian method from discrete mathematics, where we divide the first number by the second number and find the remainder, then again and again
