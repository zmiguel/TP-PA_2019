package logic.mundo;

import logic.mundo.*;
import logic.states.*;

import java.io.Serializable;
import java.util.Observable;

public class Mundo extends Observable implements Serializable {
    private playerBoard PB;
    private shipBoard SB;
    private Dado dado;

    private IEstados estadoActual;

    public Mundo(){
        PB = new playerBoard();
        SB = new shipBoard();

        dado = new Dado();

        estadoActual = esperaInicio(this);

    }
}
