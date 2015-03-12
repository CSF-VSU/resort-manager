package resort_manager

class Event {

    String name
    Date fromDate
    Date toDate
    String place
    String description
    Integer price

    static hasMany = [decisions: EventDecision]

    static constraints = {
    }
}
