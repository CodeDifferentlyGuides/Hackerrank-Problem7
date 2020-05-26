# Java Stdin and Stdout I

Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in); <br>
String myString = scanner.next(); <br>
int myInt = scanner.nextInt(); <br>
scanner.close(); <br>

System.out.println("myString is: " + myString); <br>
System.out.println("myInt is: " + myInt); <br><br>
The code above creates a Scanner object named scanner and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5 <br>
Our code will print: <br>

myString is: Hi <br>
myInt is: 5 <br><br>
Alternatively, you can use the BufferedReader class.

Task <br>
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42 <br>
100 <br>
125 <br><br>
Sample Output

42 <br>
100 <br>
125 <br>

Hackerrank Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
