/**
 * This class file was automatically generated by jASN1 v1.8.3-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.tagging_test;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class ChoiceOfRenamedUntaggedSequence implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerInteger myInteger = null;
	private RenamedUntaggedSequence renamedUntaggedSequence = null;
	private BerBoolean myBoolean = null;
	
	public ChoiceOfRenamedUntaggedSequence() {
	}

	public ChoiceOfRenamedUntaggedSequence(byte[] code) {
		this.code = code;
	}

	public void setMyInteger(BerInteger myInteger) {
		this.myInteger = myInteger;
	}

	public BerInteger getMyInteger() {
		return myInteger;
	}

	public void setRenamedUntaggedSequence(RenamedUntaggedSequence renamedUntaggedSequence) {
		this.renamedUntaggedSequence = renamedUntaggedSequence;
	}

	public RenamedUntaggedSequence getRenamedUntaggedSequence() {
		return renamedUntaggedSequence;
	}

	public void setMyBoolean(BerBoolean myBoolean) {
		this.myBoolean = myBoolean;
	}

	public BerBoolean getMyBoolean() {
		return myBoolean;
	}

	public int encode(BerByteArrayOutputStream os) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (myBoolean != null) {
			codeLength += myBoolean.encode(os, true);
			return codeLength;
		}
		
		if (renamedUntaggedSequence != null) {
			codeLength += renamedUntaggedSequence.encode(os, true);
			return codeLength;
		}
		
		if (myInteger != null) {
			codeLength += myInteger.encode(os, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerInteger.tag)) {
			myInteger = new BerInteger();
			codeLength += myInteger.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(RenamedUntaggedSequence.tag)) {
			renamedUntaggedSequence = new RenamedUntaggedSequence();
			codeLength += renamedUntaggedSequence.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerBoolean.tag)) {
			myBoolean = new BerBoolean();
			codeLength += myBoolean.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (myInteger != null) {
			sb.append("myInteger: ").append(myInteger);
			return;
		}

		if (renamedUntaggedSequence != null) {
			sb.append("renamedUntaggedSequence: ");
			renamedUntaggedSequence.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (myBoolean != null) {
			sb.append("myBoolean: ").append(myBoolean);
			return;
		}

		sb.append("<none>");
	}

}

