package pest;

import dao.DaoImpl;
import metier.MetierImpl;

public class prestV1 {
    //l'injection des dépendances  Par instanciation statique
    public static void main(String[] args) {
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl();

        metier.setDao(d);
        System.out.println(metier.calcul());
    }
}
