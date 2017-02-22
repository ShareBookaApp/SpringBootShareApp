'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'ngMaterial',
  'myApp.detalleLibro',
  'myApp.publicarLibro',
  'myApp.librosDisponibles',
  'services.fabricaLibro'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

    $routeProvider.otherwise({redirectTo: '/publicarLibro'});
}]);
