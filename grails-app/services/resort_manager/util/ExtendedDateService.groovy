package resort_manager.util

import grails.transaction.Transactional
import static java.util.Calendar.*

@Transactional
class ExtendedDateService {

    def getDateTimeString(Date date) {
        return "${getDateString(date)} ${at()} ${getTimeString(date)}"
    }

    private def getDateString(Date date) {
        def current = new Date()
        def day = date.getAt(DAY_OF_MONTH)
        if (current.getAt(DAY_OF_MONTH) == day) {
            return today()
        } else if (current.next().getAt(DAY_OF_MONTH) == day) {
            return tomorrow()
        } else {
            def month = month(date.getAt(MONTH))
            return "${day} ${month}"
        }
    }

    private def getTimeString(Date date) {
        return date.format('HH:mm')
    }

    private def at() {
        return 'в'
    }

    private def today() {
        return 'сегодня'
    }

    private def tomorrow() {
        return 'завтра'
    }

    private def month(Integer i) {
        def months = [
                'января',
                'февраля',
                'марта',
                'апреля',
                'мая',
                'июня',
                'июля',
                'августа',
                'сентября',
                'октября',
                'ноября',
                'декабря'
        ]
        return months[i - 1]
    }

}
