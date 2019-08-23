public class Main {

  private static Factory os;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  private static void configure() {
    if (System.getProperty("user.name").equals("ytiahnyriadno")) {
      os = new UbuntuWorker();
    } else {
      os = new WindowsWorker();
    }
  }

  private static void runBusinessLogic() {
    os.render();
  }
}
