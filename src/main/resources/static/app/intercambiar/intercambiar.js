'use strict';

angular.module('myApp.intercambiar', ['ngRoute', 'ngMaterial'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/intercambiar', {
    templateUrl: 'intercambiar/intercambiar.html',
    controller: 'Ctrlintercambiar'
  });
}])
.controller('Ctrlintercambiar',  function ($scope, LibrosDispoFactory, $mdDialog) {




   $scope.listado= LibrosDispoFactory.query({username:'admin@sharebook.com'});

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