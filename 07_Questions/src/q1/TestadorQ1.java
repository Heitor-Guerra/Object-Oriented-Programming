package q1;

import q1.empresa.*;

/**
 * Questão 1 (4 pontos).
 *
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores).
 *
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e
 * algumas operações, mas não é exaustivo quanto aos atributos e operações.
 * Adicione aqueles que foram necessários.)
 *
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma
 * unidade organizacional, assim como para consultar os funcionários nela lotados
 * (direta ou indiretamente).
 *
 * Atenção às indicações de navegabilidade e às cardinalidades.
 *
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 *
 * Crie um testador para suas classes.
 *
 */


public class TestadorQ1 {

	public static void main(String[] args) {
	  Empresa emp = new Empresa("Coca-Cola");

		Departamento d1 = emp.addDepartamento("RH");
		Departamento d2 = emp.addDepartamento("Fabrica");

		Setor s1 = d1.addSetor("Contratacoes");
		Setor s2 = d1.addSetor("Demissoes");

		Funcionario funcionario = s1.addFuncionario("Heitor", 1200);

		System.out.println(emp);

		s1.transfereFuncionario(s2, funcionario);

		System.out.println(emp);
	}

}
