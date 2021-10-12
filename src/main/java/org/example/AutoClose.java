package org.example;

public class AutoClose implements AutoCloseable {
    public static void main(String[] args) {
        try (AutoClose a = new AutoClose()) {
            a.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }

    public void test() {
        System.out.println("test");
    }
}
