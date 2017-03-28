'use strict';
angular.module('services.fabricaLibro', ['ngRoute','ngResource'])

    .factory('LibrosDispoFactory', function($resource) {
            return $resource('/libros/disponibles/:username');
            })
    .factory('AddLibroFactory', function($resource) {
                            return $resource('/libros/:useremail');
        })
    .factory('AddLibroPictureFactory', function($resource) {
                                return $resource('/libros/:idlibro/picture');
            })
    .factory('LibroById', function($resource) {
                                    return $resource('/libros/:idlibro');
     })
     // De aqui para abajo no deberia existir mas, se quedan como las fabricas de arriba
    .factory('fabricaLibro', function () {
        var data = {
             listado: [       ]
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