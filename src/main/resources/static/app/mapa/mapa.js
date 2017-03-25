
angular.module('appMaps', ['ngRoute', 'uiGmapgoogle-maps'])
  .config(['$routeProvider', function($routeProvider) {
      $routeProvider.when('/mapa', {
        templateUrl: 'mapa/mapa.html',
        controller: 'mainCtrl'
      });
    }])

    .controller('mainCtrl', function($scope, $timeout, LibrosDispoFactory) {
    var markerId = 0;
    var libros = [];
    var data = [];
     $scope.listado = [];
        $scope.listado = LibrosDispoFactory.query({username:'admin@sharebook.com'},function (response) {
            angular.forEach(response, function (item) {
                    data.push(item);
            });
            function refresh(marker) {
                	 $timeout(function(){
                		$scope.map.control.refresh({latitude: marker.latitude,
                		longitude: marker.longitude});
                		},3000);
                	}

                	function create(latitude, longitude) {
                		var marker = {
                			options: {
                				animation: 1,
                				labelAnchor: "30 -5",
                				labelClass: 'markerlabel'
                			},
                			latitude: latitude,
                			longitude: longitude,
                			id: ++markerId
                		};
                		return marker;
                	}

                	function invokeSuccessCallback(successCallback, marker) {
                		if (typeof successCallback === 'function') {
                			successCallback(marker);
                		}
                	}

                	function createByCoords(latitude, longitude, successCallback) {
                		var marker = create(latitude, longitude);
                		invokeSuccessCallback(successCallback, marker);
                	}
                    for (i = 0; i < data.length; i++) {
                        createByCoords(data[i].latitude, data[i].longitude, function (marker) {
                                    console.info(data[i].latitude);
                            		marker.options.labelContent = data[i].nombre;
                            		marker.options.icon = '/app/imagenes/book.png';
                            		refresh(marker);

                            		libros.push(marker);
                            	});
                    }


                	function createByCurrentLocation(successCallback) {
                    	if (navigator.geolocation) {
                    		navigator.geolocation.getCurrentPosition(function (position) {
                    			var marker = create(position.coords.latitude, position.coords.longitude);
                    			invokeSuccessCallback(successCallback, marker);
                    		});
                    	} else {
                    		alert('Unable to locate current position');
                    	}
                    }

                    createByCurrentLocation(function (marker) {
                    	marker.options.labelContent = 'Aqui estas';
                    	$scope.map.markers.push(marker);
                    	refresh(marker);
                    });

                $scope.map = {
                        		center: {
                        			latitude: 4.782627,
                        			longitude: -74.042634
                        		},
                        		zoom: 18,
                        		markers: [],
                        		options : {
                        			scrollwheel: true
                        		},
                        		control: {}
                        	};
                for (i = 0; i < libros.length; i++) {
                    $scope.map.markers.push(libros[i]);
                    console.info(i);
                    }
        });


           });
