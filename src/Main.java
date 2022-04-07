public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int c = calc.devide.apply(a, b);
        calc.println.accept(c);


    }
}
// Делить на 0 нельзя
// Необходимо создать тернарный оператор для деления, указав, что при делении на 0 возвращаем все выражение равное 0
// иначе выполнить обычное деление. в классе Калькулятор сделано уже с иправлением функции деления.