package rm.webapp.service

import grails.transaction.Transactional
import org.apache.commons.lang.ObjectUtils
import rm.webapp.domain.Client
import rm.webapp.domain.Service

@Transactional
class ManagerService {

    def listClient(count, offset) {
        Client.list(offset: ObjectUtils.defaultIfNull(offset, 0),
                count: ObjectUtils.defaultIfNull(count, count))
    }

    def getServiceById(id) {
        return Service.get(id)
    }

    def saveService(service) {
        if (service.validate()) {
            service.save()
            return []
        } else {
            return service.errors
        }
    }

    def deleteService(id) {
        def service = Service.get(id)
        if (service != null) {
            service.delete()
            return true
        } else {
            return false
        }
    }

    def listService() {
        Service.list()
    }
}
