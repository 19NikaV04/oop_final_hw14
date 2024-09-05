package Урок_14_аттестация.Presentation;

import Урок_14_аттестация.Logging.Log;
import Урок_14_аттестация.Logging.Logtxt;
import Урок_14_аттестация.Operations.Divide;
import Урок_14_аттестация.Operations.Model;
import Урок_14_аттестация.Operations.Multiply;
import Урок_14_аттестация.Operations.Subtract;
import Урок_14_аттестация.Operations.Summarize;
import Урок_14_аттестация.View.UI;

public class Presenter<T extends Model> {
    
    UI v;
    T model;

    /**
     * Конструктор объекта типа Presenter
     * @param v - объект типа UI
     * @param model - объект типа Model
     */
    public Presenter(UI v, T model) {
        this.model = model;
        this.v = v;
    }

    /**
     *  Метод, объединяющий получений значений, выбор операции,  результат и логирование
     */
    public void runOperation() {
        Log log = new Logtxt();
        String txt = "";
        Double x = v.inputDouble.apply("Введите первое число: ");
        Double y = v.inputDouble.apply("Введите второе число: ");
        int choice = v.getChoice();
        switch (choice) {
            case 1: {
                Summarize model = new Summarize();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Subtract model = new Subtract();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 4: {
                Divide model = new Divide();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeFile(txt, "Logging\\Saving.txt");
    }
}
