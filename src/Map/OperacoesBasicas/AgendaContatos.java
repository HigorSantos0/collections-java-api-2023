package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
         if(!agendaContatoMap.isEmpty()){
             numeroPorNome = agendaContatoMap.get(nome);
         }
         return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Higor", 12345);
        agendaContatos.adicionarContato("Higor", 354652);
        agendaContatos.adicionarContato("Higor nascimento", 1111111);
        agendaContatos.adicionarContato("Higor Santos", 6587567);
        agendaContatos.adicionarContato("Higor", 55555);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Higor Santos");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Higor nascimento"));

    }
}
