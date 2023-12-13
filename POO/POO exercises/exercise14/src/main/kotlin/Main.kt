fun main(){
    val geos = Geometrics()


    //Circles
    geos.circles = Circle(45.0)
    val circle1 = geos.circles
    println("Circle area: ${geos.circles.areaCalc()}m²")

    geos.circles = Ellipse(6.0,7.0)
    val ellipse1 = geos.circles
    println("Ellipse area: ${geos.circles.areaCalc()}m²")

    //Triangles
    geos.triangles = Triangle(7.0, 12.0)
    val triangle1 = geos.triangles
    println("Triangle area: ${geos.triangles.areaCalc()}m²")

    //Quads

    geos.quads = Square(8.3)
    val square1 = geos.quads
    println("Square area: ${geos.quads.areaCalc()}m²")

    geos.quads = Rectangle(7.0,3.0)
    val rectangle1 = geos.quads
    println("Rectangle area: ${geos.quads.areaCalc()}m²")

    println("Loop context")
    val figureBox = arrayOf("Circle area: ${circle1.areaCalc()}","Ellipse area: ${ellipse1.areaCalc()}","Triangle area: ${triangle1.areaCalc()}","Square area: ${square1.areaCalc()}","Rectangle area: ${rectangle1.areaCalc()}")

    for(x in figureBox){
        println(x)
    }

}