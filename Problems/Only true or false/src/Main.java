class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if(b == null) {
            return false;
        } else {
            if(b) {
                return true;
            } else {
                return false;
            }
        }
    }
}