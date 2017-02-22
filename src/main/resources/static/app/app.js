'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'myApp.detalleLibro',
  'myApp.publicarLibro',
  'services.fabricaLibro'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');
  //$routeProvider.otherwise({redirectTo: '/index'});
}]);
