package modul;

public class Lock {


    private final int[] mass;

    public Lock(int[] array) {
        mass = array;
    }

    public int[] getInputTableArray() {
        return (mass == null) ? null : mass.clone();
    }
}

