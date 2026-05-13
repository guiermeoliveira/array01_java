import java.util.ArrayList.*;
	void main() {
	String [] convidados = new String [5];
	for (int i = 0; i < convidados.length; i++){
	convidados[i] = IO.readln("Digite o nome do " + (i+1) + "º convidado: ");
	}
	IO.println("========== Lista de convidados ==========");
	for (int i = 0; i < convidados.length; i++){
	IO.println("Convidado: " + convidados[i]);
	}
} 



