package rm.webapp.domain.auth

class User {

    String email
    String password

    static hasOne = [role: Role]

    static constraints = {
        email blank: false, email: true
        password blank: false, size: 6..64
    }
}
