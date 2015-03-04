package resort_manager.client

import resort_manager.Client
import resort_manager.Event

class ClientEventsController {

    def index() {
        def user = Client.findByEmail(session['email'] as String)
        def usersEvents = user.events
        def events = Event.all
        render(view: 'index', model: [usersEvents: usersEvents, events: events])
    }

}
