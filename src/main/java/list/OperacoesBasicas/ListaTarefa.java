package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // tarefaList é um objeto da classe List que contém Tarefas no lugar de uma generic
    private List<Tarefa> tarefaList;
    
    // Método construtor
    public ListaTarefa(){
        // Dentro de tarefaList contem um ArrayList (classe que implementa List)
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        // Usa o método add da classe List para adicionar um objeto Tarefa ao Arraylist
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa (String descricao){
        // Cria um ArrayList para guardar todas as Tarefas que devem ser removidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        // Verifica todos as Tarefas dentro do objeto tarefaList e adiciona a tarefasParaRemover as que devem ser removidas
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao));
            tarefasParaRemover.add(t);
        }
        // Método removeAll da classe List para remover todas os elementos da ArrayList tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Fazer lição de casa");
        listaTarefa.adicionarTarefa("Fazer lição de casa 2");
        listaTarefa.adicionarTarefa("Fazer lição de casa 3");
        System.out.println("O número total de elementos na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
