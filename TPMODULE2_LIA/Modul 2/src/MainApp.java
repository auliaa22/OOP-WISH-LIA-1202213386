public class MainApp {
  public static void main(String[] args) {
    Perangkat perangkat = new Perangkat("WD", 1, (float) 1.10);
    perangkat.informasi();

    Handphone hp = new Handphone("SanDisk", 2, (float) 2.25, false);
    hp.informasi();
    hp.telfon(628323343);
    hp.kirimSMS(624354545);
    hp.kirimSMS(625454543, 62323243);

    Laptop laptop = new Laptop("SAMSUNG", 16, (float) 4.2, true);
    laptop.informasi();
    laptop.bukaGame("Genshin Impact");
    laptop.kirimEmail("lia1@mail.com");
    laptop.kirimEmail("lia1@mail.com", "lia2@mail.com");
  }
}