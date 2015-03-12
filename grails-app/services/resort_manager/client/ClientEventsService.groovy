package resort_manager.client

import grails.transaction.Transactional
import resort_manager.Client
import resort_manager.Event
import resort_manager.EventDecision

@Transactional
class ClientEventsService {

    /**
     *
     * @param email
     * @param count
     * @param page
     * @return
     */
    def getUsersEvents(String email, count = 10, page = 1) {
        def client = Client.findByEmail(email)
        def decisions = client.events
        def decisionsKeys = decisions.collect { it.id }
        return Event.withCriteria([offset: count * (page - 1), max: count]) {
            inList('id', decisionsKeys as List)
        }
    }

    /**
     *
     * @param count
     * @param page
     * @return
     */
    def getAllEvents(count = 10, page = 1) {
        return Event.list(offset: count * (page - 1), max: count)
    }

    /**
     *
     * @param email
     * @param eventId
     * @return
     */
    def addEventToClient(String email, Integer eventId) {
        def client = Client.findByEmail(email)
        def event = Event.findById(eventId)
        def decision = new EventDecision(client: client, event: event)
        decision.save()
    }

    /**
     *
     * @param email
     * @param eventId
     * @return
     */
    def deleteEventFromClient(String email, Integer eventId) {
        def client = Client.findByEmail(email)
        def event = Event.findById(id)
        def decision = EventDecision.findByEventAndClient(event, client)
        if (decision) {
            decision.delete()
            return true
        }
        return false
    }

}
