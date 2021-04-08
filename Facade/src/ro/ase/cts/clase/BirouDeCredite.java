package ro.ase.cts.clase;

 class BirouDeCredite {
    public static boolean areDatorie(Persoana persoana){
       return Integer.parseInt( persoana.getCnp().charAt(11)+"")% 2 == 0;
    }
}
