fun main() {
    println(studentDetails("Jemima",19,"Kenyan"))
    println( interesting("eating"))
    verifyDetail()
    replaceVowels()
}
//1. Write a function that takes in 3 parameters, name, age, and country,
//and returns a String with this structure “Hi, my name is x, I am y years old
//and I am from z.” Where x, y, and z are the provided
//name, age, and country respectively.
fun studentDetails(name:String,age:Int,country:String):String{
    return "My name is $name,I am $age and I am from $country"
}
//Write a function that takes in a String and returns its length
fun interesting(name:String):Int{
    return name.length
}
//Write a function that takes in a name and prints out “That’s me!”
//when your name is passed to it, otherwise, it prints out “I don’t know who that is”
fun verifyDetail(){
    var name="Jemima"
    var name1="Jem"
    if (name==name1){
        println("That's me!")
    }
    else{
        println("I don't know who that is.")
    }

}
//Write a Kotlin function that takes in a
//string will all the vowels replaces by the
//character ‘*’. Use string interpolation to generate the output.
fun replaceVowels(){
    var name="Jemima"
    var age=19
    println(name.replace("Jemima","*"))
//    var details="My name is $name and I am $age"
//    if(name==vowels){
//        println(name.replace("Jemima"))
//    println(details.replace(""),("$age"))
    }


