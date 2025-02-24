package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("version web service");
        double tem=10;
        return tem;
    }
}
