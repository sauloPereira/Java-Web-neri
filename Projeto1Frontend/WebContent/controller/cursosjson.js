var cursosModulo = angular.module('cursosModulo', []);
	
	cursosModulo.controller("cursosController", function ($scope, $http){ //$http = vai pegar arquivos externos.
		$http.get('controller/cursosjson.json').then(function(response) { //get recebe caminho para arquivos. then function armazenará resposta 
			$scope.cursos = response.data.cursos; //scope.cursos gerada variavel. response pega dados (cursos = cursosjson.json)
		})
		
	});