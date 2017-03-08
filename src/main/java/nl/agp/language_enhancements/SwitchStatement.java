package nl.agp.exam.language_enhancements;

/**
 * Develop code that uses String objects in the switch statement,
 * binary literals, and numeric literals, including underscores in literals
 */

public class SwitchStatement {

  public String switchUsingString(String selected){
    String awnser;

    switch (selected) {
      case "one": awnser = "one";
        break;
      case "One": awnser = "One";
        break;
      case "tada":
      case "tado": awnser = "tada or tado";
        break;
      default: awnser = "default";
        break;
    }
    return awnser;
  }

  public String switchUsingBinaryLiterals(int selected){
    String awnser;

    switch (selected) {
      case 0b101:
        awnser = "0b101";
        break;
      default:
        awnser = "?";
        break;
    }
    return awnser;
  }

  public void switchUsingNumericLiterals(){
  }


}
