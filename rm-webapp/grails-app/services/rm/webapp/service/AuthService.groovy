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

    private def generateUserPassword(length) {
        def result = ''
        def range = 'a'..'z'
        def random = new Random()
        for (int i = 0; i < length; i++) {
            String symbol = range.get(random.nextInt(range.size()))
            symbol = random.nextBoolean() ? symbol.toUpperCase() : symbol
            result += symbol
        }
        result
    }

    private def generateSessionToken(email, password) {

    }



}
