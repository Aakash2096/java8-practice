@FunctionalInterface
public interface Ipayment {
    // can have only 1 abstract method
    void doPay();

    // can have n number of static methods in functional interfaces
    static void doWork() { }

    static void doNothing() { }

    // can have n number of default methods
    default void doWork1() { }

    default void doNothing1() { }

    // you cannot extend a functional interface
}