'use strict';
angular.module('services.fabricaLibro', ['ngRoute'])

    .factory('fabricaLibro', function () {
        var data = {
            listado: [
            {"id":'1', "nombre":'El Alquimista', "editorial":'Norma', "autor":'Paulo Coelho'}
            ]
        };
        return {
            getListado: function () {
                return data.listado;
            },
            addTodo: function (todo) {
                data.listado.push(todo);
            }};
    });