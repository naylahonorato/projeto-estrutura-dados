public class Cliente {
        private String nome,sobrenome;
        private String cpf;
    
        public Cliente(String nome,String sobrenome, String cpf) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
           
        }
    
        @Override
        public String toString() {
            return "Nome: " + nome + " " + sobrenome + ", CPF: " + cpf;
        }
    }
    

