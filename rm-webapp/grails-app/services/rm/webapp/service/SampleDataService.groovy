package rm.webapp.service

import grails.transaction.Transactional
import rm.webapp.domain.Event
import rm.webapp.domain.Hotel
import rm.webapp.domain.Service
import rm.webapp.domain.StaffPosition

@Transactional
class SampleDataService {

    def initDb() {
        initHotels()
        // initEvents()
        // initStaff()
        initServices()
    }

    private def initHotels() {
        def hotels = Hotel.list()
        Hotel.deleteAll(hotels)
        new Hotel(title: 'Бангладеж', city: 'Воронеж', address: 'пр. Революции, 21', phone: '+7 (47332) 2-233-235').save()
        new Hotel(title: 'ВАИ', city: 'Воронеж', address: 'ул. Лизюкова, 14', phone: '+7 (47332) 2-125-124').save()
        new Hotel(title: 'Benefit Plaza', city: 'Воронеж', address: 'ул. Плехановская, 42', phone: '+7 (47332) 2-879-124').save()
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

    private def initServices() {
        new Service(title: 'Доставка пиццы', description: 'Пицца на любой вкус в ваш номер.',
                phone: '+7 (47332) 2-879-124').save()
        new Service(title: 'Японская кухня', description: 'Просто японская кухня.',
                phone: '+7 (47332) 2-879-124').save()
        new Service(title: 'Прачечная', description: 'Просто прачечная.',
                phone: '+7 (47332) 2-879-124').save()
    }

    private def initOrders() {
        // todo
    }

    private def initClients() {
        // todo
    }

}
