//package seminar4;
//
//public class taskk {
//}
//    private static long timer(Runnable runnable) {
//        // UNIX-время
//        long start = System.currentTimeMillis(); // количество милисекунд, которые прошли с 01.01.1970г по UTC0
//        runnable.run();
//        long end = System.currentTimeMillis();
//        return end - start;
//    }
//
//20:26
//private static void timerAddFirst() {
//        int count = 100_000;
//
//        // Хочу замерить время добавления 100_000 элементов в начало списков
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Runnable arrayListRunnable = new Runnable() {
//@Override
//public void run() {
//        for (int i = 0; i < count; i++) {
//        arrayList.add(0, i);
//        }
//        }
//        };
//        long arrayListTimer = timer(arrayListRunnable);
//        System.out.println("Время добавления " + count + " элементов в начало ArrayList: " + arrayListTimer);
//
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        Runnable linkedListRunnable = new Runnable() {
//@Override
//public void run() {
//        for (int i = 0; i < count; i++) {
//        linkedList.add(0, i);
//        }
//        }
//        };
//        long linkedListTimer = timer(linkedListRunnable);
//        System.out.println("Время добавления " + count + " элементов в начало LinkedList: " + linkedListTimer);
//        }
//
//
//public static void main(String[] args) {
//        /*
//           Реализовать консольное приложение, которое:
//           1. Принимает от пользователя строку вида text~num
//           2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//           3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//           4. Если введено exit, то завершаем программу
//
//
//           java~2
//           python~5
//           print~2 -> java
//           print~5 -> python
//           print~5 -> Некорректный индекс!
//         */
//
//        LinkedList<String> storage = new LinkedList<>();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//        String command = scanner.nextLine();
//        if ("exit".equals(command)) {
//        break;
//        }
//
//        String[] arguments = command.split("~");
//        if (arguments.length != 2) {
//        System.err.println("Некорректный ввод");
//        continue;
//        }
//
//        String text = arguments[0];
//        int num = -1;
//        try {
//        num = Integer.parseInt(arguments[1]);
//        } catch (NumberFormatException e) {
//        System.err.println("Некорркетный ввод");
//        continue;
//        }
//
//        if ("print".equals(text)) {
//        if (num < 0 || num >= storage.size()) {
//        System.err.println("Некорректный индекс");
//        continue;
//        }
//
//        String element = storage.remove(num);
//        if (element != null) {
//        System.out.println(element);
//        } else {
//        System.err.println("Некорректный индекс");
//        }
//        } else {
//        while (storage.size() < num) {
//        storage.add(null);
//        }
//        storage.add(num, text);
//        }
//        }
//
//        System.out.println("Программа завершена");
//        }
//
//public static void main(String[] args) {
//        Path file = Path.of("file.txt");
//        if (Files.notExists(file)) {
//        try {
//        Files.createFile(file);
//        } catch (IOException e) {
//        System.err.println("Не удалось создать файл: " + e.getMessage());
//        return;
//        }
//        }
//
//        String output = "Hello, Igor! It's " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        try (OutputStream outputStream = Files.newOutputStream(file)) {
//        outputStream.write(output.getBytes(StandardCharsets.UTF_8));
//        outputStream.flush();
//        } catch (IOException e) {
//        System.err.println("Не удалось записать данные в файл: " + e.getMessage());
//        return;
//        }
//        System.out.println("Данные успешно записаны в файл");
//
//        String input;
//        try (InputStream inputStream = Files.newInputStream(file)) {
//        input = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
//        } catch (IOException e) {
//        System.err.println("Не удалось прочитать данные из файла: " + e.getMessage());
//        return;
//        }
//        System.out.println("Данные успешно прочитаны из файла: " + input);
//
//        // InputStream, OutputStream - bytes
//        // Reader, Writer - symbols
//
//        }