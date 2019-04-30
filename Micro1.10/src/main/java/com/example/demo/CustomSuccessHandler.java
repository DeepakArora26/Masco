/*
 * package com.example.demo;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.ServletException; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.security.core.Authentication; import
 * org.springframework.security.web.authentication.AuthenticationSuccessHandler;
 * import org.springframework.stereotype.Component;
 * 
 * @Component public class CustomSuccessHandler implements
 * AuthenticationSuccessHandler {
 * 
 * @Override public void onAuthenticationSuccess(HttpServletRequest request,
 * HttpServletResponse response, Authentication authentication) throws
 * IOException, ServletException { // TODO Auto-generated method stub
 * response.setStatus(HttpServletResponse.SC_OK);
 * 
 * System.out.println(authentication.getName());
 * 
 * response.sendRedirect("/");
 * 
 * }
 * 
 * }
 */