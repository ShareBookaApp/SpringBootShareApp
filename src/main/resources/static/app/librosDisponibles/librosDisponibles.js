'use strict';

angular.module('myApp.librosDisponibles', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/librosDisponibles', {
    templateUrl: 'librosDisponibles/librosDisponibles.html',
    controller: 'ControlLibrosDisponibles'
  });
}])

.controller('ControlLibrosDisponibles', ['$scope', 'fabricaLibro', function ($scope, fabricaLibro) {


   $scope.listado= fabricaLibro.getListado();
}]);