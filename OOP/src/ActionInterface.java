package OOP.OOP.src;

import OOP.OOP.Heroes.TemplatePerson;

import java.util.ArrayList;

//Интерфейс взаимодействия персонажей

public interface ActionInterface {
    //Один шаг действия персонажа
    public void step(ArrayList<TemplatePerson> enemies, ArrayList<TemplatePerson> teammates);
}