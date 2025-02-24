package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("met")

//@Service("met")
public class MetierImpl implements IMetier{
    //@Autowired
    private IDao dao ;


    public MetierImpl( @Qualifier("dao2")  IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {}

    @Override
    public double calcul() {
        double x=20;
        double t=dao.getDate();
        double res=t*x;
        return res;
    }


    public void setDao(IDao iDao){
        this.dao=iDao;
    }
}
