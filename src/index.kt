fun main() {
introduction("sarah",20)
  machine(12)
  machine(5)
  machine(6)
  machine(24)
  println(person(arrayOf("jane","mary","juliet","victorine","ruth","Ian")))
  println(operation(25,3))

}
fun introduction(name:String,age:Int){
  println("my name is $name and I am $age years old ")
}
fun machine(peopleAge:Int){
  for (age in peopleAge){
    if(age <6){
      println("serve the students with a glass of milk")
    }
    else if (age >6<14){
      println("serve the students with a bottle of fanta")
    }
    else{
      println("serve the students with a bottle of cocacola")
    }

  }
}
fun person(names:Array<String>):Array<String>{
  var person=()
  for (name in names){
    if (name.length%4==0){
      person+name

    }
  }
  return person
}
fun operation(a:Int,b:Int){
  var multiply=a*b
  var division=a/b
  var modulus=a%b
}
open class Human(var name:String, var age:Int,var weight:Double)
  fun eat(foodWeight:Int){
    println("I am eating $foodWeight kgs of food")
  }
fun speak(speech:String){

}
fun birthday(){


}
