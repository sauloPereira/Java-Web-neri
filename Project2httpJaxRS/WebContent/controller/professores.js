	var professoresModulo = angular.module('professoresModulo', []);
	
	professoresModulo.controller("professoresController", function ($scope, $http){
		
		urlProfessor = 'http://localhost:8080/Project2httpJaxRS/rest/professores';
		$scope.listarProfessores = function(){
			$http.get(urlProfessor).success(function(professores) {
				$scope.professores = professores;
				
			}).error (function (erro){
				alert(erro);
			});
		}
		
		$scope.selecionaProfessor = function(professorSelecionado){
			$scope.professor = professorSelecionado;
			
		}
		
		$scope.limparCampos = function(){
			$scope.professor = "";
		}
		
		$scope.salvar = function(){
			if ($scope.professor.codigo = ''){
				$http.post(urlProfessor, $scope.professor).success(function(professor){
					$scope.professores.push($scope.professor);
					$scope.limparCampos();
				}).error (function (erro){
					alert(erro);
				});
			}
			else {
				$http.put(urlProfessor, $scope.professor).success(function(professor){
					$scope.professores.push($scope.professor);
					$scope.limparCampos();
				}).error (function (erro){
					alert(erro);
				});
			}
			
			$scope.professores.push($scope.professor);
			$scope.limparCampos();
		}
		
		//para executar automatimamente
		$scope.listarProfessores();
	});