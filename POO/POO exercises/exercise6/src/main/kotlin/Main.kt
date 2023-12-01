fun main(){
    val prof1 = Professor("Antonio", "Math")
    val std1 = Student("Alexssander", 1232123)


    val note1:Int = std1.setNote1(prof1.giveNote1())
    val note2:Int = std1.setNote2(prof1.giveNote2())
    val note3:Int = std1.setNote3(prof1.giveNote3())
    val note4:Int = std1.setNote4(prof1.giveNote4())

    println("| Professor: ${prof1.name} | Discipline: ${prof1.discipline} |")
    println("| Student name: ${std1.name} | Note 1: ${std1.n1} | Note 2: ${std1.n2} | Note 3: ${std1.n3} | Note 4: ${std1.n4} | Media: ${std1.media(note1,note2,note3,note4)} |")
}