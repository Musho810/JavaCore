package lessons.homework8;

public class TestFigureGeometric {
    public static void main(String[] args) {
        FigureGeometric.Cyrcle.perimetr();
        FigureGeometric figureGeometric = new FigureGeometric();
        FigureGeometric.Pentagone pentagon = figureGeometric.new Pentagone();
        figureGeometric.perimetr();
        pentagon.perimetr();
    }

}
