package resort_manager

class Administrator {

    String firstName
    String secondName
    String lastName
    String email
    String password

    static belongsTo = [hotel: Hotel]

    static constraints = {
    }
}
