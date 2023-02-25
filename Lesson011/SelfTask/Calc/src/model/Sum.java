package model;

public class Sum extends Model {
    public Sum(){
        super.name = "суммы";
    }

    @Override
    public void setFirstNum(double num) {
        super.firstNum = num;
    }

    @Override
    public void setSecondNum(double num) {
        super.secondNum = num;
    }

    @Override
    public double getResult() {
        return (super.firstNum + super.secondNum);
    }
}
