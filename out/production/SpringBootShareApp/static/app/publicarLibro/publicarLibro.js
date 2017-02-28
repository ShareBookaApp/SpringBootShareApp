'use strict';

angular.module('myApp.publicarLibro', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/publicarLibro', {
    templateUrl: 'publicarLibro/publicarLibro.html',
    controller: 'ControlPublicarLibro'
  });
}])

.controller('ControlPublicarLibro', ['$scope', 'fabricaLibro', function ($scope, fabricaLibro) {


    $scope.updateFactoryLibro = function(id, nombre, editorial, autor){

    var todo = {
        'id': id,
        'nombre': nombre,
        'editorial': editorial,
        'autor': autor
    };
        fabricaLibro.addTodo(todo);
    }
}]);