import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean isStopped = false;
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
                "банан",
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
        String[] vegetablesArr = {
                "가지 - баклажан",
                "콩 - фасоль",
                "완두콩 - горох",
                "양배추 - капуста",
                "감자 - картофель",
                "양파 - лук",
                "당근 - морковь",
                "오이 - огурец",
                "후추 - перец",
                "파슬리 - петрушка",
                "토마토 - помидор",
                "무 - редис",
                "사탕무우 - свекла",
                "셀러리 - сельдерей",
                "호박 - тыква",
                "딜 - укроп",
                "콩 - фасоль",
                "마늘 - чеснок",
                "밤색 - щавель"
        };
        String[] vegetablesQuiz = {
                "баклажан",
                "фасоль",
                "горох",
                "капуста",
                "картофель",
                "лук",
                "морковь",
                "огурец",
                "перец",
                "петрушка",
                "помидор",
                "редис",
                "свекла",
                "сельдерей",
                "тыква",
                "укроп",
                "фасоль",
                "чеснок",
                "щавель"
        };
        try {
            System.out.println("Корейский язык");
            System.out.println("--------------");
            System.out.println("1 - Викторина");
            System.out.println("2 - Тренеровка письма");
            System.out.print("--Введите вариант: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
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
                            List<String> wordsFruits = new ArrayList<>(List.of(fruitsQuiz));
                            for (int j = 0; j < fruitsQuiz.length; j++) {
                                List<String> fruitsOptions = new ArrayList<>();
                                fruitsOptions.add(fruitsArr[j].split(" - ")[0]); // Правильный ответ

                                // Добавление двух случайных неправильных ответов
                                while (fruitsOptions.size() < 3) {
                                    int randomIndex = rand.nextInt(fruitsArr.length);
                                    String randomWord = fruitsArr[randomIndex].split(" - ")[0];
                                    if (!fruitsOptions.contains(randomWord) && !wordsFruits.get(j).equals(randomWord)) {
                                        fruitsOptions.add(randomWord);
                                    }
                                }

                                // Перемешивание вариантов ответов
                                Collections.shuffle(fruitsOptions, rand);

                                System.out.println("--" + fruitsQuiz[j]);
                                for (int i = 0; i < fruitsOptions.size(); i++) {
                                    System.out.println((i + 1) + " - " + fruitsOptions.get(i));
                                }
                                System.out.print("Ваш ответ: ");
                                int answer = scanner.nextInt();
                                scanner.nextLine();
                                if (fruitsOptions.get(answer - 1).equals(fruitsArr[j].split(" - ")[0])) {
                                    System.out.println("Правильно\n");
                                } else {
                                    System.err.println("Ошибка\n");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Нажимайте 'Enter' после каждого слова если вы его запомнили");
                            for (int i = 0; i < vegetablesArr.length; i++) {
                                System.out.print(vegetablesArr[i]);
                                scanner.nextLine();
                            }
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("А теперь викторина. Удачи!");
                            List<String> wordsVegetables = new ArrayList<>(List.of(vegetablesQuiz));
                            for (int j = 0; j < vegetablesQuiz.length; j++) {
                                List<String> VegetablesOptions = new ArrayList<>();
                                VegetablesOptions.add(vegetablesArr[j].split(" - ")[0]); // Правильный ответ

                                // Добавление двух случайных неправильных ответов
                                while (VegetablesOptions.size() < 3) {
                                    int randomIndex = rand.nextInt(vegetablesArr.length);
                                    String randomWord = vegetablesArr[randomIndex].split(" - ")[0];
                                    if (!VegetablesOptions.contains(randomWord) && !wordsVegetables.get(j).equals(randomWord)) {
                                        VegetablesOptions.add(randomWord);
                                    }
                                }

                                // Перемешивание вариантов ответов
                                Collections.shuffle(VegetablesOptions, rand);

                                System.out.println("--" + vegetablesQuiz[j]);
                                for (int i = 0; i < VegetablesOptions.size(); i++) {
                                    System.out.println((i + 1) + " - " + VegetablesOptions.get(i));
                                }
                                System.out.print("Ваш ответ: ");
                                int answer = scanner.nextInt();
                                scanner.nextLine();
                                if (VegetablesOptions.get(answer - 1).equals(vegetablesArr[j].split(" - ")[0])) {
                                    System.out.println("Правильно\n");
                                } else {
                                    System.err.println("Ошибка\n");
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - Фрукты");
                    System.out.println("2 - Овощи");
                    System.out.print("Введите тему: ");
                    int quizWrite = scanner.nextInt();
                    scanner.nextLine();
                    switch (quizWrite) {
                        case 1:
                            System.out.println("Нажимайте 'Enter' после каждого слова если вы его запомнили");
                            for (int i = 0; i < fruitsArr.length; i++) {
                                System.out.print(fruitsArr[i]);
                                scanner.nextLine();
                            }
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("А теперь письменное закрепление материала. Удачи!");
                            // scanner.close();
                            for (int i = 0; i < fruitsArr.length; i++) {
                                String[] pair = fruitsArr[i].split(" - ");
                                String koreanWord = pair[0];
                                String russianWord = pair[1];
                                System.out.print(russianWord + " - ");
                                String userInput = scanner.nextLine();

                                if (userInput.equalsIgnoreCase(koreanWord)) {
                                    System.out.println("Правильно");
                                } else {
                                    System.out.println("Ошибка. Правильный ответ: " + koreanWord);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Нажимайте 'Enter' после каждого слова если вы его запомнили");
                            for (int i = 0; i < vegetablesArr.length; i++) {
                                System.out.print(vegetablesArr[i]);
                                scanner.nextLine();
                            }
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("А теперь письменное закрепление материала. Удачи!");
                            // scanner.close();
                            for (int i = 0; i < vegetablesArr.length; i++) {
                                String[] pair = vegetablesArr[i].split(" - ");
                                String koreanWord = pair[0];
                                String russianWord = pair[1];
                                System.out.print(russianWord + " - ");
                                String userInput = scanner.nextLine();

                                if (userInput.equalsIgnoreCase(koreanWord)) {
                                    System.out.println("Правильно");
                                } else {
                                    System.out.println("Ошибка. Правильный ответ: " + koreanWord);
                                }
                            }
                            break;
                    }
                    break;
                default:
                    System.err.println("Вы ввели неверный вариант");
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("Введите достоверные данные!");
        }

        // scanner.nextLine();
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