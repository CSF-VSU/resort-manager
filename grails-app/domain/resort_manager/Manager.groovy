package resort_manager

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
