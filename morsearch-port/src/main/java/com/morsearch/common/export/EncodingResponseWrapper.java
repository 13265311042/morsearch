package com.morsearch.common.export;

/**

 * @author stony.feng

 *

 * To change the template for this generated type comment go to

 * Window - Preferences - Java - Code Style - Code Templates

 */

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * 
 * A response wrapper that takes everything the client would normally output and
 * 
 * saves it in one big character array.
 * 
 */

public class EncodingResponseWrapper extends HttpServletResponseWrapper {

	private boolean isstream = false;

	private ByteArrayOutputStream buffer;

	/**
	 * 
	 * Initializes wrapper.
	 * 
	 * <P>
	 * 
	 * First, this constructor calls the parent constructor. That call is
	 * 
	 * crucial so that the response is stored and thus setHeader, setStatus,
	 * 
	 * addCookie, and so forth work normally.
	 * 
	 * <P>
	 * 
	 * Second, this constructor creates a CharArrayWriter that will be used to
	 * 
	 * accumulate the response.
	 * 
	 */

	public EncodingResponseWrapper(HttpServletResponse response) {

		super(response);

		this.buffer = new ByteArrayOutputStream();

	}

	/**
	 * 
	 * Get a String representation of the entire buffer.
	 * 
	 * <P>
	 * 
	 * Be sure <B>not </B> to call this method multiple times on the same
	 * 
	 * wrapper. The API for CharArrayWriter does not guarantee that it
	 * 
	 * "remembers" the previous value, so the call is likely to make a new
	 * 
	 * String every time.
	 * 
	 */

	public String toString() {

		String str = null;

		try {

			str = (this.buffer.toString("utf-8"));

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}

		return str;

	}

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * 
	 * 
	 * @see javax.servlet.ServletResponse#getOutputStream()
	 * 
	 */

	public ServletOutputStream getOutputStream() throws IOException {

		return new EncodingServletOutputStream(this.buffer);

	}

	class EncodingServletOutputStream extends ServletOutputStream {

		ByteArrayOutputStream buffer;

		public EncodingServletOutputStream(ByteArrayOutputStream outputStream) {

			super();

			this.buffer = outputStream;

		}

		/*
		 * 
		 * (non-Javadoc)
		 * 
		 * 
		 * 
		 * @see java.io.OutputStream#write(int)
		 * 
		 */

		public void write(int aInt) {

			this.buffer.write(aInt);

		}

		/*
		 * 
		 * (non-Javadoc)
		 * 
		 * 
		 * 
		 * @see java.io.OutputStream#write(byte[], int, int)
		 * 
		 */

		public void write(byte[] b, int off, int len) throws IOException {

			this.buffer.write(b, off, len);

		}

	/*	@Override
		public boolean isReady() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setWriteListener(WriteListener writeListener) {
			// TODO Auto-generated method stub

		}*/

	}

	public byte[] getBytes() {

		return this.buffer.toByteArray();

	}

	public boolean isIsstream() {
		return this.isstream;
	}

	public void setIsstream(boolean isstream) {
		this.isstream = isstream;
	}

	private boolean firstget = true;

	private PrintWriter writerbuffer = null;

	public PrintWriter getWriter1() throws IOException {

		if (!this.firstget)
			return this.writerbuffer;

		this.firstget = false;

		this.writerbuffer = new PrintWriter(new OutputStreamWriter(this.buffer, "UTF-8"));
		return this.writerbuffer;
	}

	public void flushBuffer1() throws IOException {
		if (this.writerbuffer != null)
			this.writerbuffer.flush();

	}

}