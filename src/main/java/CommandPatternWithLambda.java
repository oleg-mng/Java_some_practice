import java.util.ArrayList;
import java.util.List;

public class CommandPatternWithLambda {
    public static void main(String[] args) {
        List<Runnable> commands = new ArrayList<>();
        commands.add(() -> System.out.println("Command 1 running"));
        commands.add(() -> System.out.println("Command 2 running"));
        commands.add(() -> System.out.println("Command 3 running"));

        executeCommands(commands);
    }
    private static void executeCommands(List<Runnable> com){
        for (Runnable runnable : com) {
            runnable.run();

        }
    }
}
