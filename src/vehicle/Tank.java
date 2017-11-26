package vehicle;

public class Tank extends GroundTransport
{
    private String name = "Танк";

    public String getInfo() {
        return name + " " + super.getGo();
    }
}
