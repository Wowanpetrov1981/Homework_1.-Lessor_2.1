public class Flower {

    private String title;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String title, String country, double cost, int lifeSpan) {
        this.title = title;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = validOrDefault(title, "белый");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = validOrDefault(country, "Россия");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = Math.abs(cost);
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0.0f ? lifeSpan : 3;
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = Math.abs(lifeSpan = 3);
        }
    }

    private String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
    @Override
    public  String toString () {
        return title + ", страна произхождения - " + country + ", стоимость штуки -  "
                + cost + " рублей, срок стояния - " + lifeSpan + " дней.";
    }
}

