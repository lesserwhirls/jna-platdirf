package edu.ucar.unidata.jna.playground;

import edu.ucar.unidata.compression.jna.libaec.LibAec;

import edu.ucar.unidata.compression.jna.libaec.LibAec.AecStream;

public final class BasicLoad {

  public static int basicLoad() {
    System.out.println("Running main");
    AecStream aecStreamDecode = AecStream.create(32, 16, 12,
        LibAec.AEC_OK);
    System.out.printf("AecStream bits per sample: %d\n%n", aecStreamDecode.bits_per_sample);
    return 0;
  }
}
