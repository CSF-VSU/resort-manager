package rm.webapp.domain

class StaffPosition {

    String title
    String description
    Boolean isManager = false

    static hasMany = [staff: Staff]

    static constraints = {
        title blank: false
    }
}
