'use strict';

angular.module('myApp.solicitudes', ['ngRoute', 'ngMaterial'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/solicitudes', {
    templateUrl: 'solicitudes/solicitudes.html',
    controller: 'ControlSolicitudes'
  });
}])

.controller('ControlSolicitudes',  function ($scope, ListSolicitudesFactory, $mdDialog) {



   $scope.listadoSoli= ListSolicitudesFactory.query({username:localStorage.getItem("usuario")});

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