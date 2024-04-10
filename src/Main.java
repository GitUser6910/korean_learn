import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Random rand = new Random();
        String[] fruitsArr = {
                "사과 - яблоко",
                "배 - груша",
                "바나나 - банан",
                "포도 - виноград",
                "오렌지 - апельсин",
                "레몬 - лимон",
                "자몽 (그레이프프루트) - грейпфрут, помело",
                "귤 - мандарин",
                "석류 (성뉴) - гранат",
                "복숭아 - персик",
                "살구 - абрикос",
                "자두 - слива",
                "체리 - вишня, черешня",
                "딸기 - клубника",
                "수박 - арбуз",
                "멜론 - дыня",
                "참외 - дынька(маленькая восточная дыня)",
                "감 - хурма",
                "키위 - киви",
                "파인애플 - ананас",
                "파파야 - папайя",
                "망고 - манго",
                "무화과 - инжир",
                "망고스틴 - мангостин"
        };
        String[] fruitsQuiz = {
                "яблоко",
                "груша",
                "банан ",
                "виноград",
                "апельсин",
                "лимон",
                "грейпфрут, помело",
                "мандарин",
                "гранат",
                "персик",
                "абрикос",
                "слива",
                "вишня, черешня",
                "клубника",
                "арбуз",
                "дыня",
                "дынька(маленькая восточная дыня)",
                "хурма",
                "киви",
                "ананас",
                "папайя",
                "манго",
                "инжир",
                "мангостин"
        };
        System.out.println("Корейский язык");
        System.out.println("--------------\n");
        System.out.println("1 - Викторина");
        System.out.println("2 - Тренеровка письма");
        System.out.print("--Введите вариант: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 2:
                System.out.println("1 - Фрукты");
                System.out.println("2 - Овощи");
                System.out.print("Введите тему: ");
                int quiz = scanner.nextInt();
                scanner.nextLine();
                switch (quiz) {
                    case 1:
                        System.out.println("Нажимайте 'Enter' после каждого слова если вы его запомнили");
                        for (int i = 0; i < fruitsArr.length; i++) {
                            System.out.print(fruitsArr[i]);
                            scanner.nextLine();
                        }
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("А теперь викторина. Удачи!");
                        for (int i = 0; i < fruitsQuiz.length; i++) {
                            System.out.print(fruitsQuiz[i] + " - ");
                            String quizVal = scanner.nextLine();
                            String koreanWord = fruitsArr[i].split(" - ")[0];
                            if (quizVal.equalsIgnoreCase(koreanWord)) {
                                System.out.println("Правильно");
                            } else {
                                System.out.println("Ошибка");
                            }
                        }
                        break;
                }
                break;
        }
        scanner.nextLine();
    }

    private static void clearScreen() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}