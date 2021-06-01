import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    @Test
    public void test() {
        System.out.println("testtestetstest");
    }

    //дэзэ: ввести 2 числа, разделить одно на другое. обработать исключение, которое возникает при попытке
    // разделить на ноль, чтобы выводился не только стектрейс, но и комментарий от вас .
    @Test
    public void year() {
        String text = text();
        String year = text.replaceAll("\\d{4}", "2021");
        System.out.println(year);

    }

    @Test
    public void monthChislo() {
        String text = text();
        String month = text.replaceAll("(?<=\\d{2}\\.)\\d{2}(?=\\.\\d{4})", "05");
        System.out.println(month);
    }

    @Test
    public void monthStroka() {
        String text = text();
        //String month = text.replaceAll("\\sмарта\\s(?=\\d{4})", ".05.");
        //System.out.println(month);
        Map<String, String> months = new HashMap<>();
        months.put("01", "января");
        months.put("02", "февраля");
        months.put("03", "марта");
        months.put("04", "апреля");
        months.put("05", "мая");
        months.put("06", "июня");
        months.put("07", "июля");
        months.put("08", "августа");
        months.put("09", "сентября");
        months.put("10", "октября");
        months.put("11", "ноября");
        months.put("12", "декабря");
        for (String key : months.keySet()) {
                text = text.replaceAll("\\s" + months.get(key) + "\\s(?=\\d{4})", "\\." + key + "\\.");
        }
        System.out.println(text);

    }

    @Test
    public void day() {
        String text = text();
        String day = text.replaceAll("\\d{2}(?=\\.\\d{2}\\.\\d{4})", "31");
        System.out.println(day);
    }

    static String text() {
        String text = "При написании даты используются арабские цифры (пара цифр для обозначения числа, пара цифр для месяца и четыре цифры для обозначения года), разделительный знак — точка:\n" +
                "27.08.2007,\n" +
                "01.09.2007.\n" +
                "Возможно также буквенно-цифровое обозначение даты: 5 марта 1999 г., 1 сентября 2007 г.\n" +
                "Цифровой способ\n" +
                "\n" +
                "Цифровой способ является наиболее экономичным, поскольку сокращает длину написания даты и может одновременно служить кодом при обработке документов. Элементы даты приводятся одной строкой арабскими цифрами, отделенными точками, без переносов в такой последовательности: число, месяц, год. День месяца и месяц оформляются двумя парами арабских цифр (через точку), год – четырьмя арабскими цифрами: Например:\n" +
                "\n" +
                "01.09.2012.\n" +
                "Словесно-цифровой способ\n" +
                "\n" +
                "Словесно-цифровой способ имеет несколько разновидностей. На документах со сведениями финансового характера предыдущий пример выглядит следующим образом:\n" +
                "\n" +
                "01 сентября 2012 года или 01 декабря 2012 г.";
        return text;
    }
}
