package rm.webapp.controller.auth

class AuthController {

    def authService

    def index() {
        if (request.method == 'GET') {
            render(view: 'signin')
        } else if (request.method == 'POST') {
            def auth = authService.signin(params['email'], params['password'])
            if (!auth.status) {
                render(view: 'signin', model: [error: auth.message])
            } else {
                redirect(controller: 'client')
            }
        }
    }

    def recovery() {

    }

}
