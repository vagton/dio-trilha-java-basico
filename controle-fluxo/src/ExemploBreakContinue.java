
public class ExemploBreakContinue {

    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                //break; // para no 3 e imprime 1 e 2
                continue; // pula o 3 e imprime o resto
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
        // para o break é: 1,2
        // para o continue é: 1,2,4,5

    }
}
