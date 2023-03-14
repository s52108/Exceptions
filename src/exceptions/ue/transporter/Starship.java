package exceptions.ue.transporter;

public class Starship {
    private String name;
    private Transporter transporter;

    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }


    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, name, true);
        } catch (TransporterMalfunctionException e) {
            System.out.println("Beam transport failed: " + e.getMessage());
        } finally {
            transporter.shutdown();
        }
    }

    public String getName() {
        return name;
    }

}
