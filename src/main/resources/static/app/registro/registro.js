'use strict';

angular.module('myApp.registro', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/register', {
    templateUrl: 'registro/registro.html',
    controller: 'registroCtrl'
  });
}])

.controller('registroCtrl', ['$rootScope', '$scope', '$http', '$location', function ($scope, $rootScope, $http, $location) {}]);