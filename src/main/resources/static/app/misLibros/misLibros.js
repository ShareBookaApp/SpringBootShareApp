'use strict';

angular.module('myApp.misLibros', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/misLibros', {
    templateUrl: 'misLibros/misLibros.html',
    controller: 'misLibrosCtrl'
  });
}])

.controller('misLibrosCtrl', ['$scope','Items',function($scope,Items) {
     $scope.listado= Items.query();

}]  );