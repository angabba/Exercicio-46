
public class EmpregadoTeste {
	public static void main(String arg[]) {
		
		Funcionario f1, f2;
		
		f1 = new Funcionario();
		f2 = new Funcionario();
		
		f1.Nome = "Ueliton José";
		f1.Cargo = "Gerente";
		f1.Salario = 10000.0;
		
		f2.Nome = "Enzo Gabriel";
		f2.Cargo = "Analista";
		f2.Salario = 3000.0; 
		
		f1.exibirFuncionario();
		f2.exibirFuncionario();
				
				
	}

}
