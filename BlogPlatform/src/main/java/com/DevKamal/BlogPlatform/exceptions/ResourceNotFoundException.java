package com.DevKamal.BlogPlatform.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

		String ResourceName;
		String fieldName;
		long fieldvalue;
		public ResourceNotFoundException(String resourceName, String fieldName, long fieldvalue) {
			super(String.format("%s not found with %s : %l", resourceName,  fieldName, getStackTrace()));
			ResourceName = resourceName;
			this.fieldName = fieldName;
			this.fieldvalue = fieldvalue;
		}
}
