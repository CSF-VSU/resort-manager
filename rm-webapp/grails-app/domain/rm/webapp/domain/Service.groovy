package rm.webapp.domain

class Service {

    String title
    String description
    String phone

    static belongsTo = [hotel: Hotel]

    static constraints = {
    }
}
