public class Cliente {

	private static int ultimoID = 10_000;

    private String nome;
    private int documento;

        /**
         * Construtor do cliente. Cria um novo cliente a partir do nome informado.
         * TODO: utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
         * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
         * do contador estático ultimoID (e incremente o contador).
         */
    public Cliente (String nome) {

    	setNome(nome);
    	documento = ultimoID++;

    }

  
    public String getNome() {
    	return nome;
    }

  
    public void setNome(String nome) {

    	if ((nome == null) || (nome.trim().split("\\s+").length < 2)) {
    		throw new IllegalArgumentException("O nome do cliente deve conter, pelo menos, duas palavras.");
    	}
    	this.nome = nome;
        

    }

   
    @Override
    public String toString() {
        return nome + " (documento: " + documento + ")";
    }

   
    @Override
    public int hashCode(){
        return documento;
    }
}
