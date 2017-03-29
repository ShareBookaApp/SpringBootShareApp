'use strict';
angular.module('services.fabricaLibro', ['ngRoute','ngResource'])

    .factory('LibrosDispoFactory', function($resource) {
            return $resource('/libros/disponibles/:username');
            })
    .factory('AddLibroFactory', function($resource) {
                            return $resource('/libros/:useremail');
        })

    .factory('fabricaBuscarLibro', function($resource) {
                 return $resource('/libros/buscar/:bookname');
                 })

    .factory('AddLibroPictureFactory', function($resource) {
                                return $resource('/libros/:idlibro/picture');
            })
    .factory('LibroById', function($resource) {
                                    return $resource('/libros/:idlibro');
     })

     .factory('ListSolicitudesFactory', function($resource) {
                                         return $resource('/solicitudes/:useremail/usuario');
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