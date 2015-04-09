package rm.webapp.domain

class Client {

    String firstName
    String lastName
    String middleName
    String phone
    String passport
    Date birthday
    String email
    String password

    static hasMany = [accommodations: Accommodation, orders: Order]

    static constraints = {
        firstName blank: false
        lastName blank: false
        phone blank: false
        passport blank: false
        email blank: false, email: true, unique: true
        password size: 6..64
    }
}