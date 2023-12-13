fun main(){
    val geos = Geometrics()
    println("")
    println("Geometric figures context")
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

    println("")
    println("Loop context")
    val figureBox = arrayOf("Circle area: ${circle1.areaCalc()}m²","Ellipse area: ${ellipse1.areaCalc()}m²","Triangle area: ${triangle1.areaCalc()}m²","Square area: ${square1.areaCalc()}m²","Rectangle area: ${rectangle1.areaCalc()}m²")

    for(x in figureBox){
        println(x)
    }

}