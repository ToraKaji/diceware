package edu.cnm.deepdive.cryptography;

import java.util.Random;

public class PassphraseGenerator implements ArtifactGenerator{

  private WordSource source;
  private Random rnd;

  public PassphraseGenerator(WordSource source, Random rnd) {
    this.source = source;
    this.rnd = rnd;
  }

  @Override
  public String gernerate(int length) {
    StringBuilder builder = new StringBuilder();
    int size = source.size();
    for(int x = 0;x < length; x++){
      builder
          .append(source.get(rnd.nextInt(size)))
          .append(' ');
//      builder.append(source.get(rnd.nextInt(size)));
//      builder.append(' ');
    }
    return builder.substring(0, builder.length() -1);
  }

}
