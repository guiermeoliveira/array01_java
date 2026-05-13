import java.util.ArrayList;
	
	void main(){
	ArrayList<String> tarefas = new ArrayList<>();
	String parada = "fim";
	while (true) {
	IO.println();
    	String entrada = IO.readln("Digite uma tarefa ou '" + parada + "' para finalizar o programa: ");
	if (entrada.equalsIgnoreCase(parada)) {
        break; 
    		}
	tarefas.add(entrada);
	}
	IO.println();
	IO.println("===== Lista de Tarefas =====");
	IO.println();
	for (String t : tarefas){
	IO.println();
	IO.println(String.format("Tarefa " + " - " + t));
	}
}