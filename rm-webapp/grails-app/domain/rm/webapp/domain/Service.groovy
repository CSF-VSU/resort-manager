package rm.webapp.domain

class Service {

    String title
    String description
    String phone

    static belongsTo = [hotel: Hotel]
    static hasMany = [orders: Order]

    static constraints = {
        hotel nullable: true
    }
}
