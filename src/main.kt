fun main(){
oddNumbers()
    serving(3)
    serving(12)
    serving(22)
    Numbers()
}

fun oddNumbers(){
    for (nums in 1..100){
        if ((nums%2)!=0)
            println(nums)
}
 }

fun names(name:Array<String>):Int{
var x = 0
    name.forEach { z->
if (z.length>5 ){

}
    }
    return x
}

fun serving(age:Int){
 if(age<6 ){

     println("milk")
 }
    else if (age>=6 && age<=15){
println("Fanta Orange")

 }

     else if (age>15){
         println("Cocacola")
     }
}

fun Numbers(){
    for (nums in 1..100){
        if (nums % 3==0){
            println("fizz")
        }
    else if (nums % 5 == 0) {
        println("Buzz")
    }
    if(nums %3==0 && nums%5==0){
        println("FizzBuzz")
    }
}
     }

