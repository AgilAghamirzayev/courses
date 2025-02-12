package az.ders.l44middle.proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet {
  private final RealInternet realInternet = new RealInternet();
  private static final List<String> blockedSites;

  static {
    blockedSites = new ArrayList<>();
    blockedSites.add("abc.com");
    blockedSites.add("xyz.com");
  }

  @Override
  public void connectTo(String serverHost) {
    if (blockedSites.contains(serverHost.toLowerCase())) {
      throw new RuntimeException("Access Denied to " + serverHost);
    }
    realInternet.connectTo(serverHost);
  }

}