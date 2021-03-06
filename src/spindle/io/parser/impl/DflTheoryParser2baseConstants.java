/**
 * SPINdle (version 2.2.2)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
/* Generated By:JavaCC: Do not edit this line. DflTheoryParser2baseConstants.java */
package spindle.io.parser.impl;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface DflTheoryParser2baseConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WHITE_SPACE = 1;
  /** RegularExpression Id. */
  int COMMENT_BEGIN = 2;
  /** RegularExpression Id. */
  int COMMENT_TEXT = 3;
  /** RegularExpression Id. */
  int COMMENT_TRUNCATED = 4;
  /** RegularExpression Id. */
  int SPACER = 5;
  /** RegularExpression Id. */
  int CHARACTER = 6;
  /** RegularExpression Id. */
  int DIGIT = 7;
  /** RegularExpression Id. */
  int LETTER = 8;
  /** RegularExpression Id. */
  int ARG_START = 9;
  /** RegularExpression Id. */
  int ARG_END = 10;
  /** RegularExpression Id. */
  int MODE_START = 11;
  /** RegularExpression Id. */
  int MODE_END = 12;
  /** RegularExpression Id. */
  int TEMPORAL_START = 13;
  /** RegularExpression Id. */
  int TEMPORAL_END = 14;
  /** RegularExpression Id. */
  int LITERAL_FUNCTION = 15;
  /** RegularExpression Id. */
  int RULE_TYPE_FACT = 16;
  /** RegularExpression Id. */
  int RULE_TYPE_STRICT = 17;
  /** RegularExpression Id. */
  int RULE_TYPE_DEFEASIBLE = 18;
  /** RegularExpression Id. */
  int RULE_TYPE_DEFEATER = 19;
  /** RegularExpression Id. */
  int ARGUMENT_SEPARATOR = 20;
  /** RegularExpression Id. */
  int RULE_LABEL_SEPARATOR = 21;
  /** RegularExpression Id. */
  int SET_LITERAL_VARIABLE = 22;
  /** RegularExpression Id. */
  int LITERAL_VARIABLE_DURATION = 23;
  /** RegularExpression Id. */
  int LITERAL_VARIABLE = 24;
  /** RegularExpression Id. */
  int NEG_INF = 25;
  /** RegularExpression Id. */
  int DATE_TIME_STRING = 26;
  /** RegularExpression Id. */
  int ASSIGN = 27;
  /** RegularExpression Id. */
  int NUMBER = 28;
  /** RegularExpression Id. */
  int STRING = 29;
  /** RegularExpression Id. */
  int LITERAL_NAME = 30;
  /** RegularExpression Id. */
  int EOL = 31;
  /** RegularExpression Id. */
  int EQUALS = 32;
  /** RegularExpression Id. */
  int NOT_EQUALS = 33;
  /** RegularExpression Id. */
  int EXCLUDED = 34;
  /** RegularExpression Id. */
  int GREATER_OR_EQUAL = 35;
  /** RegularExpression Id. */
  int LESSER_OR_EQUAL = 36;
  /** RegularExpression Id. */
  int PLUS = 37;
  /** RegularExpression Id. */
  int MINUS = 38;
  /** RegularExpression Id. */
  int MULTIPLY = 39;
  /** RegularExpression Id. */
  int DIVIDE = 40;
  /** RegularExpression Id. */
  int GREATER = 41;
  /** RegularExpression Id. */
  int LESSER = 42;
  /** RegularExpression Id. */
  int DEFINITE_PROVABLE = 43;
  /** RegularExpression Id. */
  int DEFINITE_NOT_PROVABLE = 44;
  /** RegularExpression Id. */
  int DEFEASIBLE_PROVABLE = 45;
  /** RegularExpression Id. */
  int DEFEASIBLE_NOT_PROVABLE = 46;
  /** RegularExpression Id. */
  int LITERAL_VARIABLE_STRING = 47;
  /** RegularExpression Id. */
  int NOT_EOL = 48;
  /** RegularExpression Id. */
  int OTHER = 49;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int X = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<WHITE_SPACE>",
    "\"#\"",
    "<COMMENT_TEXT>",
    "\"\"",
    "<SPACER>",
    "<CHARACTER>",
    "<DIGIT>",
    "<LETTER>",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"$\"",
    "\">>\"",
    "\"->\"",
    "\"=>\"",
    "\"~>\"",
    "\",\"",
    "\":\"",
    "\"set\"",
    "\"@DURATION\"",
    "\"@\"",
    "\"-inf\"",
    "<DATE_TIME_STRING>",
    "\"=\"",
    "<NUMBER>",
    "<STRING>",
    "<LITERAL_NAME>",
    "\"\\n\"",
    "\"==\"",
    "\"!=\"",
    "\"<>\"",
    "\">=\"",
    "\"<=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\">\"",
    "\"<\"",
    "<DEFINITE_PROVABLE>",
    "<DEFINITE_NOT_PROVABLE>",
    "<DEFEASIBLE_PROVABLE>",
    "<DEFEASIBLE_NOT_PROVABLE>",
    "<LITERAL_VARIABLE_STRING>",
    "<NOT_EOL>",
    "<OTHER>",
  };

}
