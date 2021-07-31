import java.util.Random;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
   public class Dosya {
    public String getRandomElement(List<String> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
      }
      public static void main(String[] args) {
      Scanner oyun = new Scanner(System.in);
      String oyundevam;
      String bitir = "Bitir";
      String devam = "Devam";
      do{
         System.out.print("kim ile oynayacaksın? \nseçenekler: \nOyuncu \nBot \n");
         Scanner options_char = new Scanner(System.in);
         String optionCharAl = options_char.nextLine();
         String option1 = "Oyuncu";
         String option2 = "Bot";
        if(optionCharAl.equals(option1)){
        String attack1 = "Attack";
        String attack2 = "Attack Sword";
        String attack3 = "Attack Bow";
        String defans = "Defans";
         int player1 = 100;
         int player2 = 100;
         int yaycan = 5; 
         int swordcan = 10;
         int defanscan = 5;
         int yaycan2 = 5; 
         int swordcan2 = 10;
         int defanscan2 = 5;
         int attack1hasar = 5;
         int attack2hasar = 10;
         int attack3hasar = 10;
        Scanner name = new Scanner(System.in);
        System.out.println("1. Kullancı ismi gir: ");
        String username1 = name.nextLine();
        Scanner name2 = new Scanner(System.in);
        System.out.println("2. Kullancı ismi gir: ");
        String username2 = name2.nextLine();
        System.out.println("merhaba " + (username1) + "ve" + (username2) + "! \n " + (username1) + " canı: " + (player1) + "\n" + (username2) + "\n canı: " + (player2) + "\n olarak ayarlandı");
        System.out.println("Bilgi: Attack Sword (10 hasar verir defans'a maruz kalırsa 2 can gider hasar veremez canı 10'dur') \n Attack Bow (10 hasar verir defans'a maruz kalırsa canı gitmez hasarda veremez canı 5'dir) \n Attack (canı sınırsızdır 5 hasar verir defans'a maruz kalırsa 1 hasar verir) Defans (Attack dışında her saldırıyı engeller)");
        System.out.println("DİKKAT! Oyuncu moduna özel defans'ın 5 kullanım sınırı vardır!!''");
         do{
           System.out.println("\n\n\n " + (username1) + " sıra sende ne yapacaksın?: Attack Sword, Attack Bow, Attack, Defans");
            Scanner optionalscan = new Scanner(System.in);
        String optional = optionalscan.nextLine();
            System.out.println("\n Sıra sende " + (username2) + " ne yapacaksın?: Attack Sword, Attack Bow, Attack, Defans");
        Scanner optionalscan2 = new Scanner(System.in);
        String optional2 = optionalscan2.nextLine();
             if(defans.equals(optional) && defanscan > 0){
               defanscan = defanscan -1;
            }
            if(defans.equals(optional) && defanscan < 0) {
               System.out.println((username1) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
        if(attack2.equals(optional) && swordcan > 0 && optional2 != defans){
            player2 = player2 - attack2hasar;
            swordcan = swordcan - 1;
            }
            if(attack2.equals(optional) && swordcan < 0 && optional.equals(defans)) {
               System.out.println((username1) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack3.equals(optional) && yaycan > 0 && optional2 != defans){
            player2 = player2 - attack3hasar;
            yaycan = yaycan - 1;
            }
            if(attack3.equals(optional) && yaycan < 0 && optional.equals(defans)) {
               System.out.println((username1) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack1.equals(optional) && optional2 != defans){
            player2 = player2 - attack1hasar;
            }
            if(attack1.equals(optional) && optional2.equals(defans)){
            player2 = player2 + 4;
            }
            if(attack2.equals(optional) && optional2.equals(defans)){
            player2 = player2 + 10;
            swordcan = swordcan - 1;
            }
           if(attack3.equals(optional) && optional2.equals(defans)){
            player2 = player2 + 10;
            yaycan = yaycan + 1;
            }
           
           
            
            //2. kullancı seçimleri
            if(defans.equals(optional2) && defanscan > 0){
               defanscan2 = defanscan2 -1;
            }
            if(defans.equals(optional2) && defanscan2 < 0) {
               System.out.println((username2) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack2.equals(optional2) && swordcan > 0 && optional != defans){
            player1 = player1 - attack2hasar;
            swordcan2 = swordcan2 - 1;
            }
            if(attack2.equals(optional2) && swordcan2 < 0 && optional.equals(defans)) {
               System.out.println((username2) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack3.equals(optional2) && yaycan > 0 && optional != defans){
            player1 = player1 - attack3hasar;
            yaycan2 = yaycan2 - 1;
            }
            if(attack2.equals(optional2) && yaycan2 < 0 && optional.equals(defans)) {
               System.out.println((username2) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack1.equals(optional2) && optional != defans){
            player1 = player1 - attack1hasar;
            }
            if(attack1.equals(optional2) && optional.equals(defans)){
            player1 = player1 + 4;
            }
             if(attack2.equals(optional) && optional2.equals(defans)){
            player1 = player1 + 10;
            swordcan2 = swordcan2 - 1;
            }
           if(attack3.equals(optional) && optional2.equals(defans)){
            player1 = player1 + 10;
            yaycan2 = yaycan2 + 1;
            }

            System.out.println((username1) + " canı kaldı: " + (player1) + "\n" + (username2) + " canı kaldı: " + (player2));
         }while(player1 != 0 || player2 != 0);
         if(player1 == 0){
            System.out.println((username1) + "kazandı!");
         }
         if(player2 == 0){
            System.out.println((username2) + "kazandı!");
         }
}  
        if(optionCharAl.equals(option2)){
      List<String> list = new ArrayList<>();
        list.add("Defans");
        list.add("Attack");
        list.add("Attack Sword");
        list.add("Attack Bow");
        Dosya obj = new Dosya();
        Scanner name = new Scanner(System.in);
        System.out.println("Kullancı ismi gir: ");
        String username = name.nextLine();        
        String attack1 = "Attack";
        String attack2 = "Attack Sword";
        String attack3 = "Attack Bow";
        String defans = "Defans";
         //canlar
        int charmy = 100;
        int charbot = 100;
        int yaycan = 5; 
        int swordcan = 10;
        int yaycan2 = 5; 
         int swordcan2 = 10;
        //hasarlar
        int attack1hasar = 5;
        int attack2hasar = 10;
        int attack3hasar = 10;
         
        System.out.println("merhaba " + (username) + "! \n senin canın " + (charmy) + "\ndüşmanın canı " + (charbot) + "\n olarak ayarlandı");
        System.out.println("Bilgi: Attack Sword (10 hasar verir defans'a maruz kalırsa 2 can gider hasar veremez canı 10'dur') \n Attack Bow (10 hasar verir defans'a maruz kalırsa canı gitmez hasarda veremez canı 5'dir) \n Attack (canı sınırsızdır 5 hasar verir defans'a maruz kalırsa 1 hasar verir) Defans (Attack dışında her saldırıyı engeller)");
        do{
         System.out.println("\n\n\n Peki ya napacaksın?: Attack Sword, Attack Bow, Attack, Defans");
        Scanner optionalscan = new Scanner(System.in);
        String optional = optionalscan.nextLine();	
        String botoption = obj.getRandomElement(list);
        //oyuncu seçimleri
        if(attack2.equals(optional) && swordcan > 0 && botoption != defans){
            charbot = charbot - attack2hasar;
            System.out.print("Düşman canı kaldı: " + (charbot));
            swordcan = swordcan - 1;
            }
            if(attack1.equals(botoption) && swordcan2 < 0 && botoption.equals(defans)) {
               System.out.println((username) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack3.equals(optional) && yaycan > 0 && botoption != defans){
            charbot = charbot - attack3hasar;
            yaycan = yaycan - 1;
            }
            
            if(attack3.equals(botoption) && yaycan2 < 0 && botoption.equals(defans)) {
               System.out.println((username) + "Bu saldırıyı yapamazsın \nbu yüzden hasarın sayılmayacak");
            }
            if(attack1.equals(optional) && botoption != defans){
            charbot = charbot - attack1hasar;
            }
            if(attack1.equals(optional) && botoption.equals(defans)){
            charbot = charbot - 1;
            }
            System.out.println("\nBot: " + (botoption));
           
            
            //bot seçimleri
            if(attack2.equals(botoption) && swordcan > 0 && optional != defans){
            charmy = charmy - attack2hasar;
            swordcan = swordcan - 1;
            }
            if(attack3.equals(botoption) && yaycan > 0 && optional != defans){
            charmy = charmy - attack3hasar;
            yaycan = yaycan - 1;
               }
            if(attack1.equals(botoption) && optional != defans){
            charmy = charmy - attack1hasar;
            }
            if(attack1.equals(botoption) && optional.equals(defans)){
            charmy = charmy - 1;
            }
            System.out.println("Senin canın kaldı:" + (charmy) + "\nBotun canı kaldı: " + (charbot));
            
            }while(charmy != 0 || charbot != 0);
         
         if(charmy == 0) {
            System.out.println("\nBot kazandı! (bota artık nasıl yenildiysen)");
         }
         if(charbot == 0){
            System.out.println("\nSen kazandın! (tabi default olarak)");
         }
      }
         
      System.out.println("Oyuna devam etmek ister misin?\n Seçenekler: Devam, Bitir");
      oyundevam = oyun.nextLine();
      }while(oyundevam.equals(bitir));
   }
}
