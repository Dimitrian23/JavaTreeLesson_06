package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class SortByName extends Command{
    @Override
    public void execute(){
        consoleUI.finish();
    }

    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по имени";
    }
}
