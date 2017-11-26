package vehicle;

public class Airplane extends AirTransport
{
    private String name = "Самолёт";

    public String getInfo() {
        return name + " " + super.getGo();
    }
}
