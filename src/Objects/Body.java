system class Body {
    private String name;
    private double mass;

    public Body(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getMass() {