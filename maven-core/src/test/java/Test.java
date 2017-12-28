import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Test {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("123");
        String uye = "真帅个鸡儿";
        System.out.println(uye);

        final InputStreamReader isr = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        System.out.println(bufferedReader);
    }


   /* public static void main(String[] args) {
        final InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

    }*/

    void greet(String message) {

        try {
            if (message != null) {
                System.out.println("这不是斯巴达");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
