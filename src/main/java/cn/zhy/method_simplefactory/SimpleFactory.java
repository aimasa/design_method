package cn.zhy.method_simplefactory;

public class SimpleFactory {
    public static Calculation createOPeration(String choice) {
        Calculation calculation = null;
        switch (choice) {
        case "+":
            calculation = new AddCal();
            break;
        case "-":
            calculation = new Subtraction();
            break;
        default:
            break;
        }
        return calculation;
    }
}
