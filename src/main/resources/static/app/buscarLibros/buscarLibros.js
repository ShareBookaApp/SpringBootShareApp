'use strict';

angular.module('myApp.buscarLibros', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/buscarLibros', {
    templateUrl: 'buscarLibros/buscarLibros.html',
    controller: 'buscarLibrosCtrl'
  });
}])

.controller('buscarLibrosCtrl', ['$scope','fabricaLibro',function($scope,fabricaLibro) {
    $scope.showConfirm = function(ev) {
       $scope.listado= fabricaLibro.getListado();
       for(var i =0;i<$scope.listado.length;i++){
       if(ev===$scope.listado[i].nombre){

                           document.getElementById('status').innerHTML = 'Id:'+$scope.listado[i].id+ "  Nombre: "+$scope.listado[i].nombre+ "  Editorial: "+$scope.listado[i].editorial+"  Autor: "+ $scope.listado[i].autor;
                    break;
                  }
                  else{

                   document.getElementById('status').innerHTML = "El libro no se encuentra disponible.";

                        }
       }
           // Appending dialog to document.body to cover sidenav in docs ap
           }




     //$scope.listado= fabricaMisLibro.getListado();

}]  );

/*
.controller('View2Ctrl', ['$scope','Items',function($scope,Items) {

$scope.nombre = '';
$scope.prioridad = 0;

$scope.addtodo = function(){
    //$scope.listado = {'nombre':$scope.nombre,'prioridad':$scope.prioridad};
 //console.log("Nombre"+$scope.listado.nombre+ "Prioridad"+ $scope.listado.prioridad);
 $scope.item = new Items();
 $scope.item.nombre = $scope.nombre;
  $scope.item.prioridad = $scope.prioridad;
  Items.save($scope.item);


}

}]);
*/
