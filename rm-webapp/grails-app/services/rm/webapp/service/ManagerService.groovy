package rm.webapp.service

import grails.transaction.Transactional
import rm.webapp.domain.Client

@Transactional
class ManagerService {

    def listClient(count = 10, offset = 0) {
        Client.list(offset: offset, count: count)
    }

    def registerClient(Client client) {
        if (client.validate()) {
            client.save()
        } else {

        }
    }



}
