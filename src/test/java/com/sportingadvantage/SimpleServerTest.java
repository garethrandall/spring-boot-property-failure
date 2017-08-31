package com.sportingadvantage;

import org.junit.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SimpleServerTest {

    /**
     * Expect to see an exception as below.
     * Note the strange curly bracket in: "localhost}:5672"
     *
     Caused by: org.springframework.beans.PropertyBatchUpdateException; nested PropertyAccessExceptions (1) are:
     PropertyAccessException 1: org.springframework.beans.MethodInvocationException: Property 'addresses' threw exception; nested exception is java.lang.NumberFormatException: For input string: "localhost}:5672"
     */
    @Test
    public void testStartsUp() {
        String[] args = new String[]{"FirstArgument"};

        new SpringApplicationBuilder(SimpleServer.class).web(false).run(args);
    }
}
