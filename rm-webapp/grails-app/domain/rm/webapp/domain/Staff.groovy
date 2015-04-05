package rm.webapp.domain

import rm.webapp.domain.auth.User

class Staff {

    String fullName
    String phone
    User user

    static hasOne = [position: StaffPosition]
    static hasMany = [hotels: Hotel]
    static belongsTo = Hotel
    static embedded = ['user']

    static constraints = {
    }
}
