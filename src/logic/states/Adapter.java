package logic.states;

import java.io.Serializable;
import logic.mundo.*;

public class Adapter implements IEstados, Serializable {
    protected Mundo mundo;

    public Adapter(Mundo mundo){
        this.mundo = mundo;
    }

    public Mundo getMundo(){
        return mundo;
    }

    @Override
    public IEstados ProximoEstado(){
        return this;
    }

    @Override
    public IEstados FimDeJogo(){
        return this;
    }
}
