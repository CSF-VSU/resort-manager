package resort_manager.controllers.auth

import resort_manager.models.Client

class AuthController {

    def sessionService
    def recoveryService

    def index() {
        render(view: 'index')
    }

    def signin() {
        String email = params['email']
        String password = params['password']
        def user = Client.findByEmailAndPassword(email, password)
        if (user != null) {
            def secret = sessionService.register(user.email)
            session['email'] = user.email
            session['secret'] = secret
            redirect(controller: 'client')
        } else {
            render(view: 'index', model: [error: 'Неверные учетные данные.'])
        }
    }

    def signout() {
        def email = session['email']
        def secret = session['secret']
        if (sessionService.check(email, secret)) {
            session.invalidate()
        }
        redirect(action: 'index')
    }

    def forgot() {
        if (request.method == 'GET') {
            render(view: 'forgot', model: [isRecoverySended: true])
        } else if (request.method == 'POST') {
            // todo
            render(view: 'forgot', model: [isRecoverySended: false])
        }
    }

    def recovery() {
        String secret = params['secret']
        render(view: 'recovery', model: [isRecovered: recoveryService.check(secret)])
    }

}
