public class FindAndReplace {

  public String findAndReplace(String originalString, String doesItContain, String replaceWith){
    originalString = originalString.toLowerCase();
    doesItContain = doesItContain.toLowerCase();
    String finalOutput = "";
    if (originalString.contains(doesItContain)) {
      finalOutput = originalString.replace(doesItContain, replaceWith);
    }
    return finalOutput;
  }

}
