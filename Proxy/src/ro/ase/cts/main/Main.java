package ro.ase.cts.main;

import ro.ase.cts.clase.Moneda;
import ro.ase.cts.clase.OperatorCredite;
import ro.ase.cts.clase.OperatorCrediteProxy;

public class Main {

    public static void main(String[] args){

        OperatorCredite operatorCredite = new OperatorCredite();
        operatorCredite.creareCredit(Moneda.EUR, 4000);

        OperatorCrediteProxy operatorCrediteProxy = new OperatorCrediteProxy(operatorCredite);
        operatorCrediteProxy.creareCredit(Moneda.EUR,4000);
        operatorCrediteProxy.creareCredit(Moneda.RON,4000);

    }
}
