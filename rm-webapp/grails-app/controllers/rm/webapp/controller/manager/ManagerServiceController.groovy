package rm.webapp.controller.manager

class ManagerServiceController {

    def managerService

    def index() {
        list()
    }

    def list() {
        def services = managerService.listService(count, offset)
        render(view: '/manager/service/list', model: [services: services]);
    }

    def add() {
        render(view: '/manager/service/edit', model: [service: null])
    }

    def remove(id) {
        if (!managerService.deleteService(id)) {
            flash.message = 'При удалении услуги произошла ошибка.'
        }
        list()
    }

    def update(id) {
        def service = managerService.getServiceById(id)
        render(view: '/manager/service/edit', model: [service: service])
    }

    def save() {
        def service = params['service']
        def errors = managerService.saveService(service)
        if (errors == null) {
            flash.message = 'Услуга успешно сохранена.'
            list()
        } else {
            render(view: '/manager/service/edit', model: [service: service])
        }
    }

}
