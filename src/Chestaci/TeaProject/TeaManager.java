package Chestaci.TeaProject;


import java.util.List;

public class TeaManager {
    private TeaDAO dao;

    public TeaManager() {
        dao = TeaDAOFactory.getTeaDAO();
    }

    //добавление чая - возвращает ID добавленного чая
    public Long addTea(Tea tea){
        return dao.addTea(tea);
    }

    //редактирования чая
    public void updateTea(Tea tea){
        dao.updateTea(tea);
    }

    //удаление чая по его ID
    public void deleteTea(Long teaID){
        dao.deleteTea(teaID);
    }

    //получение одного чая
    public Tea getTea(long teaID){
        return dao.getTea(teaID);
    }

    //получение списка чая
    public List<Tea> findListOfTea(){
        return dao.findListOfTea();
    }
}
