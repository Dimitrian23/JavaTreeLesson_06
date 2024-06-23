package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class AddHuman extends  Command{

    @Override
    public void execute(){
        consoleUI.finish();
    }

    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "добавить человека";
    }
}
