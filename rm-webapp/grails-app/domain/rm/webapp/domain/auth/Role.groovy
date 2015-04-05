package rm.webapp.domain.auth

class Role {

    String title
    String description

    static hasMany = [users: User]

    static constraints = {
    }
}
