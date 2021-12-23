package com.samples.javaxsample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("")
public class TestResource {

    @GET
    @Path("/hello-world")
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    /**
     * Get a simple object
     * @return a TestObject
     */
    @GET
    @Path("/test")
    public TestObject getTest() {
        TestObject tmp = new TestObject();
        tmp.setName("<script>alert(1)</script>");
        return tmp;
    }

    /**
     * Get an XML object
     * @return a TestXMLObject
     */
    @GET
    @Path("/test-xml")
    public TestXMLObject getTestXML() {
        TestXMLObject tmp = new TestXMLObject();
        tmp.setName("<script>alert(1)</script>");
        return tmp;
    }

    /**
     * Get an XML object with a "dynamic" name
     * @param payload the name we want to insert
     * @return a TextXMLObject
     */
    @GET
    @Path("/test-xml-name")
    public TestXMLObject getTestXMLMod(@QueryParam("payload") String payload) {
        TestXMLObject tmp = new TestXMLObject();
        tmp.setName(payload);
        return tmp;
    }
}