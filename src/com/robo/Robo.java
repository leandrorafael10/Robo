/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robo;

import com.coordenadas.Posicao;

/**
 *
 * @author LEANDRO
 */
public class Robo {

    private String nome;

    //posicao no grid
    private Posicao posicao;
    //direcao que ele aponta
    private int direcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Robo() {
        this.direcao = 0;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

}
