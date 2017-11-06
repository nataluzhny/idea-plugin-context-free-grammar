/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package codes.rudolph.idea.cfg;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>CFG.flex</tt>
 */
public class CFGLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\10\1\2\2\30\1\2\22\0\1\10\1\0\1\31\1\1\1\21\2\0\1\27\1\11\1\12\1\22"+
    "\2\0\1\5\1\4\1\7\1\32\11\33\1\3\1\23\1\20\1\0\1\17\2\0\6\26\24\34\1\13\1\24"+
    "\1\14\1\0\1\34\1\0\1\46\2\26\1\37\1\41\1\26\2\34\1\42\2\34\1\40\1\35\1\34"+
    "\1\36\1\43\1\34\1\44\1\47\1\45\1\25\5\34\1\15\1\6\1\16\7\0\1\30\32\0\1\10"+
    "\337\0\1\10\177\0\13\10\35\0\2\30\5\0\1\10\57\0\1\10\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\1\1\24\2\1\2\25"+
    "\3\24\1\26\3\0\1\27\2\0\2\24\1\30\1\0"+
    "\2\24\1\0\2\24\1\0\2\24\1\31\1\32\1\33";

  private static int [] zzUnpackAction() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\120\0\120\0\120"+
    "\0\120\0\120\0\120\0\120\0\120\0\120\0\120\0\120"+
    "\0\120\0\120\0\120\0\120\0\120\0\310\0\360\0\u0118"+
    "\0\u0140\0\120\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230"+
    "\0\u0118\0\u0258\0\120\0\u0140\0\u0280\0\u02a8\0\u02d0\0\360"+
    "\0\u02f8\0\u0320\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410"+
    "\0\u0438\0\120\0\360\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\5\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\2\27\1\30\1\5"+
    "\1\31\1\32\1\33\1\27\1\34\4\27\1\35\3\27"+
    "\1\36\1\27\33\3\1\37\14\3\50\0\2\4\1\0"+
    "\45\4\2\0\1\5\5\0\1\5\17\0\1\5\44\0"+
    "\1\40\47\0\2\27\3\0\16\27\24\41\1\42\2\41"+
    "\1\43\20\41\24\44\1\45\4\44\1\43\16\44\32\0"+
    "\2\33\41\0\2\27\3\0\4\27\1\46\11\27\25\0"+
    "\2\27\3\0\3\27\1\47\12\27\25\0\2\27\3\0"+
    "\15\27\1\50\32\0\2\37\42\0\1\51\3\0\2\51"+
    "\3\0\1\51\1\0\1\51\4\0\1\51\1\0\2\41"+
    "\1\0\25\41\1\0\17\41\2\44\1\0\25\44\1\0"+
    "\17\44\25\0\2\27\3\0\5\27\1\52\10\27\25\0"+
    "\2\27\3\0\11\27\1\53\4\27\26\0\1\54\3\0"+
    "\2\54\3\0\1\54\1\0\1\54\4\0\1\54\26\0"+
    "\1\55\1\27\3\0\16\27\25\0\2\27\3\0\4\27"+
    "\1\56\11\27\26\0\1\57\3\0\2\57\3\0\1\57"+
    "\1\0\1\57\4\0\1\57\26\0\2\27\3\0\6\27"+
    "\1\60\7\27\25\0\2\27\3\0\12\27\1\61\3\27"+
    "\26\0\1\62\3\0\2\62\3\0\1\62\1\0\1\62"+
    "\4\0\1\62\26\0\2\27\3\0\7\27\1\63\6\27"+
    "\25\0\2\27\3\0\13\27\1\64\2\27";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1120];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\20\11\4\1\1\11\5\1\3\0"+
    "\1\11\2\0\3\1\1\0\2\1\1\0\2\1\1\0"+
    "\2\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public CFGLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CFGLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 28: break;
          case 2: 
            { return COMMENT;
            }
          case 29: break;
          case 3: 
            { return WHITE_SPACE;
            }
          case 30: break;
          case 4: 
            { return RUL_OP;
            }
          case 31: break;
          case 5: 
            { return SUB_MODULE_OP;
            }
          case 32: break;
          case 6: 
            { return RNG_OP;
            }
          case 33: break;
          case 7: 
            { return ALT_OP;
            }
          case 34: break;
          case 8: 
            { return EXC_OP;
            }
          case 35: break;
          case 9: 
            { return GR_OPEN;
            }
          case 36: break;
          case 10: 
            { return GR_CLOSE;
            }
          case 37: break;
          case 11: 
            { return OPT_OPEN;
            }
          case 38: break;
          case 12: 
            { return OPT_CLOSE;
            }
          case 39: break;
          case 13: 
            { return REP_OPEN;
            }
          case 40: break;
          case 14: 
            { return REP_CLOSE;
            }
          case 41: break;
          case 15: 
            { return REP_MIN_CLOSE;
            }
          case 42: break;
          case 16: 
            { yybegin(NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING); return REP_MAX_OPEN;
            }
          case 43: break;
          case 17: 
            { return REP_DELIM;
            }
          case 44: break;
          case 18: 
            { return INFINITE;
            }
          case 45: break;
          case 19: 
            { return DEFINITION_END;
            }
          case 46: break;
          case 20: 
            { return NAME;
            }
          case 47: break;
          case 21: 
            { return NATURAL_NUMBER;
            }
          case 48: break;
          case 22: 
            { yybegin(YYINITIAL); return NON_ZERO_NATURAL_NUMBER;
            }
          case 49: break;
          case 23: 
            { return STRING;
            }
          case 50: break;
          case 24: 
            { return ALIAS_OP;
            }
          case 51: break;
          case 25: 
            { return UNICODE;
            }
          case 52: break;
          case 26: 
            { return MODULE_DEF;
            }
          case 53: break;
          case 27: 
            { return IMPORT_DEF;
            }
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
