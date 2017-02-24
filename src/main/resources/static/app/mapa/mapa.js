angular.module('appMaps', ['uiGmapgoogle-maps'])
 /*   .config(['$routeProvider', function($routeProvider) {
      $routeProvider.when('/mapa', {
        templateUrl: 'mapa/mapa.html',
        controller: 'mainCtrl'
      });
    }])*/

    .controller('mainCtrl', function($scope) {
        $scope.map = {
        		center: {
        			latitude: 4.782627,
        			longitude: -74.042634
        		},
        		zoom: 19,
        		options : {
        			scrollwheel: true
        		},
        		control: {}
        	};
        	$scope.marker = {
        		id: 0,
        		coords: {
        			latitude: 4.783409,
        			longitude:  -74.043269
        		},
        		options: {
        			draggable: true
        		}
        	};
    });