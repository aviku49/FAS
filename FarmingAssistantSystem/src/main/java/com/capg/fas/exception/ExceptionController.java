package com.capg.fas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	
		
		  @ExceptionHandler({  InvalidComplaintDetailsException.class }) public ResponseEntity<String> complaintHandler() { // controller level exp-handling
		  System.err.println("invalid");
		  return new ResponseEntity<String>("Invalid ComplaintDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }
		  
		 
		  @ExceptionHandler({ InvalidFarmerDetailsException.class }) public ResponseEntity<String> farmerHandler() { // controller level exp-handling
			  System.err.println("invalid");
			  return new ResponseEntity<String>("Invalid FarmerDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }
		  
          @ExceptionHandler({ InvalidOfferDetailsException.class }) public ResponseEntity<String> offerHandler() { // controller level exp-handling
			  System.err.println("invalid");
			  return new ResponseEntity<String>("Invalid offerDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }
		 
          @ExceptionHandler({ InvalidPostAdvertisementException.class }) public ResponseEntity<String> postHandler() { // controller level exp-handling
			  System.err.println("invalid");
			  return new ResponseEntity<String>("Invalid postDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }

          @ExceptionHandler({ InvalidRetailerDetailsException.class }) public ResponseEntity<String> retailerHandler() { // controller level exp-handling
			  System.err.println("invalid");
			  return new ResponseEntity<String>("Invalid retailerDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }

          @ExceptionHandler({ InvalidSupplierDetailsException.class }) public ResponseEntity<String> supplierHandler() { // controller level exp-handling
			  System.err.println("invalid");
			  return new ResponseEntity<String>("Invalid supplierrDetails Inputs from GlobalExp Handler" ,HttpStatus.NOT_ACCEPTABLE); }


}
