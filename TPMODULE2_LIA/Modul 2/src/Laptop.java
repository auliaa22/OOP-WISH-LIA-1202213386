public class Laptop extends Perangkat {
  protected boolean webcam;
  protected String checkWebCam;

  public Laptop(String drive, int ram, float processor, boolean webcam) {
    super(drive, ram, processor);
    this.webcam = webcam;
  }

  public void informasi() {
    checkWebCam = (webcam) ? "" : " TIDAK";
    System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram
        + " GB dan Processor secepat " + processor + " GHz. Selain itu laptop ini" + checkWebCam
        + " memiliki webcam.");
  }

  public void bukaGame(String nama_game) {
    System.out.println("Laptop berhasil membuka game " + nama_game);
  }

  public void kirimEmail(String email) {
    System.out.println("Laptop berhasil mengirim email ke " + email);
  }

  public void kirimEmail(String email1, String email2) {
    System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
  }
}