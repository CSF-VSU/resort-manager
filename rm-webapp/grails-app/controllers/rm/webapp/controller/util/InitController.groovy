package rm.webapp.controller.util

class InitController {

    def sampleDataService

    def init() {
        sampleDataService.initDb()
        render('ok')
    }

}
