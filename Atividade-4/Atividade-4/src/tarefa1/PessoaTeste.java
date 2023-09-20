package tarefa1;


public class PessoaTeste {

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("123", "joao");
        Pessoa p2 = new Pessoa("456", "maria");
        
        System.out.println("Dados da primeira pessoa");
        System.out.println("cpf: "+ p1.getCpf());
        System.out.println("nome: "+ p1.getNome());
        
        System.out.println("Dados da segunda pessoa");
        System.out.println("cpf: "+ p2.getCpf());
        System.out.println("nome: "+ p2.getNome());
        
        System.out.println("dados:\n\n"+ p1.toString());
    }
    
}
