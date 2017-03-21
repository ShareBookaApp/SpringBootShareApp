'use strict';

angular.module('myApp.librosDisponibles', ['ngRoute', 'ngMaterial'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/librosDisponibles', {
    templateUrl: 'librosDisponibles/librosDisponibles.html',
    controller: 'ControlLibrosDisponibles'
  });
}])

.controller('ControlLibrosDisponibles',  function ($scope, LibroFactory, $mdDialog) {




   $scope.listado= LibroFactory.query();

   $scope.showConfirm = function(ev) {
       // Appending dialog to document.body to cover sidenav in docs app
       var confirm = $mdDialog.confirm()
             .title('¿Quieres solicitar este libro?')
             .textContent('Nombre: '+ev.nombre +'\n  Editorial: '+ev.editorial + '\n   Autor: ' + ev.autor)
             .targetEvent(ev)
             .ok('Solicitar!')
             .cancel('Volver');

       $mdDialog.show(confirm).then(function() {
         $scope.status = 'Usted ha solicitado el libro: '+ev.nombre + ' de '+ ev.autor + '.';
       }, function() {
         $scope.status = '';
       });
     };
});