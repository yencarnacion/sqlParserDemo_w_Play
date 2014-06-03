angular.module('planillapr.controllers', [])

.controller('AppCtrl', function($scope) {
})

.controller('PersonalInfoCtrl', function($scope) {
   $scope.name1 = "";
   $scope.name2 = "";
   $scope.lastName1 = "";
   $scope.lastName2 = "";
})

.controller('PlaylistsCtrl', function($scope) {
  $scope.playlists = [
    { title: 'Reggae', id: 1 },
    { title: 'Chill', id: 2 },
    { title: 'Dubstep', id: 3 },
    { title: 'Indie', id: 4 },
    { title: 'Rap', id: 5 },
    { title: 'Cowbell', id: 6 }
  ];
})

.controller('PlaylistCtrl', function($scope, $stateParams) {
})
