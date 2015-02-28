package resort_manager

class RoomType {

    String title
    String description
    Integer price

    static hasMany = [rooms: Room]

    static constraints = {
    }
}
