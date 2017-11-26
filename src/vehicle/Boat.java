package vehicle;

public class Boat extends WaterTransport
{
    private String name = "Лодка";

    public String getInfo() {
        return name + " " + super.getGo();
    }
}
