import controller.Cafeteria;
import models.Insumo.Insumo;
import models.Pessoa.Funcionario;
import models.Pessoa.Pessoa;
import models.Pessoa.Usuario;
import models.Produto.*;
import view.IFuncionario;

public class App {
    public static void main(String[] args) throws Exception {
        Cafeteria cafeteria = new Cafeteria();

        Produto leite = new Produto("Leite Integral", 15, 8.98);
        Produto leite2 = new Produto("Leite Desnatado", 30, 12.98);
        Produto cafe = new Produto("Café Preto", 9, 4.98);

        Insumo acucar = new Insumo("Açúcar", 20, 2.50);
        Insumo agua = new Insumo("Água", 50, 1.50);

        Pessoa funcionario1 = new Funcionario("Gilberto", "111.222.333-44", 1440.18);
        Pessoa usuario1 = new Usuario("Gelbecks", "31461364566", "a@.com");

        System.out.println(cafeteria);

        cafeteria.AdicionarProduto(leite);
        cafeteria.AdicionarProduto(leite2);
        cafeteria.AdicionarProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.RemoverProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.RemoverProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.ListarProdutos();

        //////// PARTE DO INSUMO ////////

        cafeteria.AdicionarInsumo(acucar);
        cafeteria.AdicionarInsumo(agua);

        cafeteria.RemoverInsumo(acucar);

        cafeteria.ListarInsumos();

        /////// PARTE DA PESSOA ///////

        cafeteria.ListarPessoas();

        cafeteria.AdicionarFuncionario(funcionario1);
        cafeteria.AdicionarFuncionario(funcionario1);

        cafeteria.AdicionarUsuario(usuario1);
        cafeteria.AdicionarUsuario(usuario1);

        System.out.println(cafeteria);

        IFuncionario.main();
    }
}