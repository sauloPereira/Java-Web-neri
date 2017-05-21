	var professoresModulo = angular.module('professoresModulo', []);
	
	professoresModulo.controller("professoresController", function ($scope){
		$scope.professores = [
			{codigo:1, nome:'Morgana Pereira Rodrigues', email:'morgana@email.com', phone:'85 988181710'},
			{codigo:2, nome:'Saulo Pereira da Silva', email:'saulo@email.com', phone:'85 988181710'},
			{codigo:3, nome:'Francisca Joelma Sousa Rodrigues', email:'joelma@email.com', phone:'85 988181710'},
			{codigo:4, nome:'Morgana Khalisee Pereira Rodrigues', email:'khalisee@email.com', phone:'85 988181710'}
		];
		
		$scope.selecionaProfessor = function(professorSelecionado){
			$scope.professor = professorSelecionado;
		}
		
		$scope.limparCampos = function(){
			$scope.professor = "";
		}
		
		$scope.salvar = function(){
			$scope.professores.push($scope.professor);
			$scope.limparCampos();	
		}
		
		$scope.excluir = function(){
			$scope.professores.splice($scope.professores.indexOf($scope.professor), 1);
			$scope.limparCampos();
		}
		
	});