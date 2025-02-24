package pest;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class prestV2 {
    public static void main(String[] args) {
        //instanciation dynamique
        try {
            Scanner sc=new Scanner(new File("config.txt"));
            String daocla=sc.nextLine();
            Class cdao=Class.forName(daocla);
            IDao od=(IDao) cdao.getConstructor().newInstance();
            String mt=sc.nextLine();
            Class cmt=Class.forName(mt);
            IMetier m=(IMetier) cmt.getConstructor(IDao.class).newInstance(od);

            System.out.println(m.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
