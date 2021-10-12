package org.example.fuc;

import java.util.function.Supplier;

public class MySupplier<T> {
    public static <T> T testSupplier(Supplier<T> supplier){
        return supplier.get();
    }
}
