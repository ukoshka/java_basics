import java.util.function.Function;

public class LambdaTester {
    public static void main(String[] args) {
        System.out.println(modifyString("Alisa", String::toUpperCase));
        System.out.println(modifyString("Tom", String::toLowerCase));
        System.out.println(modifyString("Alisa", name -> String.valueOf(name.charAt(0))));
        System.out.println(modifyString("Tom", name -> String.valueOf(name.charAt(name.length() - 1))));
        System.out.println("==============================");

        System.out.println(convertString("Alisa", String::length));
        //System.out.println(convertString("Tom", name -> name.length()));

        System.out.println(convertString("Tom and Alisa", LambdaTester::wordsCount));

    }

    public static String modifyString(String arg, Function<String, String> func) {
        return func.apply(arg);
    }

    public static Integer convertString(String arg, Function<String, Integer> func) {
        return func.apply(arg);
    }

    public static Integer wordsCount(String arg) {
        int spaces = 0;
        for (int i = 0; i < arg.length(); i++) {
            if (String.valueOf(arg.charAt(i)).equals(" ")){
                spaces++;
            }
        }
        return (spaces + 1);
    }

}
