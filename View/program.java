package Урок_14_аттестация.View;

import Урок_14_аттестация.Operations.Model;
import Урок_14_аттестация.Presentation.Presenter;

public class program {
    
    public static void main(String[] args) {

        @SuppressWarnings({ "rawtypes", "unchecked" })
        Presenter presenter = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
}
