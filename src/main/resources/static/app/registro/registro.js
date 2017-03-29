'use strict';

angular.module('myApp.registro', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/register', {
    templateUrl: 'registro/registro.html',
    controller: 'registroCtrl'
  });
}])

.controller('registroCtrl', ['$rootScope', '$scope', '$http', '$location', function ($scope, $rootScope, $http, $location, RegistroFac) {
$scope.registrarUsuario = function(nombre, email, password){

var todo = {
    'nombre':nombre,
    'email' : email,
    'password' : password
    };
    }
     RegistroFac.save({email:email}, todo);


 }]);