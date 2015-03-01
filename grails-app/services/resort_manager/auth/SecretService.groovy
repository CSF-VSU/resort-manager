package resort_manager.auth

import grails.transaction.Transactional

@Transactional
class SecretService {

    def secret(email) {
        // todo make much strong algorithm
        def current = new Date()
        def value = "${email} -> ${current.format('yyyy:MM:dd hh/mm/ss')} : ${current.getTime()}"
        return value.encodeAsMD5()
    }

}
