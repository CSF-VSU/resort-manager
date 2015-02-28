package resort_manager

class Room {

    Integer number
    Integer capacity

    static belongsTo = [hotel: Hotel]

    static hasMany = [accommodations: Accommodation]
    static hasOne = [type: RoomType]

    static constraints = {
    }
}
