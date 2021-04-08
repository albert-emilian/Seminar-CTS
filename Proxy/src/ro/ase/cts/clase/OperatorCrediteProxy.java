package ro.ase.cts.clase;

public class OperatorCrediteProxy implements IOperatorCredite{

    private OperatorCredite operatorCredite;

    public OperatorCrediteProxy(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        if(moneda == Moneda.RON){
            operatorCredite.creareCredit(moneda,suma);
        }else{
            System.out.println("Banca ofera credite doar in RON");
        }
    }
}
