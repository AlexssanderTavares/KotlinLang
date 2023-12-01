class Lampada(var setStatus: Boolean?, var watts: Int?) {


    constructor(setStatus: Boolean?) : this(setStatus,60)
    constructor(watts: Int?) : this(false, watts)
    constructor() : this(false, 60)

    fun power(status: Boolean) :Boolean?{
        return if(status){
            this.setStatus = status
            this.setStatus
        } else {
            this.setStatus = status
            this.setStatus
        }
    }
}