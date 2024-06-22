/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exl07;

/**
 *
 * @author Eduardo
 */
public class Processo {
    private final int id;
    private long tempoRequisicao;
    private long tempoConcessao;
    private long tempoLiberacao;

    public Processo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public long getTempoRequisicao() {
        return tempoRequisicao;
    }

    public void setTempoRequisicao(long tempoRequisicao) {
        this.tempoRequisicao = tempoRequisicao;
    }

    public long getTempoConcessao() {
        return tempoConcessao;
    }

    public void setTempoConcessao(long tempoConcessao) {
        this.tempoConcessao = tempoConcessao;
    }

    public long getTempoLiberacao() {
        return tempoLiberacao;
    }

    public void setTempoLiberacao(long tempoLiberacao) {
        this.tempoLiberacao = tempoLiberacao;
    }
}
