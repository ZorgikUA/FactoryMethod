public class UbuntuWorker extends Factory {

  @Override
  public void render() {
    this.chooseOs().Hello();
  }

  @Override
  public Os chooseOs() {
    return new UbuntuOs();
  }
}
