import java.util.ArrayList;

void main() {

	//declara variavel do menu e da Lista (array)
    ArrayList<String> lista = new ArrayList<>();
    int opcao = 0;
	
	//loop para menu
    while (opcao != 6) {
	IO.println("\n----------------------------");
        IO.println("\n===== MENU DE PRODUTOS =====");
        IO.println("1 - Adicionar Produto");
        IO.println("2 - Pesquisar Produto");
        IO.println("3 - Remover Produto");
        IO.println("4 - Alterar Produto");
        IO.println("5 - Listar Todos");
        IO.println("6 - Sair");
        
        // Lê a opção como String e converte para evitar erros
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));
	
	//Switch ao inves de condicionais de blocos longos e excesso de logica no FOR
	//Repare que aqui declaramos variaveis apenas para entrada dos dados dentro dos cases
        switch (opcao) {
            case 1:
		//declara uma variavel pro produto entrar no index do Array da Lista
                String novo = IO.readln("Nome do produto para adicionar: ");
                lista.add(novo);
                IO.println("Produto adicionado!");
                break;

            case 2:
		//declara uma variavel pra buscar no index do Array da Lista
                String busca = IO.readln("Nome para pesquisar: ");
		
		//Array permite uso da sintaxe para melhor performance em resultado de buscas
		//metodos .contains(), .indexOf(), .remove(), .add() entre outros indices...
                if (lista.contains(busca)) {
                    IO.println("Produto encontrado na posição: " + lista.indexOf(busca));
                } else {
                    IO.println("Produto não encontrado.");
                }
                break;

            case 3:
		//Variavel de input para remover do index
                String remover = IO.readln("Nome do produto para remover: ");
                if (lista.remove(remover)) {
                    IO.println("Removido com sucesso!");
                } else {
                    IO.println("Produto não existe na lista.");
                }
                break;

            case 4:
		//Variavel de input pra alterar o index
                String antigo = IO.readln("Nome do produto que deseja alterar: ");
                int index = lista.indexOf(antigo);
                if (index != -1) {
                    String atualizado = IO.readln("Digite o novo nome: ");
                    lista.set(index, atualizado);
                    IO.println("Alterado com sucesso!");
                } else {
                    IO.println("Produto não encontrado.");
                }
                break;

            case 5:
		//Aqui os métodos conseguem buscar todas as inserções e alterações
                IO.println("\n--- Itens no Estoque ---");
                if (lista.isEmpty()) {
                    IO.println("A lista está vazia.");
                } else {
			
			//Esse FOR é apenas pra printar os resultados do case 5
                    for (int i = 0; i < lista.size(); i++) {
                        IO.println(String.format("%d. %-15s", (i + 1), lista.get(i)));
                    }
                }
                break;

            case 6:
                IO.println("Encerrando o sistema...");
                break;

            default:
		//tratando erro basico com default do switch, ainda poderiamos utilizar o try catch para evitarmos as lang.exceptions (caso de uso de string ao inves de int na entrada do menu causa erro)
                IO.println("Opção inválida!");
        }
    }
}
