/*
    1- Create a class called "Circle" that owns a attribute for storing the radius and methods for calculate the area and
    perimeter of the circle

    2 - Create a class called "Retangle" that owns a attribute for storing the radius and methods for calculate the area and
    perimeter of the circle

    3 - Create a class called "Triangle" with attributes to store the three sides of a triangle. Implement methods to
    verify if it is a valid triangle and calculate the area
     */


fun main(){
    val circle1 = Circle()

    circle1.radius = 70.0

    println("|Circle 1 area: ${circle1.area()} meters | Circle 1 perimeter: ${circle1.perimeter()} meters|")

    val retangle1 = Retangle(12.0,37.0)

    println("|Retangle 1 area: ${retangle1.area()} meters | Retangle 1 perimeter: ${retangle1.perimeter()} meters|")

    val triangle1 = Triangle(4.7,8.6)

    println("|Triangle 1 area: ${triangle1.area()} meters|")
}