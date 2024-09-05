package Урок_14_аттестация.Operations;

// import Exceptions.DivisionByZero;

public class Divide extends Model {
    
    @Override
    public Double result() /*throws DivisionByZero*/ {
        // if (y == 0)
        //      DivisionByZero("Нельзя делить на 0");
        return x / y;
    }

    @Override
    public void setX(Double value) {
        super.x = value;
    }

    @Override
    public void setY(Double value) {
        super.y = value;
    }
}
