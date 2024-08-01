package Examples;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.height = 10;
        mybox.width = 4;
        mybox.depth = 3;
        double vol;
        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("vol " + vol);
    }
}
