fun main() {
    hanoi(3,"A", "B", "C")
}

fun hanoi(numOfPieces: Int, towerA: String, towerB: String, towerC: String) {
    if(numOfPieces > 0) {
        hanoi(numOfPieces - 1, towerA, towerC, towerB )
        println("Num of Pieces in $towerA: $numOfPieces | Moving: $towerA -> $towerB")
        hanoi(numOfPieces - 1, towerC, towerB, towerA)
    }

}