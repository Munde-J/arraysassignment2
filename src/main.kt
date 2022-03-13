fun main(){
var x =product(arrayOf(9,8,6,5,4,3))
    println(x)

    //NUMBER2
    var a = sumOfDecimals(arrayOf(3.2,4,6,"cars",5,"school",8.2,2.4))
    println(a)

    //number3
    var y = letters(arrayOf( 'a','e','e','o','u'))
    println(y)

}
fun product(numbers:Array<Int>):Int {
var multipl=1
    numbers.forEach { num->
multipl *= num
    }
    return multipl
}
fun sumOfDecimals(mixed: Array<Any>):Float{
    var sum =0.0F
     mixed.forEach{  el ->
         if (el is Float || el is Double){
            sum+=el.toString().toFloat()
             }
         }
          return sum
    }
//write a function of characters  and returns the number of vowels in the array
fun letters(char:Array<Any>):Int{
    var vowels = 0
    char.forEach { sylables ->
        if (sylables == 'a' || sylables == 'e' || sylables == 'i' || sylables == 'o' || sylables == 'u'){
            vowels++
    }
    }
     return vowels
}




