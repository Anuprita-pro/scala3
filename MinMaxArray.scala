/* 
Name : Anuprita S Rajput
Roll No : 203341025
class : Msc(Computer Science)I

Que 1 ;Write a program to find maximum and minimum of an array*/

object MinMaxArray{
     def main(args:Array[String]){
	
	println("How many element in array");
	var n:Int = scala.io.StdIn.readInt();
	var num = new Array[Int](n)

	println("enter the element")
	for(i <- 0 to n-1)
	{
	num(i) = scala.io.StdIn.readInt()
	}

	println("Array element are :")
	for (i <- 0 to (num.length-1))
	{
	println(" " + num(i))
	}

	var min:Int = num(0)
	var max:Int = num(0)
	for(i <- 1 to n-1)
	{
		if(num(i) < min)
			min = num(i)
		else if(num(i) > max)
			max = num(i)
	}
	println("Minimum:" + min)
	println("Maximum:" + max)
} 
}



/*

Output:

How many element in array
5
enter the element
23
21
56
43
11


Array element are :
 23
 21
 56
 43
 11
Minimum:11
Maximum:56


*/
