'use strict';

angular.module('myApp.buscarLibros', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/buscarLibros', {
    templateUrl: 'buscarLibros/buscarLibros.html',
    controller: 'buscarLibrosCtrl'
  });
}])

.controller('buscarLibrosCtrl', ['$scope','fabricaBuscarLibro','LibrosDispoFactory',function($scope,fabricaBuscarLibro,LibrosDispoFactory) {
$scope.listadoBuscar= LibrosDispoFactory.query({username:localStorage.getItem("usuario")});
    $scope.buscador = function(ev) {
    $scope.listadoBuscar =[];
    $scope.listadoBuscar= fabricaBuscarLibro.query({bookname:ev});

    console.log("Entro a buscar " +ev+$scope.listadoBuscar.length);
    //$scope.listado= fabricaBuscarLibro.query();

        if($scope.listadoBuscar.length===0){
          document.getElementById('status').innerHTML = 'No encontro resultados';
          //$location.path("/buscarLibros");

        }
        else{
            document.getElementById('status').innerHTML = 'Si encontro resultados';
            $location.path("/buscarLibros");
        }


           }


}]);

/*
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


}

}]);
*/
