package com.nt.beans;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

public class AadharDetails {
	
		private int aadharNo;
		private String name;
		private Date dob;
		private File photo;
		private boolean isValid;
		private char[] favoreteCharcter;
		private char favChar;
		private double[] phone;
		private double accNo;
		private URL twetterAcc;
		private URI linkedIn;
		public void setAadharNo(int aadharNo) {
			this.aadharNo = aadharNo;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public void setPhoto(File photo) {
			this.photo = photo;
		}
		public void setIsValid(boolean isValid) {
			this.isValid = isValid;
		}
		public void setFavoreteCharcter(char[] favoreteCharcter) {
			this.favoreteCharcter = favoreteCharcter;
		}
		public void setFavChar(char favChar) {
			this.favChar = favChar;
		}
		public void setPhone(double[] phone) {
			this.phone = phone;
		}
		public void setAccNo(double accNo) {
			this.accNo = accNo;
		}
		public void setTwetterAcc(URL twetterAcc) {
			this.twetterAcc = twetterAcc;
		}
		public void setLinkedIn(URI linkedIn) {
			this.linkedIn = linkedIn;
		}
		@Override
		public String toString() {
			return "AadharDetails [aadharNo=" + aadharNo + ", name=" + name + ", dob=" + dob + ", photo=" + photo
					+ ", isValid=" + isValid + ", favoreteCharcter=" + Arrays.toString(favoreteCharcter) + ", favChar="
					+ favChar + ", phone=" + Arrays.toString(phone) + ", accNo=" + accNo + ", twetterAcc=" + twetterAcc
					+ ", linkedIn=" + linkedIn + "]";
		}
		
		

}
