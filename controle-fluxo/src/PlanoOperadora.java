
public class PlanoOperadora {

    public static void main(String[] args) {
        // Modo condicional convencional
        String plano = "M"; //M / T

        System.out.println("Novo Plano telefónico: "+ plano);

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Intagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Intagram grátis");
            System.out.println("5Gb Youtube");
        }

        // Modo condicional switch/case
        plano = "B"; // M / T

        System.out.println("Novo Plano telefónico: "+ plano);

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Intagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

    }

}
