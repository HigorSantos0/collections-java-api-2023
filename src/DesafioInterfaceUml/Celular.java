package DesafioInterfaceUml;

import DesafioInterfaceUml.AparelhoTelefonicoFuncao.AparelhoTelefonico;
import DesafioInterfaceUml.NavegadorNaInternet.NavegadorDeInternet;
import DesafioInterfaceUml.ReprodutoMusical.ReprodutorMusical;

public class Celular implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    public void atendeLigaCorreio() {
        System.out.println("Testando!");
    }

    public void NavegadorDeInternet() {
        System.out.println("testanto navegador!");
    }

    public void ReprodutorMusical() {
        System.out.println("testando reprodutor!");
    }

    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.atendeLigaCorreio();
        celular.NavegadorDeInternet();
        celular.ReprodutorMusical();
    }

}