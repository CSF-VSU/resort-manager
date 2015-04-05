package rm.webapp.domain

class StaffPosition {

    String title
    String description

    static hasMany = [staff: Staff]

    static constraints = {
    }
}
