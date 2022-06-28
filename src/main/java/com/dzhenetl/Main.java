package com.dzhenetl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(m + 1));
        }

        System.out.println("Вот случайный список: " + numbers);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);
        List<Integer> filteredNumbers = filter.filterOut(numbers);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredNumbers);

        logger.log("Завершаем программу");
    }
}
