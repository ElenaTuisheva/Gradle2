
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
//дэзэ: ввести 2 числа, разделить одно на другое. обработать исключение, которое возникает при попытке
//разделить на ноль, чтобы выводился не только стектрейс, но и комментарий от вас .
//усложнение: найдите, что такое перечисление, ENUM и сделайте перечисление месяц цифрами - месяц словами в
// родительном падеже (марта, сентября и пр.).
//и поменяйте в тексте во всех датах месяцев названия на месяцы в цифровом отображении.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число");
//        int b = scanner.nextInt();
//        try {
//            if (b == 0) {
//                throw new ArithmeticException("На 0 делить нельзя");
//            }
//            int c = a / b;
//            System.out.println("Результат деления: ");
//            System.out.println(c);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        String[] months = {"января","февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        String text = "При написании даты используются арабские цифры (пара цифр для обозначения числа, пара цифр для месяца и четыре цифры для обозначения года), разделительный знак — точка:\n" +
                "27.08.2007,\n" +
                "01.09.2007.\n" +
                "Возможно также буквенно-цифровое обозначение даты: 5 марта 1999 г., 1 сентября 2007 г.\n" +
                "Цифровой способ\n" +
                "Цифровой способ является наиболее экономичным, поскольку сокращает длину написания даты и может одновременно служить кодом при обработке документов. Элементы даты приводятся одной строкой арабскими цифрами, отделенными точками, без переносов в такой последовательности: число, месяц, год. День месяца и месяц оформляются двумя парами арабских цифр (через точку), год – четырьмя арабскими цифрами: Например:\n" +
                "01.09.2012.\n" +
                "Словесно-цифровой способ\n" +
                "Словесно-цифровой способ имеет несколько разновидностей. На документах со сведениями финансового характера предыдущий пример выглядит следующим образом:\n" +
                "01 сентября 2012 года или 01 сентября 2012 г.";
       // year(text);
       // monthChislo(text);
        monthStroka(text);
       // day(text);
//        Month mes = text.matchAll("(?<=\\d{2}\\.)\\d{2}(?=\\.\\d{4})");
//
//        Integer i = Integer.parseInt(("(?<=\\d{2}\\.)\\d{2}(?=\\.\\d{4})"));
//        System.out.println(i);


      //  for(String month: Month){}


        System.out.println(Month.February.ordinal());
    }

    static void year(String textYear) {
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(textYear);
        String yearResult = matcher.replaceAll("2021");
        System.out.println(yearResult);
    }

    static void monthChislo(String textMonth) {
        Pattern patternMonth = Pattern.compile("(?<=\\d{2}\\.)\\d{2}(?=\\.\\d{4})");
        Matcher matcherMonth = patternMonth.matcher(textMonth);
        String monthResult = matcherMonth.replaceAll("05");
        System.out.println(monthResult);
    }

    static void monthStroka(String textMonth) {
        Pattern patternMonth = Pattern.compile("\\sмарта\\s(?=\\d{4})");
        Matcher matcherMonth = patternMonth.matcher(textMonth);
        String monthResult = matcherMonth.replaceAll(".05.");
        System.out.println(monthResult);
    }

    static void day(String textDay) {
        Pattern patternDay = Pattern.compile("\\d{2}(?=\\.\\d{2}\\.\\d{4})");
        Matcher matcherDay = patternDay.matcher(textDay);
        String dayResult = matcherDay.replaceAll("19");
        System.out.println(dayResult);
    }
}
enum Month{
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}