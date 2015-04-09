package rm.webapp.controller.manager

class ManagerClientController {

    def managerService

    def list(count, offset) {
        def clients
        if (count != null && offset != null) {
            clients = managerService.listClient(count, offset)
        } else {
            clients = managerService.listClient()
        }
        render(view: 'manager/client/list', model: [clients: clients])
    }

    def register() {

    }

    def edit() {

    }

    def remove() {

    }

}
