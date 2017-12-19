package Chestaci.TeaProject;


import java.util.List;

public interface TeaDAO {
    //Добавление чая - возвращает ID добавленного чая
    public Long addTea(Tea tea);
    //Редактирование чая
    public void updateTea(Tea tea);
    //Удаление чая по Id
    public void deleteTea(Long teaId);
    //Получение чая
    public Tea getTea(Long teaId);
    //Получение списка чая
    public List<Tea> findListOfTea();

}
