package com.samples.javaxsample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "testXmlObject")
public class TestXMLObject {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
