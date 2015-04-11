package rm.webapp.controller.manager

class ManagerClientController {

    def managerService

    def index() {
        list()
    }

    def list() {
        def count = params['count']
        def offset = params['offset']
        def clients = managerService.listClient(count, offset)
        render(view: '/manager/client/list', model: [clients: clients])
    }

    def register() {

    }

    def edit() {

    }

    def remove() {

    }

}
