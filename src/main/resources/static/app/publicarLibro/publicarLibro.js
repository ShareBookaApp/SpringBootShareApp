'use strict';

angular.module('myApp.publicarLibro', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/publicarLibro', {
    templateUrl: 'publicarLibro/publicarLibro.html',
    controller: 'ControlPublicarLibro'
  });
}])

.controller('ControlPublicarLibro', ['$scope', 'AddLibroFactory', function ($scope, AddLibroFactory) {


    $scope.updateFactoryLibro = function(nombre, editorial, autor){

    var todo = {
        'nombre': nombre,
        'editorial': editorial,
        'autor': autor,
        'latitude': 4.783042,
        'longitude': -74.042682
    };
        AddLibroFactory.save({useremail:localStorage.getItem("usuario")},todo);
    }
}]);