'use strict';

angular.module('myApp.login', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/login', {
    templateUrl: 'login/login.html',
    controller: 'loginCtrl'
  });
}])

.controller('loginCtrl', ['$rootScope', '$scope', '$http', '$location', '$localStorage', function ($scope, $rootScope, $http, $location, $localStorage) {

    var authenticate = function (credentials, callback) {

        //var headers = credentials ? {username: credentials.username, password: credentials.password} : {};
            $http.post('/api/auth/login', {username: credentials.username, password: credentials.password}).then(function (data) {
                console.log(data);
                        if (data.data.token) {
                            $rootScope.authenticated = true;
                            console.log("oli");
                            // store username and token in local storage to keep user logged in between page refreshes
                            $localStorage.currentUser = { username: username, token: data.data.token };

                            // add jwt token to auth header for all requests made by the $http service
                            $http.defaults.headers.common['Authorization'] = 'Bearer ' + data.data.refreshToken;

                        } else {
                            $rootScope.authenticated = false;
                        }
                callback && callback();
            },function (error) {
                $rootScope.authenticated = false;
                callback && callback();
            });

    };

    //authenticate();
    $scope.credentials = {};
    $scope.login = function () {
        authenticate($scope.credentials, function () {
            if ($rootScope.authenticated) {
                 localStorage.setItem("usuario", $scope.credentials.username);
                $location.path("/intercambiar");
                $scope.error = false;

            } else {
                $location.path("/login");
                $scope.error = true;
            }
        });
    };

    $scope.logout = function () {
                $http.post('/logout', {}).then(function () {
                    $rootScope.authenticated = false;
                    $location.path("/login");
                 }),function (data) {
                    $rootScope.authenticated = false;
                 };
            };

}]);