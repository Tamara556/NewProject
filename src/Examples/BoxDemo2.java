package Examples;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 4;
        mybox.height = 8;
        mybox.width = 2;
        vol = mybox.volume();
        System.out.println("vol; " + vol);
    }
}
