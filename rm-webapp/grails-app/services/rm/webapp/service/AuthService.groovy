package rm.webapp.service

import grails.transaction.Transactional

@Transactional
class AuthService {

    def signin(email, password) {
        return {
            status: false
            message: 'Прилетело НЛО'
        }
    }

    def signout(email, password) {

    }

    def register() {

    }

}
