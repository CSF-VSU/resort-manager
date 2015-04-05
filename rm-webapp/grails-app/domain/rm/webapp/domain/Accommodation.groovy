package rm.webapp.domain

class Accommodation {

    Date fromDate
    Date toDate

    static hasOne = [client: Client, room: Room]

    static constraints = {
        fromDate validator: dateOrderValidator
        toDate validator: dateOrderValidator
    }

    private static def dateOrderValidator = {Date value, Accommodation object ->
        object.toDate.getTime() > object.fromDate.getTime()
    }

}
