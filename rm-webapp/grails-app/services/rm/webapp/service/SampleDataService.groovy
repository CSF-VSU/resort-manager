package rm.webapp.service

import grails.transaction.Transactional
import rm.webapp.domain.Event
import rm.webapp.domain.Hotel
import rm.webapp.domain.StaffPosition

@Transactional
class SampleDataService {

    def initDb() {
        initHotels()
    }

    private def initHotels() {
        new Hotel(title: 'Бангладеж', city: 'Воронеж', address: '', phone: '+7 (47332) 2-233-235').save()
        new Hotel(title: 'ВАИ', city: 'Воронеж', address: '', phone: '+7 (47332) 2-125-124').save()
        new Hotel(title: '', city: 'Воронеж', address: '', phone: '+7 (47332) 2-879-124').save()
    }

    private def initEvents() {
        def calendar = new GregorianCalendar(2015, 3, 1, 10, 0)
        new Event(title: '', description: '', place: '', price: 100.0, fromDate: calendar.getTime(),
                toDate: calendar.getTime()).save()
        new Event(title: '', description: '', place: '', price: 100.0, fromDate: calendar.getTime(),
                toDate: calendar.getTime()).save()
    }

    private def initStaff() {
        new StaffPosition(title: 'Менеджер отеля', description: '', isManager: true).save()
        new StaffPosition(title: '', description: '').save()
    }



}
