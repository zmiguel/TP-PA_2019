package logic.mundo;

public class shipBoard {
    private int TotalAliens;
    private int AliensEmJogo;


    public shipBoard(){
        this.TotalAliens = 15;
        this.AliensEmJogo = 0;
    }

    public int getAliensEmJogo() {
        return AliensEmJogo;
    }

    public int getTotalAliens() {
        return TotalAliens;
    }

    public void setAliensEmJogo(int aliensEmJogo) {
        AliensEmJogo = aliensEmJogo;
    }
}
