public class Main {
    public static void main(String[] args) {
        //DZ 3.6
        int age = 19;//возраст клиента
        int salary = 58_000;//зарплата клиента
        if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + salary * 2 + " рублей");}
        else if (age < 23 && salary > 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + (salary * 2 + salary / 100 * 20) + " рублей");}
        else if (age < 23 && salary > 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + (salary * 2 + salary / 100 * 50) + " рублей");}
        else if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + salary * 3 + " рублей");}
        else if (age >= 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + (salary * 3 + salary / 100 * 20) + " рублей");}
        else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с " + (salary * 3 + salary / 100 * 50) + " рублей");}

        //DZ 3.7
        int age = 25;//возраст клиента
        int salary = 60_000;//зарплата клиента
        int wantedSum = 330_000;//сумма кредита
        int creditRate = 10;//ставка по кредиту
        int monthlyPayment = salary * creditRate//ежемесячный платеж по кредиту
        if ((age < 23 && salary <= 80_000) || salary / 2 * 12 < wantedSum) {
            creditRate = creditRate + creditRate / 100 * 10;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, в кредите отказано");}
        else if ((age < 23 && salary > 80_000) || salary / 2 * 12 < wantedSum) {
            creditRate = creditRate + creditRate / 100 * 10 - creditRate / 100 *7;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, в кредите отказано");}
        else if ((age < 30 && salary <= 80_000) || salary / 2 * 12 < wantedSum) {
            creditRate = creditRate + creditRate / 100 * 5;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, в кредите отказано");}
        else if ((age < 30 && salary > 80_000) || salary / 2 * 12 < wantedSum) {
            creditRate = creditRate + creditRate / 100 * 5 - creditRate / 100 * 7;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, в кредите отказано");}
        else if ((age < 23 && salary <= 80_000) || salary / 2 * 12 >= wantedSum) {
            creditRate = creditRate + creditRate / 100 * 10;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, кредит одобрен");}
        else if ((age < 23 && salary > 80_000) || salary / 2 * 12 >= wantedSum) {
            creditRate = creditRate + creditRate / 100 * 10 - creditRate / 100 *7;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, кредит одобрен");}
        else if ((age < 30 && salary <= 80_000) || salary / 2 * 12 >= wantedSum) {
            creditRate = creditRate + creditRate / 100 * 5;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, кредит одобрен");}
        else if ((age < 30 && salary > 80_000) || salary / 2 * 12 >= wantedSum) {
            creditRate = creditRate + creditRate / 100 * 5 - creditRate / 100 *7;
            monthlyPayment = wantedSum / 12 * creditRate;
            System.out.println("Максимальный платеж при ЗП " + salary/2 + " рублей. Платеж по кредиту" + monthlyPayment + "рублей, кредит одобрен");
        }

    }
}