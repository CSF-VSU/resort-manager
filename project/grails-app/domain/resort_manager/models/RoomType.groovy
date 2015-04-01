package resort_manager.models

class RoomType {

    String title
    String description
    Integer price

    static hasMany = [rooms: Room]

    static constraints = {
    }
}
