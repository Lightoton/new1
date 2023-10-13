package de.telran.lesson4;

public class test {
    public static class StringExample {
        public  void main(String[] args) {
            // Создаем строку с оператором new
            String myString = new String("Пример строки, созданной через new.");

            // Вызываем метод, передавая в него созданную строку
            processString(myString);
        }

        // Метод, принимающий строку в качестве параметра
        public static void processString(String inputString) {
            // В данном методе вы можете выполнять операции с переданной строкой
            System.out.println("Получена строка: " + inputString);
        }
    }


}
