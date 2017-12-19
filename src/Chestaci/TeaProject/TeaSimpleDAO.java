package Chestaci.TeaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeaSimpleDAO implements TeaDAO {
    private final List<Tea> listOfTea = new ArrayList<Tea>();
    @Override
    public Long addTea(Tea tea) {
        Long id = generateTeaID();
        tea.setTeaId(id);
        listOfTea.add(tea);
        return id;
    }

    @Override
    public void updateTea(Tea tea) {
        Tea oldTea = getTea(tea.getTeaId());
        if(oldTea != null){
            oldTea.setTheNameOfTea(tea.getTheNameOfTea());
            oldTea.setCountry(tea.getCountry());
            oldTea.setGradeOfTea(tea.getGradeOfTea());
            oldTea.setSort(tea.getSort());
            oldTea.setNameOfTheTeaCompany(tea.getNameOfTheTeaCompany());
            oldTea.setTelephoneNumberOfTheTeaCompany(tea.getTelephoneNumberOfTheTeaCompany());
        }
    }

    @Override
    public void deleteTea(Long teaId) {
        for(Iterator<Tea> it = listOfTea.iterator(); it.hasNext();){
            Tea t = it.next();
            if(t.getTeaId().equals(teaId)){
                it.remove();
            }
        }
    }

    @Override
    public Tea getTea(Long teaId) {
        for(Tea tea : listOfTea){
            if(tea.getTeaId().equals(teaId)){
                return tea;
            }
        }
        return null;
    }

    @Override
    public List<Tea> findListOfTea() {
        return listOfTea;
    }

    private Long generateTeaID() {
        Long teaId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getTea(teaId) != null){
            teaId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return teaId;
    }
}
