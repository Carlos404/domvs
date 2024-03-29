package br.com.domvs.handler;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.DefaultResponseErrorHandler;

@ControllerAdvice
public class RestResponseExceptionHandler extends DefaultResponseErrorHandler {
	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		System.out.println("Inside hasError");
		return super.hasError(response);
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		System.out.println("Doing something with status code " + response.getStatusCode());
	}
}
