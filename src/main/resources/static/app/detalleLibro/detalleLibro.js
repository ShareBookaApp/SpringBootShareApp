'use strict';

angular.module('myApp.detalleLibro', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/detalleLibro', {
    templateUrl: 'detalleLibro/detalleLibro.html',
    controller: 'ControlLibroDetalle'
  });
}])

.controller('ControlLibroDetalle', ['$scope', 'factoryLibro', function ($scope, factoryLibro) {


   $scope.libroActual= factoryLibro.getLibro();
}]);