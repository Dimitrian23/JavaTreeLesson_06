package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class SortByAge extends  Command{
    @Override
    public void execute(){
        consoleUI.finish();
    }

    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по возрасту";
    }
}
