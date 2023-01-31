public class dz_02 {
    public static void main(String[] args) {
        // Задание 1

        // String str = "Шла Саша по шоссе";
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i)== 'а') count ++;
        // }
        // System.out.println(count);

        //Задание 2

        // String str = "Привет!";
        // String rev = "";
        // String test = "!тевирП";
        // for (int i = str.length()-1; i >=0; i--) {
        //     rev += str.charAt(i);
        // }
        // if (rev.equals(test) == true) {
        //     System.out.println("Строки str и test являются вращением друг друга ");
        // }
        // else {
        //     System.out.println("Строки не являются вращением друг друга");
        // }

        //Задание 3

        // String result = "";
        // String str = "Привет!";
        // int len = str.length();
        // rev(str, len, result);
        // }
    // public static void rev(String str, int k, String result) {
        // if (k == 0) {
        //     System.out.println(result);
        //     return;
        // }
        // result += str.charAt(k-1);
        // rev(str, k-1, result);

        // Задание 4

        // int a = 3;
        // int b = 56;
        // StringBuilder sum = new StringBuilder();
        // sum
        //         .append(a)
        //         .append(" + ")
        //         .append(b)
        //         .append(" = ")
        //         .append(a+b);
        // System.out.println(sum);
        // StringBuilder dif = new StringBuilder();
        // dif
        //         .append(a)
        //         .append(" - ")
        //         .append(b)
        //         .append(" = ")
        //         .append(a-b);
        // System.out.println(dif);
        // StringBuilder mult = new StringBuilder();
        // mult
        //         .append(a)
        //         .append(" * ")
        //         .append(b)
        //         .append(" = ")
        //         .append(a*b);
        // System.out.println(mult);
        // StringBuilder del = new StringBuilder();
        // del
        //         .append(a)
        //         .append(" / ")
        //         .append(b)
        //         .append(" = ")
        //         .append((float) a/b);
        // System.out.println(del);
        // System.out.println();
        // System.out.println(sum.deleteCharAt(7).insert(7, "Равно"));
        // System.out.println(dif.deleteCharAt(7).insert(7, "Равно")); 
        // System.out.println(mult.deleteCharAt(7).insert(7, "Равно")); 
        // System.out.println(del.deleteCharAt(7).insert(7, "Равно"));
        // System.out.println(sum.replace(sum.toString().indexOf("="),sum.toString().indexOf("=")+1, "Равно"));
        // System.out.println(dif.replace(dif.toString().indexOf("="),dif.toString().indexOf("=")+1, "Равно"));
        // System.out.println(mult.replace(mult.toString().indexOf("="),mult.toString().indexOf("=")+1, "Равно"));
        // System.out.println(del.replace(del.toString().indexOf("="),del.toString().indexOf("=")+1, "Равно"));

        // Задание 7

        String str = "";
        for (int index = 0; index <= 10000; index++) {
            str += "=";
        }
        long start = System.currentTimeMillis();
        // System.out.println(str.replaceAll("=", "Равно"));
        str.replaceAll("=", "Равно");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        StringBuilder x = new StringBuilder();
        for (int index = 0; index <= 10000; index++) {
            x.append("=");
        }
        long start1 = System.currentTimeMillis();
        // StringBuilder result2 = x.replace(x.toString().indexOf("="),x.length(), "Равно");
        // for (int i = 0; i <= 10000; i++) {
        //     x.replace(i,i, "Равно");
        // }
        // System.out.println(x);
        // System.out.println(x.replace(x.toString().indexOf("="),x.length(), "Равно"));
        long end2 = System.currentTimeMillis();
        System.out.println((end2-start1));

    }    
}

