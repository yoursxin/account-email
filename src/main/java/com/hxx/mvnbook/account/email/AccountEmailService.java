package com.hxx.mvnbook.account.email;

/**
 * Hello world!
 *
 */
public interface AccountEmailService
{
	void sendMail(String to, String subject, String htmlText)
		;
}