/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exl07;

/**
 *
 * @author Eduardo
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Coordenador {
    private final Queue<Processo> filaDeEspera = new LinkedList<>();
    private boolean recursoDisponivel = true;
    private final Random random = new Random();

    public synchronized void requisitarRecurso(Processo processo) {
        System.out.println("Processo " + processo.getId() + " requisitou o recurso.");
        filaDeEspera.add(processo);
        processo.setTempoRequisicao(System.currentTimeMillis());
        tentarConcederRecurso();
    }

    public synchronized void liberarRecurso(Processo processo) {
        processo.setTempoLiberacao(System.currentTimeMillis());
        System.out.println("Processo " + processo.getId() + " liberou o recurso.");
        recursoDisponivel = true;
        tentarConcederRecurso();
    }

    private void tentarConcederRecurso() {
        if (recursoDisponivel && !filaDeEspera.isEmpty()) {
            Processo processo = filaDeEspera.poll();
            recursoDisponivel = false;
            processo.setTempoConcessao(System.currentTimeMillis());
            System.out.println("Processo " + processo.getId() + " recebeu o recurso.");
            simularUsoRecurso(processo);
        }
    }

    private void simularUsoRecurso(Processo processo) {
        new Thread(() -> {
            try {
                long tempoUso = 1000 + random.nextInt(4000); // Simular tempo de uso entre 1 e 5 segundos
                Thread.sleep(tempoUso);
                liberarRecurso(processo);
                long tempoEspera = processo.getTempoConcessao() - processo.getTempoRequisicao();
                long tempoUsoRecurso = processo.getTempoLiberacao() - processo.getTempoConcessao();
                System.out.println("Processo " + processo.getId() + " esperou " + tempoEspera + " ms e usou o recurso por " + tempoUsoRecurso + " ms.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}