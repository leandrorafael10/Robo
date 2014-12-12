/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.funcoes;

import com.robo.Robo;

/**
 *
 * @author LEANDRO
 */
public class MoverRobo {
    
    private Robo r;

    public MoverRobo() {
        this.r = new Robo();
    }

    
    /*
     direcao =0 norte;
     direcao =1 leste;
     direcao = 2 sul;
     direcao = 3 oeste;
     */
    private void girar( String direcao) {
        switch (direcao) {
            case "R":
                r.setDirecao(r.getDirecao() + 1);
                if (r.getDirecao() > 3) {
                    r.setDirecao(0);
                }
                break;
            case "L":
                r.setDirecao(r.getDirecao() - 1);
                if (r.getDirecao() < 0) {
                    r.setDirecao(3);
                }
                break;

        }
    }

    public Robo mover( String m) {
        int i = m.length();
        for (int j = 0; j < m.length(); j++) {
            if (String.valueOf(m.charAt(j)).equals("M")) {
                movimentar(String.valueOf(m.charAt(j)));
            } else {
                girar(String.valueOf(m.charAt(j)));
            }
        }
        return this.r;

    }

    private void movimentar( String m) {
        
        switch (r.getDirecao()) {
            case 0:
                r.getPosicao().setY(r.getPosicao().getY() + 1);
                break;
            case 1:
                r.getPosicao().setX(r.getPosicao().getX() + 1);
                break;
            case 2:
                r.getPosicao().setY(r.getPosicao().getY() - 1);
                break;
            case 3:
                r.getPosicao().setX(r.getPosicao().getX() - 1);
                break;
        }

    }
    public static String nome_direcao(int dir){
        String d = "";
        switch(dir){
            case 0:d = "N";
                break;
            case 1:d = "E";
                break;
            case 2:d = "S";
                break;
            case 3:d = "O";
                break;
        }
        return d;
    }

    public Robo getR() {
        return r;
    }

    public void setR(Robo r) {
        this.r = r;
    }
    
    

}
