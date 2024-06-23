package family_tree.presenter;

import family_tree.model.service.Service;
import family_tree.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addHuman(name, age);
        //какой-то ответ
        getStudentsListInfo();
    }

    public void getStudentsListInfo() {
        String info = service.getHumanInfo();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentsListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentsListInfo();
    }
}