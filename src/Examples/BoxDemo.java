package Examples;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.depth = 3;
        mybox1.height = 7;
        mybox1.width = 5;
        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("my box 1; " + vol);
        mybox2.width = 10;
        mybox2.depth = 8;
        mybox2.height = 2;
        vol = mybox2.depth * mybox2.width * mybox2.height;
        System.out.println("my box 2; " + vol);
    }
}
