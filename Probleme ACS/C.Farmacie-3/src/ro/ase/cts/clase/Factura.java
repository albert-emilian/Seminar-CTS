package ro.ase.cts.clase;

public class Factura {
    private int numarPungi;
    private boolean cerePungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private float cotaTVA;
    private boolean platitotTVA;


    public Factura() {
        this.numarPungi = 0;
        this.cerePungi = false;
        this.plataCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0;
        this.platitotTVA = false;
    }

    public int getNumarPungi() {
        return numarPungi;
    }

    public boolean isCerePungi() {
        return cerePungi;
    }

    public boolean isPlataCard() {
        return plataCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public float getCotaTVA() {
        return cotaTVA;
    }

    public boolean isPlatitotTVA() {
        return platitotTVA;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setCerePungi(boolean cerePungi) {
        this.cerePungi = cerePungi;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", cerePungi=").append(cerePungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append(", platitotTVA=").append(platitotTVA);
        sb.append('}');
        return sb.toString();
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public void setPlatitotTVA(boolean platitotTVA) {
        this.platitotTVA = platitotTVA;
    }
}
