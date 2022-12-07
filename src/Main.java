public class Main {
    public static void main(String[] args) {
        int cost=2348;           // стоимость билета
        int x=20;                // делитель для вычисление миль
        int miles=cost/x;        // вычисление бесплатных миль


        System.out.println("Здравствуйте!");
        System.out.println("Вас приветствует программа расчёт бесплатных миль.");

        System.out.println("Стоимость вашего билета "+ cost +" рублей.");
        System.out.println("При покупке данного билета, вам будет начисленно "+ miles+ " бесплатных миль!");
    }
}