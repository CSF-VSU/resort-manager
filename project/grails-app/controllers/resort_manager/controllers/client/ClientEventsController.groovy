package resort_manager.controllers.client

class ClientEventsController {

    def clientEventsService

    def index() {
        String email = session['email']
        def userEvents = clientEventsService.getUsersEvents(email)
        def allEvents = clientEventsService.getAllEvents()
        render(view: 'index', model: [userEvents: userEvents, allEvents: allEvents])
    }

    def addEvent(Integer eventId) {
        String email = session['email']
        clientEventsService.addEventToClient(email, eventId)
        forward(action: 'index')
    }

}
