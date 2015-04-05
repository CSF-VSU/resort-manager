package rm.webapp.domain

class Hotel {

    String title
    String address
    String phone

    static hasMany = [rooms: Room, services: Service, staff: Staff]

    static constraints = {
    }
}
