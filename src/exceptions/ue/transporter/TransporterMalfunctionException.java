package exceptions.ue.transporter;

public class TransporterMalfunctionException extends Exception{
   public TransporterMalfunctionException() {super("Beam transport failed due to urgent mode.");}
}
