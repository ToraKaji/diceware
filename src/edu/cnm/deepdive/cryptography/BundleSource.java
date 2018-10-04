package edu.cnm.deepdive.cryptography;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class BundleSource implements WordSource {

  private ArrayList<String> words;
  public BundleSource(String basname) {
    ResourceBundle bundle = ResourceBundle.getBundle(basname);
    words = new ArrayList<>(
        bundle.keySet().stream()
            .map((s) -> bundle.getString(s))
            .collect(Collectors.toList())
    );
  }
  @Override
  public String get(int i) {
    return words.get(i);
  }

  @Override
  public int size() {
    return words.size();
  }
}
