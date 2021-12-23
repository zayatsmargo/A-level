package com.company.zayats.hw18;

public class Main {
    public static void main(String[] args) {
        Box boxXml = Xml.xml("hwXml.xml");
        System.out.println(boxXml);
        Box boxJson = Json.json("hwJson.json");
        System.out.println(boxJson);
    }
}
