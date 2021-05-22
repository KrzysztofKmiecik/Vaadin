package pl.kmiecik.vaadin.carCatalog.domain;

import java.util.StringJoiner;

public class Car {
    private String marka;
    private String model;

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("marka='" + marka + "'")
                .add("model='" + model + "'")
                .toString();
    }
}
