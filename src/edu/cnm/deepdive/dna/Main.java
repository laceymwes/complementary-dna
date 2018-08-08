package edu.cnm.deepdive.dna;

public class Main {

  public static void main(String[] args) {
    System.out.println(complement(args[0]));
  }

  public static String complement(String sequence) {
    if (sequence.length() == 0) {
      return sequence;
    }
    StringBuilder builder = new StringBuilder(sequence);
    for (int i = 0; i < builder.length(); i++) {
      if (builder.charAt(i) == 'G' || builder.charAt(i) == 'g') {
        builder.setCharAt(i, (char)(builder.charAt(i) - 4));
        continue;
      }
      if (builder.charAt(i) == 'C' || builder.charAt(i) == 'c') {
        builder.setCharAt(i, (char)(builder.charAt(i) + 4));
      }
      if (builder.charAt(i) == 'A' || builder.charAt(i) == 'a') {
        builder.setCharAt(i, (char)(builder.charAt(i) + 19));
        continue;
      }
      if (builder.charAt(i) == 'T' || builder.charAt(i) == 't') {
        builder.setCharAt(i, (char)(builder.charAt(i) - 19));
      }
    }
    return builder.toString();
  }
}
