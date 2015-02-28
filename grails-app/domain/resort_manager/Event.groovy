package resort_manager

class Event {

    String name
    Date fromDate
    Date toDate
    String place
    String description
    Integer price

    static hasMany = [desisions: EventDecision]

    static constraints = {
    }
}
