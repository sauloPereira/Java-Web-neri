	var cursoModulo = angular.module('cursoModulo', []);
	
	cursoModulo.controller("cursoController", function ($scope, $http){
		
		urlProfessor = 'http://localhost:8080/Projeto4FinalS/rest/professores';
		urlCurso = 'http://localhost:8080/Projeto4FinalS/rest/cursos';
		$scope.listarCursos = function() {
			
			$http.get(urlCurso).success(function(cursos) {
				$scope.cursos = cursos;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.listarProfessores = function() {
			
			$http.get(urlProfessor).success(function(professores) {
				$scope.professores = professores;
				
			}).error(function (erro) {
				alert(erro);
				
			});
			
		}
		
		$scope.selecionaCurso = function(cursoSelecionado) {
			$scope.curso = cursoSelecionado;
		}

		$scope.limparCampos = function() {
			$scope.curso = null;
		}
		
		$scope.salvar = function() {
			//alert($scope.curso.codigo);
			
			if ($scope.curso.codigo == undefined) {
				//alert("POST - Código vazio = novo registro");
				console.log("POST - Código vazio = novo registro");
				$http.post(urlCurso, $scope.curso).success(function(curso) {
					//$scope.cursos.push($scope.curso); //push = salva e altera dados BD.
					$scope.limparCampos();
					$scope.listarCursos();
				}).error(function (erro) {
					alert(erro);
					
				});
				
			}
			
			else {
				//alert("PUT - Código !vazio = alterar registro");
				console.log("PUT - Código !vazio = alterar registro");
				
				$http.put(urlCurso, $scope.curso).success(function(curso) {
					$scope.listarCursos();
					$scope.limparCampos();
				}).error(function (erro) {
					alert(erro);
					
				});
			}
	
		}
		
		$scope.excluir = function() {
			if ($scope.curso.codigo == undefined) {
				alert("Favor selecionar um registro");
				console.log("Favor selecionar um registro");
				
			}
			else {
				//alert("DELETE - Código !vazio = excluir registro");
				console.log("DELETE - Código !vazio = excluir registro");
				
				$http.delete(urlCurso + '/' + $scope.curso.codigo).success(function() {
					$scope.listarCursos();
					$scope.limparCampos();
				}).error(function(erro) {
					alert(erro);
				});
				
			}
			
		}
		
		//executar
		$scope.listarCursos();
		$scope.listarProfessores();

	});