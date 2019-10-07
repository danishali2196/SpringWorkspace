function validate(frm){
	
	//set vflag to yes if indicating client side validation is dane
	frm.vflag.value="yes";
	
	//set style to error pages
	document.getElementById("cname").innerHTML="";
	document.getElementById("caddrs").innerHTML="";
	document.getElementById("mobileNo").innerHTML="";
	document.getElementById("billAmt").innerHTML="";
		
	//read form data
	var name=frm.cname.value;
	var addrs=frm.caddrs.value;
	var mobileNo=frm.mobileNo.value;
	var billAmt=frm.billAmt.value;
	
	//perform clentside validation
	if(name == ""){
		document.getElementById("cname").innerHTML="Customer name is required";
		frm.cname.focus();
		return false;
	}
	
	if(addrs == ""){
		document.getElementById("caddrs").innerHTML="Customer Address is required";
		frm.caddrs.focus();
		return false;
	}
	else if(addrs <=3 || addrs >= 10){
		document.getElementById("caddrs").innerHTML="Customer Address is must be under 3 to 5 character";
		frm.caddrs.focus();
		return false;
	}
	
	if(mobileNo == ""){
		document.getElementById("mobileNo").innerHTML="Customer Mobile Number is required";
		frm.caddrs.focus();
		return false;
	}
	else if(mobileNo != 10){
		document.getElementById("mobileNo").innerHTML="Customer Mobile number  is must be 10 digits";
		frm.caddrs.focus();
		return false;
	}
	
	if(billAmt == ""){
		document.getElementById("billAmt").innerHTML="Customer Bill Amount is required";
		frm.caddrs.focus();
		return false;
	}
	
	return true;
	
}