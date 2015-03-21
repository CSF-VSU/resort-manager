package resort_manager.models

class EventDecision {

    // todo

    static hasOne = [client: Client]
    static belongsTo = [event: Event]

    static constraints = {
    }
}
