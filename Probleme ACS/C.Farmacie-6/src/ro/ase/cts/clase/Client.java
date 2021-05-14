package ro.ase.cts.clase;

public class Client {
    private boolean reteta;
    private boolean cardSanatate;
    private  boolean disponibiliateMedicamente;

    public Client(boolean reteta, boolean cardSanatate, boolean disponibiliateMedicamente) {
        this.reteta = reteta;
        this.cardSanatate = cardSanatate;
        this.disponibiliateMedicamente = disponibiliateMedicamente;
    }

    public boolean isReteta() {
        return reteta;
    }

    public void setReteta(boolean reteta) {
        this.reteta = reteta;
    }

    public boolean isCardSanatate() {
        return cardSanatate;
    }

    public void setCardSanatate(boolean cardSanatate) {
        this.cardSanatate = cardSanatate;
    }

    public boolean isDisponibiliateMedicamente() {
        return disponibiliateMedicamente;
    }

    public void setDisponibiliateMedicamente(boolean disponibiliateMedicamente) {
        this.disponibiliateMedicamente = disponibiliateMedicamente;
    }
}
