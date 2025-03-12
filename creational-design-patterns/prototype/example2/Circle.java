package example2;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        System.out.println("circle equals is called");
        if (!(object2 instanceof Circle shape2) || !super.equals(object2)) return false;
        return shape2.radius == radius;
    }
}
