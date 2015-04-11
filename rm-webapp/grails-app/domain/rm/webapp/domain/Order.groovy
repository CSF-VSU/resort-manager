package rm.webapp.domain

class Order {

    Date date
    String comment

    static belongsTo = [client: Client, service: Service]

    static constraints = {

    }

    static mapping = {
        table 'service_order'
    }
}