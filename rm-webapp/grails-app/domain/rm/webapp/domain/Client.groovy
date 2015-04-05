package rm.webapp.domain

import rm.webapp.domain.auth.User

class Client {

    String firstName
    String lastName
    String middleName
    String phone
    User user

    static hasMany = [accommodations: Accommodation]
    static embedded = ['user']

    static constraints = {
    }
}
