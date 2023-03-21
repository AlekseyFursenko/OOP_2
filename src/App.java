import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        ConsoleView view = new ConsoleView();
        Presenter presenter = new Presenter(view);
        Model.darkBand();
        Model.whiteBand();
        ConsoleView.view();

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            presenter.step();
            System.out.println("Press any key");
            in.nextLine();
            }

        }
    }
