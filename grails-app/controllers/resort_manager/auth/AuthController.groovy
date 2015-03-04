package resort_manager.auth

import resort_manager.Client

class AuthController {

    def sessionService
    def recoveryService

    def index() {
        render(view: 'index')
    }

    def signin() {
        def email = params['email']
        def password = params['password']
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

}
