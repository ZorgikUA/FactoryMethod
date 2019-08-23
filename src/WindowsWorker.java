public class WindowsWorker extends Factory{
  @Override public void render() {
    this.chooseOs().Hello();
  }

  @Override public Os chooseOs() {
    return new WindowsOs();
  }
}
