class UserDate (var day: Int?, var month: Int?, var year: Int?) {


        init {
            day = verifyDay(day)
            month = verifyMonth(month)
            year = verifyYear(year)
            println("NEW DATE CREATED $day|$month|$year")
        }

        fun verifyDay(dateBlock: Int?) :Int? {
            if (day != 0 && day!! < 32){
                this.day = dateBlock
                return this.day
            } else{
                this.day = null
                return this.day
            }
        }
        fun verifyMonth(dateBlock: Int?) : Int? {
            if (month != 0 && month!! < 13){
                this.month = dateBlock
                return this.month
            } else{
                this.month = null
                return this.month
            }
        }
        fun verifyYear(dateBlock: Int?) :Int? {
            if (year != 0 && year!! < 2024){
                this.year = dateBlock
                return this.year
            }else{
                this.year = null
                return this.year
            }
        }
}
