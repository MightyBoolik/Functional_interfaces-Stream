package generics;

public class Calculator {

    public static <T extends Number> T sum(T t, T v) {
        if (t instanceof Integer) {
            Integer result = (Integer)t + (Integer)v;
            return (T) result;
        }
        if (t instanceof Long) {
            Long result = (Long)t + (Long)v;
            return (T) result;
        }
        if (t instanceof Float) {
            Float result = (Float)t + (Float)v;
            return (T) result;
        } else {
            Double result = (Double)t + (Double)v;
            return (T) result;
        }
    }

    public static <T extends Number> T substraction(T t, T v) {
        if (t instanceof Integer) {
            Integer result = (Integer)t - (Integer)v;
            return (T) result;
        }
        if (t instanceof Long) {
            Long result = (Long)t - (Long)v;
            return (T) result;
        }
        if (t instanceof Float) {
            Float result = (Float)t - (Float)v;
            return (T) result;
        } else {
            Double result = (Double)t - (Double)v;
            return (T) result;
        }
    }

    public static <T extends Number, V extends Number> T multiply(T t, T v) {
        if (t instanceof Integer) {
            Integer result = (Integer)t * (Integer)v;
            return (T) result;
        }
        if (t instanceof Long) {
            Long result = (Long)t * (Long)v;
            return (T) result;
        }
        if (t instanceof Float) {
            Float result = (Float)t * (Float)v;
            return (T) result;
        } else {
            Double result = (Double)t * (Double)v;
            return (T) result;
        }
    }

    public static <T extends Number, V extends Number> T divide(T t, V v) {
        if (t instanceof Integer) {
            Integer result = (Integer)t / (Integer)v;
            return (T) result;
        }
        if (t instanceof Long) {
            Long result = (Long)t / (Long)v;
            return (T) result;
        }
        if (t instanceof Float) {
            Float result = (Float)t / (Float)v;
            return (T) result;
        } else {
            Double result = (Double)t / (Double)v;
            return (T) result;
        }
    }
}
