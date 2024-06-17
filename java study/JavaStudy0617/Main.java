package JavaStudy0617;

public class Main {
  public static void main(String[] args) {
    /*ZooKeeper zookeeper = new ZooKeeper();

    Tiger tiger = new Tiger();
    zookeeper.feed(tiger);
    Lion lion = new Lion();
    zookeeper.feed(lion);*/

    /*  Phone applePhone = new ApplePhone();
      Phone samsungPhone = new SamsungPhone();
      System.out.println(applePhone.call());
      System.out.println(samsungPhone.call());

      System.out.println(applePhone.answerThePhone());
      System.out.println(samsungPhone.answerThePhone());
    */

    /*InterfaceC impleC = new ImpleC();

    InterfaceA interfaceA = impleC;
    interfaceA.methodA();
    System.out.println("===========");
    InterfaceB interfaceB = impleC;
    interfaceB.methodB();
    System.out.println("===========");
    impleC.methodA();
    impleC.methodB();
    impleC.methodC();*/

    /*Car kiaCar = new KiaCar();
    System.out.println(kiaCar.getTier());
    System.out.println(kiaCar.showEngine());
    System.out.println(kiaCar.amountNavi());*/

    ProfileService profileService = new ProfileService();
    profileService.saveProfile(new ProfileMemoryRepository());
    profileService.saveProfile(new ProfileDBRepository());
  }
}
