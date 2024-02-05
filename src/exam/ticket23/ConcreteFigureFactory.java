package exam.ticket23;

class ConcreteFigureFactory implements IFigureFactory {
    @Override
    public Circle createCircle() {
        return new Circle();
    }

    @Override
    public Rectangle createRectangle() {
        return new Rectangle();
    }
}

