import java.util.ArrayList.*;
void main(){
	
	ArrayList<Float> temperaturaC = new ArrayList<>();
	ArrayList<Float> temperaturaF = new ArrayList<>();
	float somaC = 0;
	float somaF = 0;

	String parada = "sair";
	while (true) {
	IO.println();
    	String entrada = IO.readln("Digite uma temperatura ou '" + parada + "' para finalizar o programa: ");
	IO.println();

	if (entrada.equalsIgnoreCase(parada)) {
        break; 
	}
	float strfloat = Float.parseFloat(entrada);
	temperaturaC.add(strfloat);
	}

	for (int i = 0;  i < temperaturaC.size(); i++){
	float c = temperaturaC.get(i);
	float f = (c * 9/5) + 32;
	temperaturaF.add(f);
	somaC += c;
	somaF += f;
	}

	float mediaC = somaC / temperaturaC.size();
	float mediaF = somaF / temperaturaF.size();
	IO.println();
    	IO.println("===== Lista de Conversão e Média de Temperaturas =====");
    	for (int i = 0; i < temperaturaC.size(); i++) {
        IO.println(String.format("C: %.1f° | F: %.1f°", temperaturaC.get(i), temperaturaF.get(i)));
	IO.println();
	    }

    	IO.println("--------------------------------------------------");
    	IO.println("Média Celsius: " + mediaC);
    	IO.println("Média Fahrenheit: " + mediaF);
	
}