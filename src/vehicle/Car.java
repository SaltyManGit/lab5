package vehicle;

public class Car extends GroundTransport implements Cloneable
{
    private String name = "Машина";

    public String getInfo() {
        return name + " " + super.getGo();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (null == obj) {return false;}
        if (getClass() != obj.getClass()){return false;}
        Car car = (Car)obj;
        if (name != car.name) {return false;}
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return 5 + name.hashCode();
    }

    protected void finalize() throws Throwable{
        try {
            System.out.println("Удаление ресурсов " + name);
        } finally {
            super.finalize();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Car)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw  new InternalError();
        }
    }
}
