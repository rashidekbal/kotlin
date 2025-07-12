package oops

class cars(var company:String, var engine :String , var tank :Int ,var mfg:String);
fun main(){
    val honda_civic=cars("honda","v2",mfg = "24.12.2025", tank = 25);
    val bmw=cars("bmMotors","v8",25,"24th aug 2025");
    println("bmw"+ "build by "+ bmw.company+ " engine "+ bmw.engine+" tank "+ bmw.tank)
}