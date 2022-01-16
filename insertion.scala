//Que 5  write a program to sort the array by innserion order

object insertion {
def main (args : Array[String]){
var a = Array(2,1,4,5,6,7,3,98,77)

for (i <- 0 until a.length){
var j = i-1
var x = a(i)
while(j > -1 && a(j) > x){

a(j+1) =a(j)
j -= 1

}
a(j+1) =x
}
println("the insertion sort")
for(i <- a){
println(i)
}
}
}

/*
Ouput

the insertion sort
1
2
3
4
5
6
7
77
98
*/
