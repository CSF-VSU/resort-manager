package resort_manager.auth

class AuthController {

    def sessionService
    def recoveryService

    def index() {

    }

    def signin() {

    }

    def signup() {

    }
    
    def recovery() {
        if (request.method == 'GET') {
            return 'recovery'
        } else {
            // todo
        }
    }

    def signout() {

    }

}
