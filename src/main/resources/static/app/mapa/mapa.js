




angular.module('appMaps', ['uiGmapgoogle-maps'])
    .controller('mainCtrl', function($scope) {



        $scope.map = { center: { latitude: 45, longitude: -73 }, zoom: 8 };
    });