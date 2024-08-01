package Examples;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(3, 4, 7);
        mybox2.setDim(5, 5, 5);
        vol = mybox1.volume();
        System.out.println("vol; " + vol);
        vol = mybox2.volume();
        System.out.println("vol: " + vol);
    }
}
