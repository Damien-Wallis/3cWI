package at.dam.oo.phone;

public class Main {
    public static void main(String[] args) {
        //Objekte
        PhoneFile file = new PhoneFile("jpg", 4, "schule");
        SDCard card = new SDCard(30);

        //Befehle
        System.out.println(file.getInfo(file));
        card.saveFile(file);
        card.getAllFiles();
    }
}
