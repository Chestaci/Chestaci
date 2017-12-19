package Chestaci.TeaProject;

public class TeaDAOFactory {
    public static TeaDAO getTeaDAO() {
    return new TeaSimpleDAO();
    }
}