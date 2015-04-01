package resort_manager

class AuthFilters {

    def sessionService

    def filters = {
        authorizeRequest(controller: 'client|clientEvents|clientRooms|clientServices|sample',
                controllerExclude: 'auth') {
            before = {
                def email = session.getAttribute('email')
                def secret = session.getAttribute('secret')
                if (sessionService.check(email, secret)) {
                    return true
                } else {
                    redirect(controller: 'auth', action: 'index')
                    return false
                }
            }
        }
    }
}
