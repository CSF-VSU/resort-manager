package rm.webapp.domain

class RoomType {

    String title
    String description

    static hasMany = [rooms: Room]

    static constraints = {
    }
}
