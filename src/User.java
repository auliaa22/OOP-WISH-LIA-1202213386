public class User {

    String Name;
    String PhoneNumber;
    
    public void setName (String Name) {
        this.Name = Name;
    }

    public void setPhoneNumber (String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    public void regis() {
        System.out.print("Masukkan Nama: " + Name );
        System.out.print("Masukkan Nomor Hp: " + PhoneNumber );
        System.out.print("Terima Kasih");
    }
    


    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
