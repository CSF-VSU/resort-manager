package resort_manager

class Client {

    String firstName
    String secondName
    String lastName
    String email
    String password

    static hasMany = [events: EventDecision, accommodations: Accommodation]

    static constraints = {
    }
}
