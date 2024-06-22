/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exl07;

import java.util.Random;

/**
 *
 * @author Eduardo
 */
public class Teste {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador();
        
        // Criar e iniciar vários processos para testar o algoritmo
        for (int i = 1; i <= 10; i++) {
            Processo processo = new Processo(i);
            new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(3000)); // Simular tempo aleatório de atraso na requisição
                    coordenador.requisitarRecurso(processo);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
        }
    }
}

