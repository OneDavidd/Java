package controller;

import java.util.ArrayList;
import java.util.List;

import models.Insumo.*;
import models.Pessoa.*;
import models.Produto.*;
import models.Venda.*;

public class Cafeteria {
    List<Produto> produtos;
    int codigoProduto;

    List<Insumo> insumos;
    int codigoInsumo = 0;

    List<Pessoa> pessoas;
    int codigoPessoa = 0;

    List<Venda> vendas;
    int codigoVendas = 0;

    public Cafeteria() {
        produtos = new ArrayList<>();
        insumos = new ArrayList<>();
        pessoas = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    ////// ------------ PRODUTO ------------ //////

    //////// ADICIONAR PRODUTO ////////
    public void AdicionarProduto(Produto novoProduto) {
        int novoCodigo = codigoProduto + 1;

        if (BuscarProduto(novoProduto.getCodigoProduto()) == null) {
            novoProduto.setCodigoProduto(novoCodigo);
            codigoProduto = novoCodigo;
            produtos.add(novoProduto);
            System.out.println(novoProduto.getNomeProduto() + ", com código: " + novoProduto.getCodigoProduto()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Produto já cadastrado com esse id! (" + novoProduto.getCodigoProduto() + ")");
        }
    }

    //////// LISTAR PRODUTO ////////
    public void ListarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Não há produtos cadastradas!");
        } else {
            System.out.println(produtos);
        }
    }

    //////// REMOVER PRODUTO ////////
    public void RemoverProduto(Produto removerProduto) {
        if (BuscarProduto(removerProduto.getCodigoProduto()) != null) {
            produtos.remove(removerProduto);
            System.out.println(removerProduto.getNomeProduto() + ", com código: " + removerProduto.getCodigoProduto()
                    + " removido com sucesso!");
        } else {
            System.out.println("Produto não encontrada!");
        }
    }

    //////// BUSCAR PRODUTO ////////
    public Produto BuscarProduto(int idProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == idProduto) {
                return produto;
            }
        }
        return null;
    }

    ////// ------------ INSUMO ------------ //////

    ////// ADICIONAR INSUMO ////////

    public void AdicionarInsumo(Insumo novoInsumo) {
        int novoCodigo = codigoInsumo + 1;

        if (BuscarInsumo(novoInsumo.getCodigoInsumo()) == null) {
            novoInsumo.setCodigoInsumo(novoCodigo);
            codigoInsumo = novoCodigo;
            insumos.add(novoInsumo);
            System.out.println(novoInsumo.getNomeInsumo() + ", com código: " + novoInsumo.getCodigoInsumo()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Insumo já cadastrado com esse id! (" + novoInsumo.getCodigoInsumo() + ")");
        }
    }

    ////// LISTAR INSUMO ////////

    public void ListarInsumos() {
        if (insumos.size() == 0) {
            System.out.println("Não há insumos cadastrados!");
        } else {
            System.out.println(insumos);
        }
    }

    ////// REMOVER INSUMO ////////

    public void RemoverInsumo(Insumo removerInsumo) {
        if (BuscarInsumo(removerInsumo.getCodigoInsumo()) != null) {
            insumos.remove(removerInsumo);
            System.out.println(removerInsumo.getNomeInsumo() + ", com código: " + removerInsumo.getCodigoInsumo()
                    + " removido com sucesso!");
        } else {
            System.out.println("Insumo não encontrado!");
        }
    }

    ////// BUSCAR INSUMO ////////

    public Insumo BuscarInsumo(int idInsumo) {
        for (Insumo insumo : insumos) {
            if (insumo.getCodigoInsumo() == idInsumo) {
                return insumo;
            }
        }
        return null;
    }

    ////// ------------ PESSOA ------------ //////

    //////// ADICIONAR FUNCIONARIO ////////
    public void AdicionarFuncionario(Pessoa novoFuncionario) {
        int novoCodigo = codigoPessoa + 1;

        if (BuscarFuncionarios(novoFuncionario.getIdPessoa()) == null) {
            novoFuncionario.setIdPessoa(novoCodigo);
            codigoPessoa = novoCodigo;
            pessoas.add(novoFuncionario);
            System.out.println(novoFuncionario.getNome() + ", com código: " + novoFuncionario.getIdPessoa()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Funcionário já cadastrado com esse id! (" + novoFuncionario.getIdPessoa() + ")");
        }
    }

    //////// ADICIONAR USUARIO ////////
    public void AdicionarUsuario(Pessoa novoUsuario) {
        int novoCodigo = codigoPessoa + 1;

        if (BuscarUsuarios(novoUsuario.getIdPessoa()) == null) {
            novoUsuario.setIdPessoa(novoCodigo);
            codigoPessoa = novoCodigo;
            pessoas.add(novoUsuario);
            System.out.println(novoUsuario.getNome() + ", com código: " + novoUsuario.getIdPessoa()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Usuario já cadastrado com esse id! (" + novoUsuario.getIdPessoa() + ")");
        }
    }

    //////// LISTAR PESSOAS ////////
    // public List<Pessoa> ListarPessoas() throws Exception {
    // if (pessoas.size() == 0) {
    // throw new Exception("Não há pessoas cadastradas!");
    // } else {
    // return pessoas;
    // }
    // }

    ////// LISTAR INSUMO ////////

    public void ListarPessoas() {
        if (pessoas.size() == 0) {
            System.out.println("Não há pessoas cadastrados!");
        } else {
            System.out.println(pessoas);
        }
    }

    //////// LISTAR FUNCIONARIOS ////////
    public List<Funcionario> ListarFuncionarios() throws Exception {
        if (pessoas.size() == 0) {
            throw new Exception("Não há funcionarios cadastrados!");
        } else {
            List<Funcionario> funcionarios = new ArrayList<>();
            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof Funcionario) {
                    funcionarios.add((Funcionario) pessoa);
                }
            }
            return funcionarios;
        }
    }

    //////// LISTAR USUARIOS ////////
    public List<Usuario> ListarUsuarios() throws Exception {
        if (pessoas.size() == 0) {
            throw new Exception("Não há usuarios cadastrados!");
        } else {
            List<Usuario> usuarios = new ArrayList<>();
            for (Pessoa pessoa : pessoas) {
                if (pessoa instanceof Usuario) {
                    usuarios.add((Usuario) pessoa);
                }
            }
            return usuarios;
        }
    }

    //////// REMOVER FUNCIONARIO ////////
    public void RemoverFuncionario(Funcionario removerFuncionario) {
        if (BuscarProduto(removerFuncionario.getIdPessoa()) != null) {
            pessoas.remove(removerFuncionario);
            System.out.println(
                    removerFuncionario.getNome() + ", com código: " + removerFuncionario.getIdPessoa()
                            + " removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    //////// BUSCAR FUNCIONARIO ////////
    public Funcionario BuscarFuncionarios(int idFuncionario) {
        List<Funcionario> funcionarios = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario) {
                funcionarios.add((Funcionario) pessoa);

                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getIdPessoa() == idFuncionario) {
                        return funcionario;
                    }
                }
            }
        }
        return null;
    }

    //////// BUSCAR USUARIOS ////////
    public Usuario BuscarUsuarios(int idUsuario) {
        List<Usuario> usuarios = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Usuario) {
                usuarios.add((Usuario) pessoa);

                for (Usuario usuario : usuarios) {
                    if (usuario.getIdPessoa() == idUsuario) {
                        return usuario;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cafeteria [produtos=" + produtos + ", codigoProduto=" + codigoProduto + ",\n insumos=" + insumos
                + ", codigoInsumo=" + codigoInsumo + ",\n pessoas=" + pessoas + ", codigoPessoa=" + codigoPessoa
                + ", vendas=" + vendas + ", codigoVendas=" + codigoVendas + "]";
    }

    ////// ------------ VENDA ------------ //////

}