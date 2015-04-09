class UrlMappings {

	static mappings = {
        /*"/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/

        "/manager/client/"(controller: 'managerClient', action: 'list')
        "/sample/"(controller: 'sample', action: 'sample')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
