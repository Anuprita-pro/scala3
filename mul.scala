//Que 6 : Write a program to multiplication of matrix


object mul
{ 
    val A = Array.ofDim[Int](3,3)    
    val B = Array.ofDim[Int](3,3)
    val C = Array.ofDim[Int](3,3)
   
var i = 0
var j = 0
var k = 0  
    // Driver code 
    def main (args : Array[String]) { 
         A(0)(0) = 1
        A(0)(1) = 2
        A(0)(2) = 3
        A(1)(0) = 4
        A(1)(1) = 5
        A(1)(2) = 6
        A(2)(0) = 7
        A(2)(1) = 8
        A(2)(2) = 9
	
	B(0)(0) = 9
        B(0)(1) = 8
        B(0)(2) = 7
        B(1)(0) = 6
        B(1)(1) = 5
        B(1)(2) = 4
        B(2)(0) = 3
        B(2)(1) = 2
        B(2)(2) = 1



println ("1st matrix is :")
	for (i <- 0 to 2){
            for (j <- 0 to 2){
		println(""+ A(i)(j))
                }
	println();

	}
println("2nd matrix is :")
 	for (i <- 0 to 2){
            for (j <- 0 to 2){
                println(""+ B(i)(j))
                }
        println();

        }
for( i <- 0 to 2){    
for( j <- 0 to 2){    
C(i)(j)=0;      
for( k <- 0 to 2)      
{      
C(i)(j) += A(i)(k)*B(k)(j);      
}//end of k loop  

print(C(i)(j) + " ");  //printing matrix element  
}//end of j loop  
println();//new line    

}    


}
}


/*

Output:

1st matrix is :
1
2
3

4
5
6

7
8
9

2nd matrix is :
9
8
7

6
5
4

3
2
1

30 24 18 
84 69 54 
138 114 90 

*/

