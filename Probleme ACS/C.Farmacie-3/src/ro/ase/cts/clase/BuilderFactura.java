package ro.ase.cts.clase;

import java.util.Locale;

public class BuilderFactura implements IBuilder{

    private Factura factura;


    public BuilderFactura() {
        this.factura = new Factura();
    }

    public BuilderFactura setNumarPungi(int numarPungi) {
        this.factura.setNumarPungi(numarPungi);
        return this;
    }

    public BuilderFactura setCerePungi(boolean cerePungi) {
        this.factura.setCerePungi(cerePungi);
        return this;
    }

    public BuilderFactura setPlataCard(boolean plataCard) {
        this.factura.setPlataCard(plataCard);
        return this;
    }

    public BuilderFactura setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public BuilderFactura setCotaTVA(float cotaTVA) {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

    public BuilderFactura setPlatitotTVA(boolean platitotTVA) {
        this.factura.setPlatitotTVA(platitotTVA);
        return this;
    }




    @Override
    public Factura build() {
        return this.factura;
    }
}
