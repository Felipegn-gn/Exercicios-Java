import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo, boolean concluida) {
        this.titulo = titulo;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }
}

public class EX9 {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.add(new Tarefa("Fazer compras", true));
        listaDeTarefas.add(new Tarefa("Ligar para o cliente", false));
        listaDeTarefas.add(new Tarefa("Pagar contas", true));
        listaDeTarefas.add(new Tarefa("Agendar consulta médica", false));
        listaDeTarefas.add(new Tarefa("Estudar para a prova", true));


        // Usando filter e map para encontrar os títulos das tarefas concluídas
        List<String> titulosConcluidos = listaDeTarefas.stream()
                .filter(Tarefa::isConcluida) // Filtra apenas as tarefas concluídas
                .map(Tarefa::getTitulo)     // Mapeia cada tarefa restante para o seu título
                .collect(Collectors.toList()); // Coleta os resultados em uma nova lista

        System.out.println("Títulos das tarefas concluídas:");
        titulosConcluidos.forEach(System.out::println);
    }
}