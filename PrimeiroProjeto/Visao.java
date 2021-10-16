package PrimeiroProjeto;

import java.util.Scanner;

public class Visao {
    Scanner scan = new Scanner(System.in);

    public void inserirCadastro(){
        System.out.println("Digite o id: ");
        int id = scan.nextInt();

        System.out.println("Digite o nome: ");
        String nome = scan.next();

        System.out.println("Digite o email: ");
        String email = scan.next();

        System.out.println("Digite o telefone: ");
        String telefone = scan.next();

        System.out.println("Digite a senha: ");
        String senha = scan.next();


        Controler cc = new Controler(id,nome,email,telefone,senha);
        DAO dao = new DAO();

        dao.insert(cc.getId(), cc.getNome(), cc.getEmail(), cc.getTelefone(), cc.getSenha());
        cc.toString();


    }


    public void deletarCadastro(){
        System.out.println("Digite o id: ");
        int id = scan.nextInt();

        Controler cc = new Controler();
        DAO dao = new DAO();

        cc.setId(id);
        dao.delete(cc.getId());
        cc.toString();


    }


    public void atualizarCadastro(){
        System.out.println("Digite o id: ");
        int id = scan.nextInt();

        System.out.println("Digite o nome: ");
        String nome = scan.next();

        Controler cc = new Controler();
        DAO dao = new DAO();

        cc.setId(id);
        cc.setNome(nome);
        dao.update(nome, id);
        cc.toString();


    }


    public void consultarCadastro(){
        DAO dao = new DAO();

        for(Controler m : dao.select()){
            System.out.printf("Id: %d \nNome: %s", m.getId(),m.getNome());
        }
    }
    
    
}