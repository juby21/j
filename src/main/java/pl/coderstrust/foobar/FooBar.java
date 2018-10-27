package pl.coderstrust.foobar;

public class FooBar {
    public static void main(String[] args) {
        String foo = "Foo";
        String bar = "Bar";
        String result;
        for (int i = 0; i <= 100; i++) {
            result = "";
            if (i % 3 == 0) {
                result += foo;
            }
            if (i % 5 == 0) {
                result += bar;
            }
            System.out.println(i + " " + result);
        }
    }
}
