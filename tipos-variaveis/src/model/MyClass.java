package model;

public class MyClass {
	
    public double somar(int num1, int num2){
        //LOGICA - FINALIDADE DO MÉTODO
        return num1 + num2;
    }
    
    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    // throws Exception : indica que o método ao ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Divisão por zero não é permitida");
        }
        return (double) dividendo / divisor;
    }

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){
        // será criado
    }
    
    //alguns equívocos estruturais
    public boolean validar(){   // não pode colocar void
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)

        // tratamento
        Boolean validacao = true;
        return validacao;
    }
    public void EnviarCalculo(){   // calcularEnviar seria um nome errado
        //um método deve representar uma única responsabilidade
    }
    public void gravarCliente(Cliente cliente){ // seria ruim colocar String nome, String cpf, Integer telefone, ....
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }

    public Boolean gravar(Cliente cliente){ // pode ser assim
        Boolean status = false;
        return status;
    } 
}  

