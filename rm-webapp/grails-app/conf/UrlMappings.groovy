class UrlMappings {

    static mappings = {
        "/manager/"(controller: "manager")
        "manager/client/"
        "/manager/client/"(controller: 'managerClient')
        "/manager/service/"(controller: 'managerService')

        "/init"(controller: 'init', action: 'init')

        "/"(view: "/index")
        "500"(view: '/error')
    }
}
