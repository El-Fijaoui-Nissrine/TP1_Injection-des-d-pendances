package ext;

import dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getDate() {
        System.out.println("version web service");
        double tem=10;
        return tem;
    }
}
