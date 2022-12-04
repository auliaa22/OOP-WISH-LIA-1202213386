public class Handphone extends Perangkat {
  protected boolean fingerprint;
  protected String checkFingerprint;

  public Handphone(String drive, int ram, float processor, boolean fingerprint) {
    super(drive, ram, processor);
    this.fingerprint = fingerprint;
  }

  public void informasi() {
    checkFingerprint = (fingerprint) ? "" : " TIDAK";
    System.out.println(
        "Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat "
            + processor + " GHz. Selain itu Handphone ini" + checkFingerprint + " memiliki fingerprint.");
  }

  public void telfon(int no_hp) {
    System.out.println("Handphpne ini berhasil menyambungkan telfon ke No " + no_hp);
  }

  public void kirimSMS(int no_hp) {
    System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
  }

  public void kirimSMS(int no_hp1, int no_hp2) {
    System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan ke No " + no_hp2);
  }
}
