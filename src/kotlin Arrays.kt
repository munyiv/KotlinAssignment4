import java.util.*

fun main() {
   county("Nairobi","Nakuru","Kitui","Machakos")

    cities()

    numbers()

    Info("Audrey","Lisalab","Kenya")


}

fun county(names:String ,Names: String,nAmes:String,NAmes:String){
    var countyArray= arrayOf(names,Names,nAmes,NAmes)
    println(Arrays.toString(countyArray))

}

fun cities() {
    val cities=arrayOf("harare","mumbai","dodoma","jakarata")
    println(cities[0].capitalize() +" "+ cities[1].capitalize() +" "+ cities[2].capitalize() + " "+cities[3].capitalize())

}
fun numbers() {
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    val total= numbers.component2() + numbers.component5()
    println(total)

    var index= numbers.indexOf(158)
    println(index)

    var Sorting=numbers.sortedArray()
    for (elements in Sorting){
        println(elements)
    }

}


fun Info(NAMES:String,Class:String,Origin:String) {
    var Info= arrayOf(NAMES,Class,Origin)
    println(Arrays.toString(Info))

}