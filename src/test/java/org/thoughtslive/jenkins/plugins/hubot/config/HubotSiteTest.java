package org.thoughtslive.jenkins.plugins.hubot.config;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.nullable;

import java.net.URL;

import org.junit.Before;

public class HubotSiteTest {

  private HubotSite hubotSite;

  @Before
    public void setUp() throws Exception {
      hubotSite = new HubotSite(false, "Hubot Local", 
        new URL("http://localhost:9999"), "hubot-test-private", "", true, false, null);
   }

  @Test
  public void test() throws Exception {
    HubotSite.DescriptorImpl descriptor = new HubotSite.DescriptorImpl();
    descriptor.doValidate(null, "Hubot Local", "http://localhost:8080",
    "hubot-test-private", "", false);

    System.out.println("done!");
  }
}








