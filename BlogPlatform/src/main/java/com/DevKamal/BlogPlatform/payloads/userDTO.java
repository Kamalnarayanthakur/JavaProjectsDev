package com.DevKamal.BlogPlatform.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class userDTO {

	private long id;
	private String Name;
	private String email;
	private String password;
}
