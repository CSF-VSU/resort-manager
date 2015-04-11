//= require jquery/dist/jquery
//= require datatables/media/js/jquery.dataTables
//= require datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min
//= require holderjs/holder
//= require metisMenu/dist/metisMenu
//= require raphael/raphael
//= require morrisjs/morris.min
//= require mocha/mocha
//= require bootstrap/dist/js/bootstrap.min
//= require startbootstrap-sb-admin-2/dist/js/sb-admin-2
//= require_tree views
//= require_self

window.DataTableUtil = {

    showDefaultTable: function (element) {
        element.DataTable({
            'ordering': false,
            'info': false,
            'language': {
                'emptyTable': 'Список услуг пуст.',
                'zeroRecords': 'Ничего не найдено.',
                'lengthMenu': 'Показывать по:   _MENU_',
                'search': 'Поиск',
                'paginate': {
                    'first': 'Первая',
                    'last': 'Последняя',
                    'next': 'Следующая',
                    'previous': 'Предыдущая'
                }
            }
        });
    }

};

$(function () {

    $('.data-table').each(function (i) {
        DataTableUtil.showDefaultTable($(this));
    });

});