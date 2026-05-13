import java.util.ArrayList.*;

void main(){
	
	float [] precos = new float[5];
	float menor = Float.MAX_VALUE;
	float maior = Float.MIN_VALUE;
	for (int i = 0; i < precos.length; i++){
	precos[i] = Float.parseFloat(IO.readln("digite o preço do º" + (i+1) + " produto: " ));
	if (precos[i] < 0) {
	IO.print ("O valor não pode ser negativo");
	}} 
	for (int i = 0; i < precos.length; i++) {    
    	if (precos[i] > maior) {
        maior = precos[i];
    	}
    	if (precos[i] < menor) {
        menor = precos[i];
    	}
	}
	IO.println(String.format("o maior é: " + maior));
	IO.println(String.format("o maior é: " + menor));
}