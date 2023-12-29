import java.util.Arrays;
import java.util.Locale;
import java.util.SortedMap;

public class Main2 {
    public static void main(String[] args) {
        // перед создание объета класса String
        //анализируются символы, если строка состоит из первыя 127 символов
        // таблицы юникод, то
        String str1 = "ivan"; /// внутри массива байт из 2 элементов иначе массив байт будет в 2 раза длиннее
        String str2 = "иван"; /// внутри массива байт зи 4 элементов
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(Arrays.toString(str2.getBytes()));

/// объеты класса Sting являются неизменными, (immutable) т.е любая попытка изменения строки приведет
/// к созданию нового объета str1[0] напрямую обратиться к конкретному элументу как с обычными массивом
        System.out.println(str1.charAt(0));
        String str3 = "ivan";

        //при подобном создании объект класса String


        System.out.println(str1 == str3);//сравнение ссылок на объект 2 ссылки на один объект

        String str4 = new String("ivan"); // при таком создании объекта лкасса String НЕ попадает
        // в String  pool ф в общую часть heap


        ///ссылка на разные объекты
        System.out.println(str1 == str4);

        //для посивного сравнения строк используют медот eqals
        System.out.println(str1.equals(str4));/// истина , так как объеты
        /// полность идьентичны

        String str5 = "Mama mila ramu";
        String[] words = str5.split(" ");//разобъет сртоку на массив строк и вернет его
        System.out.println(Arrays.toString(words));
        String str6 = "      ivan      ";
        str6 = str6.trim(); ///удаляет лидирующие пробельные символы


        System.out.println(str1 == str6); //false т.к методы создающие строки помещают их в heap


        ///str6.intern() проверяет если токая строка String poll и если есть то вернет ссылку на нее
        str6 = str6.intern();
        str3 = str3.toLowerCase();
        System.out.println(str3);
        System.out.println(str1.indexOf("va"));//проверяет входит ли подстрока в строку
        //если входит возвращает индекс первого вхождения
        //елси не входит то возвращает  -1

    }
}



