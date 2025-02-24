package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao ;
    @Override
    public double calcul() {
        double x=20;
        double t=dao.getDate();
        double res=t*x;
        return res;
    }


}
