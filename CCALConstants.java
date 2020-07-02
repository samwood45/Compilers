/* Generated By:JavaCC: Do not edit this line. CCALConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface CCALConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int VARIABLE = 11;
  /** RegularExpression Id. */
  int CONSTANT = 12;
  /** RegularExpression Id. */
  int RETURN = 13;
  /** RegularExpression Id. */
  int INTEGER = 14;
  /** RegularExpression Id. */
  int BOOLEAN = 15;
  /** RegularExpression Id. */
  int VOID = 16;
  /** RegularExpression Id. */
  int MAIN = 17;
  /** RegularExpression Id. */
  int IF = 18;
  /** RegularExpression Id. */
  int ELSE = 19;
  /** RegularExpression Id. */
  int TRUE = 20;
  /** RegularExpression Id. */
  int FALSE = 21;
  /** RegularExpression Id. */
  int WHILE = 22;
  /** RegularExpression Id. */
  int SKIP_TOKEN = 23;
  /** RegularExpression Id. */
  int COMMA = 24;
  /** RegularExpression Id. */
  int SEMICOLON = 25;
  /** RegularExpression Id. */
  int COLON = 26;
  /** RegularExpression Id. */
  int ASSIGN = 27;
  /** RegularExpression Id. */
  int LEFTCBRACKET = 28;
  /** RegularExpression Id. */
  int RIGHTCBRACKET = 29;
  /** RegularExpression Id. */
  int LEFTBRACKET = 30;
  /** RegularExpression Id. */
  int RIGHTBRACKET = 31;
  /** RegularExpression Id. */
  int PLUS = 32;
  /** RegularExpression Id. */
  int MINUS = 33;
  /** RegularExpression Id. */
  int NEGATE = 34;
  /** RegularExpression Id. */
  int OR = 35;
  /** RegularExpression Id. */
  int AND = 36;
  /** RegularExpression Id. */
  int ISEQUALTO = 37;
  /** RegularExpression Id. */
  int NOTEQUALS = 38;
  /** RegularExpression Id. */
  int LT = 39;
  /** RegularExpression Id. */
  int LT_EQ = 40;
  /** RegularExpression Id. */
  int GT = 41;
  /** RegularExpression Id. */
  int GT_EQ = 42;
  /** RegularExpression Id. */
  int NUM = 43;
  /** RegularExpression Id. */
  int DIGIT = 44;
  /** RegularExpression Id. */
  int LETTER = 45;
  /** RegularExpression Id. */
  int ID = 46;
  /** RegularExpression Id. */
  int OTHER = 47;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_COMMENT = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\t\"",
    "<token of kind 6>",
    "\"/*\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 10>",
    "\"var\"",
    "\"const\"",
    "\"return\"",
    "\"integer\"",
    "\"boolean\"",
    "\"void\"",
    "\"main\"",
    "\"if\"",
    "\"else\"",
    "\"true\"",
    "\"false\"",
    "\"while\"",
    "\"skip\"",
    "\",\"",
    "\";\"",
    "\":\"",
    "\"=\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"+\"",
    "\"-\"",
    "\"~\"",
    "\"||\"",
    "\"&&\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "<NUM>",
    "<DIGIT>",
    "<LETTER>",
    "<ID>",
    "<OTHER>",
  };

}