public class Main {
    public static void main(String[] args) {
        int cost = 2348;         // стоимость билета
        int counter = 20;            // счёт для вычисление миль
        int miles = cost / counter;    // вычисление бесплатных миль


        System.out.println("Здравствуйте!");
        System.out.println("Вас приветствует программа расчёт бесплатных миль.");

        System.out.println("Стоимость вашего билета " + cost + " рублей.");
        System.out.println("При покупке данного билета, вам будет начисленно " + miles + " бесплатных миль!");
    }
}