fun main(){
var motors= Car("Ford","SUV", "White",5)
    motors.capacity(8)
    motors.identity()
   println(motors.calculateParkingFees(2))
    var bus = Bus("Toyota", "Auris","Black",5)
    println(bus.maxTripFare(200.0))
    println(bus.calculateParkingFees(3))

}
class Car(make: String,model: String,color: String,capacity: Int): Vehicle(make,model,color,capacity){

}
class Bus(make: String, model: String,color: String,capacity: Int): Vehicle(make,model,color,capacity){

    fun maxTripFare(fare: Double): Double{
var maximumFareCollected = capacity * fare
        return maximumFareCollected
    }

    override fun calculateParkingFees(hours: Int): Int {
        //super.calculateParkingFees(hours)
        var productHoursAndCapacity = hours*capacity
        return productHoursAndCapacity

    }
}
open class Vehicle(var make: String, var model: String, var color: String, var capacity: Int){
    fun capacity(people: Int){
        var x = people-capacity
        if (people <= capacity) {
            println("Carrying $people passenger")
        }
        else{
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int{
        var parkingFees = hours*20
        return parkingFees
    }
}