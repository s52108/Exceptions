package exceptions.ue.transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        if (urgent && Math.random() < 0.5) {
            throw new TransporterMalfunctionException();
        }
        System.out.println("Beaming " + person + " from " + from + " to " + to + "...");
    }

    public void shutdown(){
        System.out.println("Shutdown in progress");
    }
}
