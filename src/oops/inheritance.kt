package oops
open class Animal{
    fun eat(name:String){
        println(name +" is eating");
    }
}

class humans: Animal() {
    var name:String="";
    fun eatGrass(){
        eat(name);
    }

}
fun main(){
    var human1=humans();
    human1.name="rashid";
    human1.eat(human1.name);

}