	var cursoModulo = angular.module('cursoModulo', []);
	
	cursoModulo.controller("cursoController", function ($scope){
		$scope.professores = [
			{codigo:1, nome:'Morgana Pereira Rodrigues', email:'morgana@email.com', phone:'85 988181710'},
			{codigo:2, nome:'Saulo Pereira da Silva', email:'saulo@email.com', phone:'85 988181710'},
			{codigo:3, nome:'Francisca Joelma Sousa Rodrigues', email:'joelma@email.com', phone:'85 988181710'},
			{codigo:4, nome:'Morgana Khalisee Pereira Rodrigues', email:'khalisee@email.com', phone:'85 988181710'}
		];

		$scope.cursos = [
			{codigo:1, nome:'Java Web', diashorarios:'Seg e Quar / 19hs', professor:{codigo:1, nome:'Morgana Pereira Rodrigues', email:'morgana@email.com', phone:'85 988181710'}},
			{codigo:2, nome:'C#', diashorarios:'Ter e Qui / 20hs', professor:{codigo:2, nome:'Saulo Pereira da Silva', email:'saulo@email.com', phone:'85 988181710'}},
			{codigo:3, nome:'PHP', diashorarios:'Sex / 19hs', professor:{codigo:3, nome:'Francisca Joelma Sousa Rodrigues', email:'joelma@email.com', phone:'85 988181710'}},
			{codigo:4, nome:'MySQL', diashorarios:'Sáb / 10hs', professor:{codigo:4, nome:'Morgana Khalisee Pereira Rodrigues', email:'khalisee@email.com', phone:'85 988181710'}}
		];
		
		$scope.selecionaCurso = function(cursoSelecionado){
			$scope.curso = cursoSelecionado;
		}
		
		$scope.limparCampos = function(){
			$scope.curso = "";
		}
		
		$scope.salvar = function(){
			$scope.cursos.push($scope.curso);
			$scope.limparCampos();	
		}
		
		$scope.excluir = function(){
			$scope.cursos.splice($scope.cursos.indexOf($scope.curso), 1);
			$scope.limparCampos();
		}
		
	});