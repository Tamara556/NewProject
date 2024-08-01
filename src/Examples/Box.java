package Examples;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double width, double height, double depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
}

