class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/sample/"(controller: 'sample', action: 'sample')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
