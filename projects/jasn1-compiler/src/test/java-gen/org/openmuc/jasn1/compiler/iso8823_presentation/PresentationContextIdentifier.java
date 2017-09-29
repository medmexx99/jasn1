/**
 * This class file was automatically generated by jASN1 v1.8.3-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.iso8823_presentation;

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


public class PresentationContextIdentifier extends BerInteger {

	private static final long serialVersionUID = 1L;

	public PresentationContextIdentifier() {
	}

	public PresentationContextIdentifier(byte[] code) {
		super(code);
	}

	public PresentationContextIdentifier(BigInteger value) {
		super(value);
	}

	public PresentationContextIdentifier(long value) {
		super(value);
	}

}
