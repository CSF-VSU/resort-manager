class UrlMappings {

	static mappings = {
        "/auth/"(controller: 'auth', action: 'index')
        "/auth/signin"(controller: 'auth', action: 'signin')
        "/auth/signout"(controller: 'auth', action: 'signout')
        "/client/"(controller: 'client', action: 'index')
        "/client/events"(controller: 'clientEvents', action: 'index')
        "/client/events/add/$id"(controller: 'clientEvents', action: 'addEvent')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
