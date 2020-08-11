class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        public boolean test(int a, int b, int c);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a, b, c) -> a == b || b == c || a == c ? false : true;
}
