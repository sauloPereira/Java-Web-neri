	var professoresModulo = angular.module('professoresModulo', []);
	
	professoresModulo.controller("professoresController", function ($scope, $http){
		
		urlProfessor = 'http://localhost:8080/Projeto4FinalS/rest/professores';
		
		$scope.listarProfessores = function() {
			
			$http.get(urlProfessor).success(function(professores) {
				$scope.professores = professores;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.selecionaProfessor = function(professorSelecionado) {
			$scope.professor = professorSelecionado;
		}

		$scope.limparCampos = function() {
			$scope.professor = null;
		}
		
		$scope.salvar = function() {
			//alert($scope.professor.codigo);
			
			if ($scope.professor.codigo == undefined) {
				//alert("POST - Código vazio = novo registro");
				//console.log("POST - Código vazio = novo registro");
				$http.post(urlProfessor, $scope.professor).success(function(professor) {
					//$scope.professores.push($scope.professor); //push = salva e altera dados BD.
					$scope.limparCampos();
					$scope.listarProfessores();
				}).error(function (erro) {
					alert(erro);
					
				});
				
			}
			
			else {
				//alert("PUT - Código !vazio = alterar registro");
				//console.log("PUT - Código !vazio = alterar registro");
				
				$http.put(urlProfessor, $scope.professor).success(function(professor) {
					$scope.listarProfessores();
					$scope.limparCampos();
				}).error(function (erro) {
					alert(erro);
					
				});
			}
	
		}
		
		$scope.excluir = function() {
			if ($scope.professor.codigo == undefined) {
				alert("Favor selecionar um registro");
				console.log("Favor selecionar um registro");
				
			}
			else {
				//alert("DELETE - Código !vazio = excluir registro");
				//console.log("DELETE - Código !vazio = excluir registro");
				
				$http.delete(urlProfessor + '/' + $scope.professor.codigo).success(function() {
					$scope.listarProfessores();
					$scope.limparCampos();
				}).error(function(erro) {
					alert(erro);
				});
				
			}
			
		}
		
		//executar
		$scope.listarProfessores();

	});