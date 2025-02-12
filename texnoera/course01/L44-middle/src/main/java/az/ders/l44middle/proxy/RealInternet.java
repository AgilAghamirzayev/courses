package az.ders.l44middle.proxy;

class RealInternet implements Internet {

  @Override
  public void connectTo(String serverHost) {
    System.out.println("Connecting to " + serverHost);
  }

}