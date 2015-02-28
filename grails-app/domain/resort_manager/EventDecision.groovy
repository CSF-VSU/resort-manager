package resort_manager

class EventDecision {

    // todo

    static hasOne = [client: Client]
    static belongsTo = [event: Event]

    static constraints = {
    }
}
