'use strict';
angular.module('services.fabricaLibro', ['ngRoute','ngResource', 'ngStorage'])

    .factory('LibrosDispoFactory', function($http) {
            return $http.get('/api/libros/disponibles/:username');
            })
    .factory('AddLibroFactory', function($resource) {
                            return $resource('/api/libros/:useremail');
        })

    .factory('fabricaBuscarLibro', function($resource) {
                 return $resource('/api/libros/buscar/:bookname');
                 })

    .factory('AddLibroPictureFactory', function($resource) {
                                return $resource('/api/libros/:idlibro/picture');
            })
    .factory('LibroById', function($resource) {
                                    return $resource('/api/libros/:idlibro');
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

    .factory('fabricaMisLibro', function ($resource) {
        console.log("Entro fabricamislibros")
        return $resource('/mislibros/:username');


        });