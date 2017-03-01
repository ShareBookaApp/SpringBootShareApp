'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'ngMaterial',
  'uiGmapgoogle-maps',
  'appMaps',
  'ngAnimate',
  'ui.bootstrap',
  'myApp.login',
  'myApp.registro',
  'myApp.publicarLibro',
  'myApp.librosDisponibles',
  'myApp.intercambiar',
  'services.fabricaLibro'
]).
config(['$locationProvider', '$routeProvider', '$httpProvider', function($locationProvider, $routeProvider, $httpProvider) {
    $locationProvider.hashPrefix('!');
    $routeProvider.otherwise({redirectTo: '/login'});$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest'}]);
