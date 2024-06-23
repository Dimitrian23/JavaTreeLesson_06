package family_tree.model.entity;

import family_tree.model.tree.FamilyTree;

public class Human implements Comparable<Human> , FamilyTree {

    private int id;
    private String name;
    private int age;

    public Human(int i, String name, int age) {
        this.id = i;

        this.name = name;

        this.age = age;
    }


    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }





    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.getName());
    }

}