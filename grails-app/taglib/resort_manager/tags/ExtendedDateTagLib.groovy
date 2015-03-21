package resort_manager.tags

class ExtendedDateTagLib {
    static defaultEncodeAs = [taglib:'html']

    static namespace = "d"

    def extendedDateService

    def extendedDate = { attrs, body ->
        out << extendedDateService.getDateTimeString(attrs.date as Date)
    }

    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
}
