'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])
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
