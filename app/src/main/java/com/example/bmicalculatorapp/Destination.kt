package com.example.bmicalculatorapp

interface Destination{
    val route:String
}
private object Home: Destination{
    override val route: String = "Home"
}
object BMI: Destination{
    override val route: String = "BMI"
}
object ResultScreen: Destination{
    override val route: String = "Result"
}