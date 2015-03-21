package resort_manager.models

class Accommodation {

    Date fromDate
    Date toDate

    static hasOne = [client: Client, room: Room]

    static constraints = {
    }
}
