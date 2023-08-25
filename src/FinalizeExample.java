public class FinalizeExample {

    public static void main(String[] args) {
        FinalizeExample finalizeExample = new FinalizeExample();
        finalizeExample = null;
        System.out.println("in current finalize class.");
        System.gc();
    }

    /**
     * The finalize() method is called by the garbage collector when an object is no longer reachable and is about to be garbage collected.
     * It is not invoked for classes that have no instances because there are no objects to garbage collect in the first place.
     * @throws Throwable
     */
    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("called finalize method of current object.");
    }
}
