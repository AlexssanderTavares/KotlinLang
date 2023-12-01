class Car(var label: String?, var model: String?, var chassi: String?) {


    constructor() : this(label = null, model = null, chassi = null)

    inner class Engine(var label: String?, var isNew: Boolean?){


        constructor() : this(label = null, isNew = null)
    }

    inner class Tires(var label: String?, var isNew: Boolean?){

        constructor() : this(label = null, isNew = null)
    }
}