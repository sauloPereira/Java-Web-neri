	var professoresModulo = angular.module('professoresModulo', []);
	
	professoresModulo.controller("professoresController", function ($scope){
		$scope.professores = [
			{codigo:1, nome:'Morgana Pereira Rodrigues', email:'morgana@email.com', fone:'85 988181710'},
			{codigo:2, nome:'Saulo Pereira da Silva', email:'saulo@email.com', fone:'85 988181710'},
			{codigo:3, nome:'Francisca Joelma Sousa Rodrigues', email:'joelma@email.com', fone:'85 988181710'},
			{codigo:4, nome:'Morgana Khalisee Pereira Rodrigues', email:'khalisee@email.com', fone:'85 988181710'}
		];
		
		$scope.selecionaProfessor = function(professorSelecionado) {
			$scope.professor = professorSelecionado;
		}

		$scope.limparCampos = function() {
			$scope.professor = null;
		}

		$scope.salvar = function() {
			$scope.professores.push($scope.professor); //push = salva e altera dados BD.
			$scope.limparCampos();
		}

		$scope.excluir = function() {
			$scope.professores.splice($scope.professores.indexOf($scope.professor), 1);
			//Splice = usado para deletar  -  indexOf = pega apenas um, caso haja mais detro do BD e excli o 1º
			$scope.limparCampos();
		}

	});