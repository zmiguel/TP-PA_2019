package ui;

import logic.states.*;
import logic.mundo.*;
import logic.player.*;

import java.io.*;
import java.util.*;


public class Text implements Serializable {
    Mundo m;
    boolean sair;
    private Scanner sc;

    public Text() {
        m = new Mundo();
        sair = false;
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.run();
    }

    private void run() {
        while (!sair) {
            IEstados estado = m.getEstado();

            if (estado instanceof EsperaInicio) {
                jogoNovo();
            } else if (estado instanceof EsperaCarta) {
                cartaVirada();
            } else if (estado instanceof AguardaAcao) {
                processaAcoes();
            } else if (estado instanceof FinalDoDia) {
                fimDoDia();
            } else if (estado instanceof JogoTerminado) {
                fimDoJogo();
                sair = true;
            }
        }
    }

    public void jogoNovo() {
        showMenu();

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    //m.jogo();
                    break;
                case 2:
                    //continuar();
                    break;
                case 3:
                    System.exit(0);
            }
        } else {
            sc.next();
        }
    }

    public void showMenu(){
            System.out.println("Destination Earth!!!");
            System.out.println("[1] - Novo Jogo");
            System.out.println("[2] - Continuar Save");
            System.out.println("[3] - Sair");
        System.out.print("> ");
    }
}
