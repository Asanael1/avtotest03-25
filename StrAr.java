public class StrAr {

    public static void main(String[] args) {

        String[] array = {"привет", "ПОКА", "гипербола"};

        System.out.println(array[0].toUpperCase());
        System.out.println(array[1].toLowerCase());

        // Задание 3
        for (String str : array) {
            if (str.length() > 1 && (str.charAt(1) == 'о' || str.charAt(1) == 'О')) {
                String modifiedStr = str.substring(0, 3) + " " + str.substring(3);
                System.out.println(modifiedStr);
            }
        }
    }
}

