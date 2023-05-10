import java.util.ArrayList;
import java.util.List;

public class CommandPatternWithLambda {
    double x = 9.97;
    int xy = (int) x;

    public static void main(String[] args) {
        int l = 32;
        int k = 31;
        enum q {on, off}
        ;
        List<Runnable> commands = new ArrayList<>();
        commands.add(() -> System.out.println("Command 1 running"));
        commands.add(() -> System.out.println("Command 2 running"));
        commands.add(() -> System.out.println("Command 3 running"));

        Enum<q> s = l < k ? q.on : q.off;
        System.out.println(s);

        executeCommands(commands);
    }


    private static void executeCommands(List<Runnable> com) {
        for (Runnable runnable : com) {
            runnable.run();

        }
    }

}

