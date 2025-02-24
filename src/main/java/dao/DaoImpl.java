package dao;

public class DaoImpl implements IDao{
    @Override
    public double getDate() {
        double temp=23;
        System.out.println("version base de données");
        return temp;
    }
}
