package resort_manager.models

class Hotel {

    String title
    String address
    String phone

    static hasMany = [managers: Manager, rooms: Room]
    static hasOne = [administrator: Administrator]

    static constraints = {
    }
}