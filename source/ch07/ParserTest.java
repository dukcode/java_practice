// 07-25 ParserTest.java

class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.XML");
        parser = ParserManager.getParser("HTML");
        parser.parse("document.HTML");
    }
}

class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed.");
    }
}
