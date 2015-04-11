class UrlMappings {

    static mappings = {
        "/manager/"(controller: "manager")
        "/manager/client/"(controller: 'managerClient')
        "/manager/service/"(controller: 'managerService')
        "/manager/service/remove"(controller: 'managerService', action: 'remove')
        "/manager/service/update"(controller: 'managerService', action: 'update')
        "/manager/service/save"(controller: 'managerService', action: 'save')

        "/init"(controller: 'init', action: 'init')

        "/"(view: "/index")
        "500"(view: '/error')
    }
}
