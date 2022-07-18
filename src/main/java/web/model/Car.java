package web.model;

public class Car {
    private String name;
    private String series;
    private Double engine;

    public Car(String name, String series, Double engine) {
        this.name = name;
        this.series = series;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }
}
