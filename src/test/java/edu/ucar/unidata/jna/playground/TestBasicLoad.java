package edu.ucar.unidata.jna.playground;

import org.junit.jupiter.api.Test;

public class TestBasicLoad {

  @Test
  public void testBasicLoad() {
    org.junit.jupiter.api.Assertions.assertEquals(0, BasicLoad.basicLoad());
  }
}
