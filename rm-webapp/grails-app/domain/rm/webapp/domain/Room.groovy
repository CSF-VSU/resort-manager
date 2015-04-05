package rm.webapp.domain

class Room {

    Integer number
    Integer capacity

    static hasMany = [accommodations: Accommodation]
    static belongsTo = [hotel: Hotel]
    static hasOne = [type: RoomType]

    static constraints = {
        number min: 0
        capacity min: 0, max: 20
    }
}
