'use strict';
angular.module('services.fabricaLibro', ['ngRoute'])

    .factory('fabricaLibro', function () {
        var data = {
             listado: [
                            {"id":'1', "nombre":'El Alquimista', "editorial":'Norma', "autor":'Paulo Coelho', "latitude":4.782627, "longitude":-74.042634},
                            {"id":'2', "nombre":'English for Dummies', "editorial":'Norma', "autor":'English', "latitude":4.782603, "longitude":-74.044069},
                            {"id":'3', "nombre":'La Biblia', "editorial":'Norma', "autor":'Apostoles', "latitude":4.783699, "longitude":-74.044713}
                            ]
        };
        return {
            getListado: function () {
                return data.listado;
            },
            addTodo: function (todo) {
                data.listado.push(todo);
            }};
    })

    .factory('fabricaMisLibro', function () {
            var data = {
                 listado: [
                                {"id":'1', "nombre":'Cien Años De Soldedad', "editorial":'Norma', "autor":'Paulo Coelho', "latitude":4.782627, "longitude":-74.042634},
                                {"id":'2', "nombre":'fisica', "editorial":'Norma', "autor":'English', "latitude":4.782603, "longitude":-74.044069}

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