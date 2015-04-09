package rm.webapp.domain

class Staff {

    String fullName
    String phone

    static hasOne = [position: StaffPosition]
    static hasMany = [hotels: Hotel]
    static belongsTo = Hotel

    static constraints = {
        fullName blank: false
        phone blank: false
    }
}