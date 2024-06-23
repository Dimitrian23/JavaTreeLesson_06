package family_tree.view.commands;

import family_tree.view.ConsoleUI;

public class GetHumanInfo extends Command {
    @Override
    public void execute(){
        consoleUI.finish();
    }

    public GetHumanInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список людей";
    }
}
