package family_tree.model.service;

import family_tree.model.entity.Human;
import family_tree.model.tree.HumanGroup;

public class Service {
    private int idStudent;
    private HumanGroup<Human> group;

    public Service() {
        group = new HumanGroup<>();
    }

    public void addHuman(String name, int age){
        Human human = new Human(idStudent++, name, age);
        group.addHuman(human);
    }

    public String getHumanInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список людей:\n");


        for (Human student: group){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        group.sortByName();
    }

    public void sortByAge(){
        group.sortByAge();
    }
}