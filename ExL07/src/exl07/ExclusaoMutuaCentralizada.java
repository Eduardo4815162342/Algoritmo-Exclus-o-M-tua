/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exl07;

/**
 *
 * @author Eduardo
 */
import java.util.Random;

public class ExclusaoMutuaCentralizada {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador();
        for (int i = 1; i <= 5; i++) {
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

