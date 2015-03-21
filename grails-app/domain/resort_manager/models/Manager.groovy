package resort_manager.models

class Manager {

    String firstName
    String secondName
    String lastName
    String email
    String password

    static hasOne = [hotel: Hotel]
    static constraints = {

    }
}
